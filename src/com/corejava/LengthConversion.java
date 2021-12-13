package com.corejava;

import java.util.Scanner;

public class LengthConversion {
    public static void main(String[] args) {
        System.out.println("*****Length conversion****");
        Scanner s1 = new Scanner(System.in);

        boolean roll = true;
        while(roll){
            System.out.println("select options");
            System.out.println("1 :to convert feet in Inch");
            System.out.println("2: to calculate area");
            int selectedOption = s1.nextInt();
            switch (selectedOption){
                case 1:
                    System.out.println("enter value in feet");
                    double feetValue = s1.nextDouble();
                    System.out.println(" Converted value in Inch is = " + feetValue *12);
                    break;
                case 2:
                    System.out.print("enter length of your plot in Feet = ");
                    double lengthOfPlot = s1.nextDouble();
                    System.out.print("enter width of your plot in Feet = ");
                    double widthOfPlot = s1.nextDouble();
                    double areaOfPlot = widthOfPlot*lengthOfPlot;
                    areaOfPlot = areaOfPlot/10.764;
                    System.out.println("Area of your plot in Meter = " + areaOfPlot);
                    break;

                default:
                    System.out.println("wrong input");
            }
            System.out.println("Want to go further (Y/N) ");
            String enteredValue = s1.next();
            if(enteredValue.equalsIgnoreCase("N")){
                roll = false;
            }

        }
    }
}
