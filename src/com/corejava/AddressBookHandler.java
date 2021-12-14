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
                    boolean isUpdated = false;
                    System.out.print("Enter user first name to update address book : ");
                    String userNameToUpdate = scanner.next();
                    for(int i = 0; i<addressBookList.size();i++){
                        if(addressBookList.get(i).firstName.equalsIgnoreCase(userNameToUpdate)){
                            System.out.println("Enter your first name  : ");
                            addressBookList.get(i).firstName = scanner.next();
                            System.out.println("Enter your last name  : ");
                            addressBookList.get(i).lastName = scanner.next();
                            System.out.println("Enter your address  : ");
                            addressBookList.get(i).address = scanner.next();
                            System.out.println("Enter your village : ");
                            addressBookList.get(i).village = scanner.next();
                            System.out.println("Enter your city  : ");
                            addressBookList.get(i).city = scanner.next();
                            System.out.println("Enter your state : ");
                            addressBookList.get(i).state = scanner.next();
                            System.out.println("Enter your pin code : ");
                            addressBookList.get(i).pinCode = scanner.nextInt();
                            System.out.println("Contact updated successfully ");
                            isUpdated = true;
                        }
                    }
                    if(!isUpdated){
                        System.out.println("No user found of given name ");
                    }
                    break;
                case 3:
                    System.out.print("Enter user name to delete contact : ");
                    String userNameToDelete = scanner.next();
                    AddressBook remove = null;
                    for(int i =0; i < addressBookList.size() ;i++){
                        if(addressBookList.get(i).firstName.equalsIgnoreCase(userNameToDelete)){
                          remove = addressBookList.remove(i);
                        }
                    }
                    if(remove != null){
                        System.out.println("Contact deleted successfully ");
                    }
                    else{

                        System.out.println("No user found of given name ");
                    }
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
