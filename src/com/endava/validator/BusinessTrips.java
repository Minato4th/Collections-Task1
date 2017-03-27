package com.endava.validator;

import com.endava.entities.Employees;
import com.endava.entities.Worker;

import java.time.LocalDateTime;
import java.util.*;

/**
 * 3/27/2017
 */
public class BusinessTrips {
    private Set<Employees> employees;
    private Set<Worker> workers;
    private List<Worker> workersList;
    private Map<String, List<Worker>> visitors;

    public BusinessTrips(){
        this.employees = new TreeSet<>();
        this.workers = new HashSet<>();
        this.visitors = new TreeMap<>();
        this.workersList = new ArrayList<>();
    }

    private void workersReadyForTrip(LocalDateTime startDate, LocalDateTime endDate){

        for (Employees employee : employees) {
            if (isSuitable(employee, startDate, endDate)) {
                workers.add(employee.getWorker());
            }
        }
    }

    private boolean isSuitable(Employees employee, LocalDateTime startDate, LocalDateTime endDate){
        return (employee.getLocalDateTime().compareTo(startDate) >= 0
                && employee.getLocalDateTime().compareTo(endDate) <= 0);
    }

    private void workerCanVisit(){
        for (Worker worker : workers) {
            if (worker.isReadyForTrip()){
                setVisitors(worker);
            }
        }
    }

    private void setVisitors(Worker worker){
        for (String country : worker.getCountries()) {
            workersList = currentArrayOfWorkers(country);
            if (workersList != null){
                workersList.add(worker);
            } else {
                workersList = new ArrayList<>();
                workersList.add(worker);
            }
            visitors.put(country, workersList);
        }
    }

    private List<Worker> currentArrayOfWorkers(String country){
        return visitors.get(country);
    }

    public Map<String, List<Worker>> businessTrips(Set<Employees> employees, LocalDateTime startDate, LocalDateTime endDate){

        if (visitors.size() == 0){
            this.employees = employees;
            workersReadyForTrip(startDate, endDate);
            workerCanVisit();
            visitors = Collections.unmodifiableMap(visitors);
        }

        return visitors;
    }
}
