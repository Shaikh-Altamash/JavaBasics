package com.corejava;

public class AddressBook {
    public String firstName;
    public String lastName;
    public String address;
    public String village;
    public String city;
    public String state;
    public int pinCode;

    @Override
    public String toString() {
        return "AddressBook{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", village='" + village + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}

