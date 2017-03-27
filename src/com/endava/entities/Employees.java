package com.endava.entities;

import java.time.LocalDateTime;

/**
 * 3/27/2017
 */
public class Employees {
    private Worker worker;
    private LocalDateTime localDateTime;

    public Employees(Worker worker, LocalDateTime localDateTime) {
        this.worker = worker;
        this.localDateTime = localDateTime;
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "worker=" + worker +
                ", localDateTime=" + localDateTime +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employees)) return false;

        Employees employees = (Employees) o;

        if (getWorker() != null ? !getWorker().equals(employees.getWorker()) : employees.getWorker() != null)
            return false;
        return getLocalDateTime() != null ? getLocalDateTime().equals(employees.getLocalDateTime()) : employees.getLocalDateTime() == null;

    }

    @Override
    public int hashCode() {
        int result = getWorker() != null ? getWorker().hashCode() : 0;
        result = 31 * result + (getLocalDateTime() != null ? getLocalDateTime().hashCode() : 0);
        return result;
    }
}
