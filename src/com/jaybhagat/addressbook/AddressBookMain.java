package com.jaybhagat.addressbook;

/*
 * class to add a contact to the Address Book
 * @author com.jaybhagat
 */

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
	 static Scanner scanner = new Scanner(System.in);
	 static ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
    
    public static void main(String[] args) {
        Contact contact = new Contact();

        // adding contact to the address book
        addContact(contact, contactArrayList);
    }
    
    // taking inputs from the user
    public static void addContact(Contact contact, ArrayList<Contact> contactArrayList) {
        System.out.print("Enter First Name: ");
        String firstName = scanner.next();
        contact.setFirstName(firstName);

        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();
        contact.setLastName(lastName);

        System.out.print("Enter Address: ");
        String address = scanner.next();
        contact.setAddress(address);

        System.out.print("Enter City Name: ");
        String city = scanner.next();
        contact.setCity(city);

        System.out.print("Enter State Name: ");
        String state = scanner.next();
        contact.setState(state);

        System.out.print("Enter Zip Code: ");
        long zipCode = scanner.nextLong();
        contact.setZipCode(zipCode);

        System.out.print("Enter Phone Number: ");
        long phoneNumber = scanner.nextLong();
        contact.setPhoneNumber(phoneNumber);

        System.out.print("Enter Email Address: ");
        String email = scanner.next();
        contact.setEmail(email);

        contactArrayList.add(contact);
        
        // printing the contact with for each loop
        for (Contact c: contactArrayList) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAddress() + " " + c.getCity() 
                               + " " + c.getState() + " "  + c.getZipCode() + " " + c.getPhoneNumber() + " " + c.getEmail());
        }
    }
}