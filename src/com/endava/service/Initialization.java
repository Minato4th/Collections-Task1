package com.endava.service;

import com.endava.comparator.MyComparator;
import com.endava.entities.Employees;
import com.endava.entities.Worker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

/**
 * 3/27/2017
 */
public class Initialization {

    TreeSet<Employees> employees;

    public Initialization() {
        this.employees = new TreeSet<>(new MyComparator());
    }

    public Set<Employees> initializeEmployers(){

        //1
        employees.add(new Employees(new Worker("Param", "Pampam", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Russia")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1990, 5, 25, 11, 10, 15)));

        //2
        employees.add(new Employees(new Worker("Qwer", "Rewq", 26, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Belorus")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1990, 6, 25, 11, 10, 15)));
        //3
        employees.add(new Employees(new Worker("Fdsa", "Asdf", 27, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Romania")); add(new String("USA"));}}),
                LocalDateTime.of(1990, 5, 30, 11, 10, 15)));
        //4
        employees.add(new Employees(new Worker("Zxcv", "Vcxz", 24, true,
                new ArrayList<String>(){{add(new String("Canada")); add(new String("Russia")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1991, 4, 25, 11, 10, 15)));
        //5
        employees.add(new Employees(new Worker("Uiop", "Poiuy", 25, true,
                new ArrayList<String>(){{add(new String("Japan")); add(new String("Romania")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1990, 5, 24, 11, 10, 15)));
        //6
        employees.add(new Employees(new Worker("Poiuy", "Yuiop", 25, false,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Russia")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1990, 5, 19, 11, 10, 15)));
        //7
        employees.add(new Employees(new Worker("Vcxz", "Zxcv", 25, false,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Russia")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1990, 4, 18, 11, 10, 15)));
        //8
        employees.add(new Employees(new Worker("HJkl", "Lkjh", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Romania")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1990, 10, 14, 11, 10, 15)));
        //9
        employees.add(new Employees(new Worker("Bnm,", "<mnb", 25, true,
                new ArrayList<String>(){{add(new String("Jamaica")); add(new String("Russia")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1990, 6, 15, 11, 10, 15)));
        //10
        employees.add(new Employees(new Worker("Rewq", "Qwer", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("India")); add(new String("Ukraine"));}}),
                LocalDateTime.of(1990, 7, 25, 11, 10, 15)));
        //11
        employees.add(new Employees(new Worker("Fdsa", "Asdf", 25, true,
                new ArrayList<String>(){{add(new String("China")); add(new String("Russia")); add(new String("Romania"));}}),
                LocalDateTime.of(1990, 9, 25, 11, 10, 15)));
        //12
        employees.add(new Employees(new Worker("Vcxz", "Zxcv", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Russia")); add(new String("Australia"));}}),
                LocalDateTime.of(1990, 10, 13, 11, 10, 15)));

        //13
        employees.add(new Employees(new Worker("Wert", "ZTrewcv", 25, true,
                new ArrayList<String>(){{add(new String("China")); add(new String("Russia")); add(new String("Romania"));}}),
                LocalDateTime.of(1990, 10, 16, 11, 10, 15)));

        //14
        employees.add(new Employees(new Worker("Gfds", "Sdfg", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Japan")); add(new String("Russia"));}}),
                LocalDateTime.of(1990, 8, 17, 11, 10, 15)));

        //15
        employees.add(new Employees(new Worker("Bvcx", "Xcvb", 25, true,
                new ArrayList<String>(){{add(new String("Romania")); add(new String("Russia")); add(new String("Italy"));}}),
                LocalDateTime.of(1990, 10, 25, 11, 10, 15)));

        //16
        employees.add(new Employees(new Worker("Trew", "Erty", 25, true,
                new ArrayList<String>(){{add(new String("Romania")); add(new String("Russia")); add(new String("Belarus"));}}),
                LocalDateTime.of(1990, 5, 11, 11, 10, 15)));

        //17
        employees.add(new Employees(new Worker("Sdfg", "Gfds", 25, true,
                new ArrayList<String>(){{add(new String("Romania")); add(new String("Russia")); add(new String("China"));}}),
                LocalDateTime.of(1990, 4, 25, 11, 10, 15)));

        //18
        employees.add(new Employees(new Worker("Xcvb", "Bvcx", 25, true,
                new ArrayList<String>(){{add(new String("Romania")); add(new String("Russia")); add(new String("France"));}}),
                LocalDateTime.of(1990, 3, 9, 11, 10, 15)));

        //19
        employees.add(new Employees(new Worker("Iuyt", "Tyui", 25, true,
                new ArrayList<String>(){{add(new String("Romania")); add(new String("Germany")); add(new String("Australia"));}}),
                LocalDateTime.of(1990, 2, 15, 11, 10, 15)));

        //20
        employees.add(new Employees(new Worker("Kjhg", "Ghjk", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Turkey")); add(new String("Australia"));}}),
                LocalDateTime.of(1990, 9, 12, 11, 10, 15)));

        //21
        employees.add(new Employees(new Worker("Kjhg", "Ghjk", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Turkey")); add(new String("Australia"));}}),
                LocalDateTime.of(1990, 7, 18, 11, 10, 15)));

        //22
        employees.add(new Employees(new Worker("Kjhg", "Ghjk", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Turkey")); add(new String("Australia"));}}),
                LocalDateTime.of(1990, 10, 15, 11, 10, 15)));

        //23
        employees.add(new Employees(new Worker("Kjhg", "Ghjk", 25, true,
                new ArrayList<String>(){{add(new String("Moldova")); add(new String("Turkey")); add(new String("Australia"));}}),
                LocalDateTime.of(1991, 5, 25, 11, 10, 15)));
        return employees;
    }
}
