package com.blz.EmpWage;

public class EmployeeWage {
    public static void main(String[] args) {

        int FullTime = 2;
        int HalfTime = 1;
        int fullDayHr = 8;
        int halfDayHr = 4;
        int wagePerHr = 20;
        int dailyWage = 0;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (empCheck) {
            case 1: {
                System.out.println("Employee is Full Day Present");
                empCheck = wagePerHr * fullDayHr;
            }
            break;
            case 2: {
                System.out.println("Employee is Half Day Present");
                empCheck = wagePerHr * halfDayHr;
            }
            break;
            case 3: {
                System.out.println("Employee is absent");
            }
            System.out.println(" Daily Wage of Employee is " + dailyWage);
            System.out.println(" Employee Wage " +dailyWage);
            }
        }
        }
