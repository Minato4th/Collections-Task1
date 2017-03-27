package com.endava.service;

/**
 * 3/27/2017
 */
public class Text {

    public final static void menuBase(){
        System.out.println("Please chose what to do :\n"
                + "1. Show current workers \n"
                + "2. Initialize Business Trips \n"
                + "3. Show current Trips \n"
                + "4. Exit");
    }

    public final static void buy(){
        System.out.println("Good Buy!");
    }

    public static final void incorrect(){
        System.out.println("Incorrect command, try again!");
    }

    public static final void date(){
        System.out.println("Please insert date of start and end in format 03.22.2000");
    }
}
