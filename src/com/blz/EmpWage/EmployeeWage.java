package com.blz.EmpWage;

public class EmployeeWage {
    public static void main(String[] args) {

        int FullTime = 2;
        int HalfTime = 1;
        int fullDayHr = 8;
        int halfDayHr = 4;
        int wagePerHr = 20;
        int dailyWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == FullTime){
            fullDayHr = 8;
            System.out.println("Employee is Full Day present");
            dailyWage = wagePerHr * fullDayHr;
            System.out.println("Daily Wage of Employee is " + dailyWage);
        }
        else if (empCheck == HalfTime){
            halfDayHr = 4;
            System.out.println("Employee is Half Day Present");
            dailyWage = wagePerHr * halfDayHr;
            System.out.println("Daily Wage of Employee is " + dailyWage);
        }
        else {

            System.out.println("Employee is absent");;
        }
        System.out.println(" Employee Wage " + dailyWage);
    }
}
