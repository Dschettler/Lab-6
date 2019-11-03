package com.mycompany.lab6;

import java.util.Scanner;

public class MonthMain {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the number of a month");
        int monthNumber = keyboard.nextInt();
        Month firstMonth = new Month(monthNumber);
        System.out.println(firstMonth.toString());
        
        System.out.println("Please enter the name of a month");
        String monthName = keyboard.next();
        Month secondMonth = new Month(monthName);
        System.out.println(secondMonth.toString());
        
        if (firstMonth.greaterThan(secondMonth) == true){
            System.out.println(firstMonth.getMonthName() + " Comes After " + secondMonth.getMonthName());
        }
        if (firstMonth.lessThan(secondMonth) == true) {
        System.out.println(firstMonth.getMonthName() + " Comes Before " + secondMonth.getMonthName());
        }
        if (firstMonth.equals(secondMonth) == true){
        System.out.println(firstMonth.getMonthName() + " and " + secondMonth.getMonthName() + " are the Same Month");    
        }
        

    }

}
