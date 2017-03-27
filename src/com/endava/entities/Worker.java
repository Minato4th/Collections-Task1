package com.endava.entities;

import java.util.List;

/**
 * 3/27/2017
 */
public class Worker {

    private String firstName;
    private String lastName;
    private int age;
    private boolean readyForTrip;
    List<String> countries;

    public Worker(String firstName, String lastName, int age, boolean readyForTrip, List<String> countries) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.readyForTrip = readyForTrip;
        this.countries = countries;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isReadyForTrip() {
        return readyForTrip;
    }

    public void setReadyForTrip(boolean readyForTrip) {
        this.readyForTrip = readyForTrip;
    }

    public List<String> getCountries() {
        return countries;
    }

    public void setCountries(List<String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", readyForTrip=" + readyForTrip +
                ", countries=" + countries +
                '}';
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Worker)) return false;

        Worker worker = (Worker) o;

        if (age != worker.age) return false;
        if (readyForTrip != worker.readyForTrip) return false;
        if (firstName != null ? !firstName.equals(worker.firstName) : worker.firstName != null) return false;
        if (lastName != null ? !lastName.equals(worker.lastName) : worker.lastName != null) return false;
        return countries != null ? countries.equals(worker.countries) : worker.countries == null;

    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (readyForTrip ? 1 : 0);
        result = 31 * result + (countries != null ? countries.hashCode() : 0);
        return result;
    }
}
