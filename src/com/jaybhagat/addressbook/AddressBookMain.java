package com.jaybhagat.addressbook;

/*
 * class for the message "Welcome to the Address Book Program" 
 * @author com.jaybhagat
 */

import java.util.Scanner;

public class AddressBookMain {
	String firstName, lastName, address, city, state, email;
    long phoneNumber, zipCode;

    public AddressBookMain(String firstName, String lastName, String address, String city, String state, String email, long phoneNumber, long zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
    }
    
    // taking inputs from the user
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();
        System.out.print("Enter Address: ");
        String address = scanner.next();
        System.out.print("Enter City Name: ");
        String city = scanner.next();
        System.out.print("Enter State Name: ");
        String state = scanner.next();
        System.out.print("Enter Zip Code: ");
        long zipCode = scanner.nextLong();
        System.out.print("Enter Phone Number: ");
        long phoneNumber = scanner.nextLong();
        System.out.print("Enter Email Address: ");
        String email = scanner.next();
        scanner.close();

        AddressBookMain addressbook = new AddressBookMain(firstName, lastName, address, city, state, email, phoneNumber, zipCode);
        
        System.out.println("First Name: " +addressbook.firstName);
        System.out.println("Last Name: " +addressbook.lastName);
        System.out.println("Address: " +addressbook.address);
        System.out.println("City: " +addressbook.city);
        System.out.println("State: " +addressbook.state);
        System.out.println("Phone Number: " +addressbook.phoneNumber);
        System.out.println("Email Address: " +addressbook.email);
        System.out.println("Zip Code: " +addressbook.zipCode);
    }
}