package com.collectionframework;

public class Main {

     public static void main(String[] args) {
     System.out.println("Welcome to employee base computation program ");

     double checkEmployee = Math.floor((Math.random() * 10) % 2);
     if(checkEmployee == 0)
     {
         System.out.println("employee is present");
     }
     else
     {
         System.out.println("employee is absent");
     }
     }
}
