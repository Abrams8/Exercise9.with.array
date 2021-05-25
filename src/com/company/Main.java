package com.company;

public class Main {
    public static void main(String[] args) {
        int day = 28;
        int month = 2;
        int year = 2021;
        int daysInMonths[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 12 && day == daysInMonths[month]) {
            day = 1;
            month = 1;
            year++;
            System.out.println(day + "." + month + "." + year + " New Year!!!");
        } else if (day >= daysInMonths[month] && day <= daysInMonths[month]) {
            day = 1;
            month += 1;
            System.out.println(day + "." + month + "." + year);
        } else if (day < daysInMonths[month]) {
            day++;
            System.out.println(day + "." + month + "." + year);
        } else {
            System.out.println("Такого дня не существует!");
        }
    }
}
