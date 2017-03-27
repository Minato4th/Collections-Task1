package com.endava.validator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/**
 * 3/27/2017
 */
public class Validator {


    private BufferedReader reader;
    private String string;
    DateTimeFormatter dateTimeFormatter;
    LocalDateTime localDateTime;

    public Validator(){
        this.reader = new BufferedReader(new InputStreamReader(System.in));
        this.dateTimeFormatter = DateTimeFormatter.ofPattern("MM.dd.yyyy HH:mm");
    }

    public String isString(){

        for (int i = 0; i < 3; i++) {
            try {
                this.string = reader.readLine();

                if (string.length() == 0){
                    System.out.println("Please insert data again");
                    i++;
                } else{
                    i = 5;
                }

            } catch (IOException e) {
                System.out.println("Wrong String format, try again");
            }
        }

        return string;
    }

    public int isDigit(){

        for (int j = 0; j < 3; j++) {
            boolean right = true;
            String numS = isString();
            for (int i = 0; i < numS.length(); i++) {
                if (!Character.isDigit(numS.charAt(i))){
                    System.out.println("Wrong number format, please try again");
                    right = false;
                    break;
                }
            }

            if (right) {
                j = 5;
                this.string = numS;
            }
        }

        return Integer.parseInt(this.string);
    }


    public LocalDateTime setDate(){

        for (int i = 0; i < 3; i++) {
            string = isString();
            try {
                localDateTime = LocalDateTime.parse(string + " 12:00", dateTimeFormatter);
                i = 5;
            } catch (DateTimeParseException e){
                System.out.println("Incorrect Date format, try again in format MM.dd.yyyy");
            }
        }

        return localDateTime;
    }

}
