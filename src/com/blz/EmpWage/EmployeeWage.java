package com.blz.EmpWage;

public class EmployeeWage {
    public static void main(String[] args) {

        int fullDayHr = 8;
        int wagePerHr = 20;
        int dailyWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == 1){
            System.out.println("Employee is present");
            dailyWage = wagePerHr * fullDayHr;
        }
        else {
            System.out.println("Employee is absent");
        }
        System.out.println(" Employee Wage " + dailyWage);
    }
}
