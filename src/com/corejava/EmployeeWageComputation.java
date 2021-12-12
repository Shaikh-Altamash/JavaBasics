package com.corejava;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Computation");
        int wagePerHour = 20;
        int fullDayHour = 8;
        int halfDayWorkHour = 4;
        int currentWorkingDays = 1;
        int salary = 0;
        while(currentWorkingDays<20){
        double employeeCheck = (Math.floor(Math.random()*10)%3);
            switch((int)employeeCheck){
                case 0:
                    System.out.println("Employee is present");
                    salary += wagePerHour*fullDayHour;
                    System.out.println("Employee's till date salary is " + salary);
                    currentWorkingDays ++;
                    break;
                case 1:
                    System.out.println("Employee is Absent");
                    break;
                case 2:
                    System.out.println("Employee is part time present");
                    salary += wagePerHour*halfDayWorkHour;
                    currentWorkingDays ++;
                    System.out.println("Employee's till date salary is " + salary);

                    break;
                default:
                    System.out.println("error");

            }
        }
        System.out.println("Employee total salary is " + salary);
    }
}
