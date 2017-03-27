package com.endava.service;

import com.endava.entities.Employees;
import com.endava.entities.Worker;
import com.endava.validator.BusinessTrips;
import com.endava.validator.Validator;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 3/27/2017
 */
public class Menu {

    Validator validator;
    BusinessTrips businessTrips;
    Initialization initialization;
    Set<Employees> employees;
    int choiceOne;
    DateTimeFormatter formatter;
    private Map<String, List<Worker>> visitors;

    private final int ONE = 1;
    private final int TWO = 2;
    private final int THR = 3;
    private final int FOU = 4;
    private final int FIV = 5;

   public Menu() {
        this.validator = new Validator();
        this.initialization = new Initialization();
        this.employees = initialization.initializeEmployers();
        this.formatter = DateTimeFormatter.ofPattern("MM.dd.yyyy HH:mm");
        this.businessTrips = new BusinessTrips();
    }

    public void mainMenu(){
        for (int i = 0; i < 3; i++) {
            Text.menuBase();
            choiceOne = validator.isDigit();
            i = menuChoice(this.choiceOne, i);
        }
        Text.buy();
    }

    private int menuChoice(int choice, int i){
        if (choice == ONE){
            menuOne();
        } else if (choice == TWO){
            menuTwo();
        } else if (choice == THR){
            menuThr();
        } else if (choice > FOU){
            Text.incorrect();
        }

        if (choice == FOU){
            i = FIV;
        } else if (choice < FOU){
            i--;
        }

        return i;
    }

    private void menuOne(){
        for (Employees employ : employees) {
            System.out.println(employ.getWorker().getFirstName() + " "
                    + employ.getWorker().getLastName() + " "
                    + employ.getLocalDateTime().format(formatter));
        }
    }

    private void menuTwo(){
        Text.date();
        LocalDateTime startDate = validator.setDate();
        LocalDateTime endDate = validator.setDate();

        visitors = businessTrips.businessTrips(employees, startDate, endDate);
    }

    private void menuThr() {
        if (visitors != null) {
            for (Map.Entry<String, List<Worker>> entry : visitors.entrySet()) {
                System.out.println(entry.getKey() + " :");
                for (int i = 0; i < entry.getValue().size(); i++) {
                    System.out.println(i + 1 + " " + entry.getValue().get(i).getFirstName());
                }
                System.out.println();
            }
        }
    }
}
