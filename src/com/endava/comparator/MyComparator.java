package com.endava.comparator;

import com.endava.entities.Employees;

import java.time.LocalDateTime;
import java.util.Comparator;


/**
 * 3/27/2017
 */
public class MyComparator implements Comparator<Employees> {

    @Override
    public int compare(Employees o1, Employees o2) {

        LocalDateTime localDateTime1 = o1.getLocalDateTime();
        LocalDateTime localDateTime2 = o2.getLocalDateTime();

        return localDateTime1.compareTo(localDateTime2);
    }

}
