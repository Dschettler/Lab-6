package com.mycompany.lab6;

public class Month {

    public int monthNumber;

    public Month() {
        this.monthNumber = 1;
    }

    public Month(int monthNumber) {
        if (monthNumber >= 1 && monthNumber <= 12) {
            this.monthNumber = monthNumber;
        } else {
            this.monthNumber = 1;
        }
    }

    public Month(String monthName) {

        String uniformMonth = monthName.toUpperCase();

        if ("JANUARY".equals(uniformMonth)) {
            this.monthNumber = 1;
        }
        if ("FEBRUARY".equals(uniformMonth)) {
            this.monthNumber = 2;
        }
        if ("MARCH".equals(uniformMonth)) {
            this.monthNumber = 3;
        }
        if ("APRIL".equals(uniformMonth)) {
            this.monthNumber = 4;
        }
        if ("MAY".equals(uniformMonth)) {
            this.monthNumber = 5;
        }
        if ("JUNE".equals(uniformMonth)) {
            this.monthNumber = 6;
        }
        if ("JULY".equals(uniformMonth)) {
            this.monthNumber = 7;
        }
        if ("AUGUST".equals(uniformMonth)) {
            this.monthNumber = 8;
        }
        if ("SEPTEMBER".equals(uniformMonth)) {
            this.monthNumber = 9;
        }
        if ("OCTOBER".equals(uniformMonth)) {
            this.monthNumber = 10;
        }
        if ("NOVEMBER".equals(uniformMonth)) {
            this.monthNumber = 11;
        }
        if ("DECEMBER".equals(uniformMonth)) {
            this.monthNumber = 12;
        }

    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12) {
            monthNumber = 1;
        }

        this.monthNumber = monthNumber;
    }

    public String getMonthName() {
        String[] monthNames = new String[12];
        int monthNumber = this.monthNumber;

        monthNames[0] = "January";
        monthNames[1] = "February";
        monthNames[2] = "March";
        monthNames[3] = "April";
        monthNames[4] = "May";
        monthNames[5] = "June";
        monthNames[6] = "July";
        monthNames[7] = "August";
        monthNames[8] = "September";
        monthNames[9] = "October";
        monthNames[10] = "November";
        monthNames[11] = "December";

        String monthName = monthNames[(monthNumber - 1)];
        return monthName;
    }

    @Override
    public String toString() {
        return getMonthName() + " is Month Number " + getMonthNumber();
    }

    public boolean equals(Month differentMonth) {
        boolean isEqual;
        if (this.monthNumber == differentMonth.getMonthNumber()) {
            isEqual = true;
        } else {
            isEqual = false;
        }
        return isEqual;
    }

    public boolean greaterThan(Month differentMonth) {
        boolean isGreater;
        if (this.monthNumber > differentMonth.getMonthNumber()) {
            isGreater = true;
        } else {
            isGreater = false;
        }
        return isGreater;
    }

    public boolean lessThan(Month differentMonth) {
        boolean isLess;
        if (this.monthNumber < differentMonth.getMonthNumber()) {
            isLess = true;
        } else {
            isLess = false;
        }
        return isLess;
    }

}
