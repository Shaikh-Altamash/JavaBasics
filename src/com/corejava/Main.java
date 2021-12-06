package com.corejava;

public class Main {

     public static void main(String[] args) {
          System.out.println("Welcome to employee base computation program ");
          int wagePerHour = 20;
          int fullDayHour = 8;
          int halfDayHour = 4;
          int totalWorkingDayInMonth = 20;
          int workingDays = 0;
          int monthlySalary = 0;
          while(workingDays < totalWorkingDayInMonth)
          {
               double checkEmployee =  Math.floor((Math.random() * 10) % 3);
               switch ((int) checkEmployee)
               {
                    case 0:
                         System.out.println("Employee is present full day");
                         System.out.println("Employee wage is " + wagePerHour*fullDayHour );
                         workingDays ++;
                         monthlySalary += wagePerHour*fullDayHour;
                         break;

                    case 1:
                         System.out.println("Employee is present half day");
                         System.out.println("Employee wage is " + wagePerHour*halfDayHour);
                         workingDays ++;
                         monthlySalary += wagePerHour*halfDayHour;
                         break;
                    case 2:
                         System.out.println("employee is absent");
                         break;
                    default:
                         System.out.println("exception caught");
               }
          }

          System.out.println("monthly salary is" + monthlySalary);

     }
}
