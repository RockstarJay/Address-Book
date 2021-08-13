package com.jaybhagat.addressbook;

/*
 * class to add a contact to the Address Book
 * edit a contact from the address book
 * getting input from user and set that input in the constructor
 * adding contact to address book
 * editing person details
 * @author com.jaybhagat
 */

import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookMain {
	 static Scanner scanner = new Scanner(System.in);
	 static ArrayList<Contact> contactArrayList = new ArrayList<Contact>();
    
    public static void main(String[] args) {
        Contact contact = new Contact();
        System.out.println("Press 1 -  To Add a Contact\nPress 2 - To Edit a Contact");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addContact(contact, contactArrayList);
                break;
            case 2:
                editContact(contact);
                break;
            default:
                System.out.println("Invalid input");
        }
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
    
    // edit a contact
    public static void editContact(Contact contact) {
        System.out.print("Enter First Name: ");
        String firstName = scanner.next();
        System.out.print("Enter Last Name: ");
        String lastName = scanner.next();
        for (int index = 0; index < contactArrayList.size(); index++) {
            if (contactArrayList.get(index).getFirstName().equals(firstName) && contactArrayList.get(index).getLastName().equals(lastName)) {
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

                for (Contact c: contactArrayList) {
                    System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAddress() + " " + c.getCity() + " " + c.getState() + " "  + c.getZipCode()
                            + " " + c.getPhoneNumber() + " " + c.getEmail());
                }
            }
        }
    }
}