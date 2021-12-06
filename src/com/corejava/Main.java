package com.corejava;

public class Main {

     public static void main(String[] args) {
     System.out.println("Welcome to employee base computation program ");
     int wagePerHour = 20;
     int fullDayHour = 8;
     int halfDayHour = 4;
     double checkEmployee =  Math.floor((Math.random() * 10) % 3);
     switch ((int) checkEmployee)
     {
          case 0:
               System.out.println("Employee is present full day");
               System.out.println("Employee wage is " + wagePerHour*fullDayHour );
          break;

          case 1:
               System.out.println("Employee is present half day");
               System.out.println("Employee wage is " + wagePerHour*halfDayHour);
          break;
          case 2:
               System.out.println("employee is absent");
               break;
          default:
               System.out.println("exception caught");
     }
     }
}
