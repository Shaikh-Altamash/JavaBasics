package com.corejava;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookHandler {
    public static void main(String[] args) {
        ArrayList<AddressBook> addressBookList = new ArrayList<>();
        boolean roll = true;
        while (roll) {
            System.out.println("Welcome to address book list");
            System.out.println("1: Add Contact \n2: Update Contact \n3: Delete Contact \n4: Show address book \n5 :Log out");
            Scanner scanner = new Scanner(System.in);
            Byte UserInput = scanner.nextByte();
            switch (UserInput) {
                case 1:
                    AddressBook addressBook = new AddressBook();
                    System.out.println("Enter your first name  : ");
                    addressBook.firstName = scanner.next();
                    System.out.println("Enter your last name  : ");
                    addressBook.lastName = scanner.next();
                    System.out.println("Enter your address  : ");
                    addressBook.address = scanner.next();
                    System.out.println("Enter your village : ");
                    addressBook.village = scanner.next();
                    System.out.println("Enter your city  : ");
                    addressBook.city = scanner.next();
                    System.out.println("Enter your state : ");
                    addressBook.state = scanner.next();
                    System.out.println("Enter your pin code : ");
                    addressBook.pinCode = scanner.nextInt();
                    addressBookList.add(addressBook);
                    System.out.println("Contact added successfully");

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("The contacts you have in your address book");
                    addressBookList.forEach(System.out::println);
                    break;
                case 5:
                    roll = false;
                    break;
                default:
                    System.out.println("Wrong input");

            }
        }
    }
}
