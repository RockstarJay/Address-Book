package com.jaybhagat.addressbook;

/*
 * class for the Multiple Address Book
 * getting input from user and set that input in the constructor
 * adding multiple contact to address book
 * editing person details
 * deleting a contact
 * @author com.jaybhagat
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class AddressBookMain {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, ArrayList<Person>> addressBook = new HashMap<String, ArrayList<Person>>();

        while (true) {
            System.out.println("Press 1 to Create new Address book\nPress 2 to Edit Address Books\nPress 3 to View All the Address Books Names.\nPress 4 to Exit");
            int userOption = scanner.nextInt();

            if (userOption == 1) {
                ArrayList<Person> personArrayList = new ArrayList<Person>();
                System.out.println("Enter a Address Book Name : ");
                String addressBookName = scanner.next();
                // validating to add new address book
                if (!addressBook.containsKey(addressBookName)) {
                    boolean flag = true;
                    while (flag) {
                        Person person = new Person();
                        System.out.println("Press 1 to Add Contact in " + addressBookName + "\nPress 2 to Exit from " + addressBookName );
                        int userChoice = scanner.nextInt();
                        switch (userChoice) {
                            case 1:
                                personArrayList = addContact(person, personArrayList);
                                addressBook.put(addressBookName, personArrayList);
                                System.out.println("Added Person Info in " + addressBookName + " Successfully..!");
                                break;
                            default:
                                flag = false;
                                System.out.println("Exit from " + addressBookName + " Address Book.");
                        }
                    }
                } else {
                    System.out.println(addressBookName + " Address Book Already Present.");
                }
                System.out.println("");
            }

            // Edit the existed address book
            else if (userOption == 2) {
                ArrayList<Person> personArrayList = new ArrayList<Person>();
                System.out.println("Enter a Address Book Name : ");
                String addressBookName = scanner.next();
                try {
                    if (addressBook.containsKey(addressBookName)) {
                        personArrayList = (ArrayList<Person>) addressBook.get(addressBookName);
                        boolean flag = true;
                        while (flag) {
                            Person person = new Person();
                            System.out.println("Press 1 to Add contact in " + addressBookName + "\nPress 2 to Edit Contact from " + addressBookName + "\nPress 3 to Delete contact from " 
                            		                + addressBookName + "\nPress 4 to View Contact from " + addressBookName + "\nPress 5 to Exit " + addressBookName);
                            int userChoice = scanner.nextInt();
                            switch (userChoice) {
                                case 1:
                                    personArrayList = addContact(person, personArrayList);
                                    break;
                                case 2:
                                    personArrayList = editContact(person, personArrayList);
                                    break;
                                case 3:
                                    personArrayList = deleteContact(person, personArrayList);
                                    break;
                                case 4:
                                    viewContact(personArrayList);
                                    break;
                                default:
                                    flag = false;
                                    addressBook.put(addressBookName, personArrayList);
                                    System.out.println("Exit ");
                            }
                        }
                        // adding contact list to the Address book
                        addressBook.put(addressBookName, personArrayList);
                        break;
                    } else {
                        System.out.println("No Such Address Book Exist");
                    }
                } catch (Exception e) {
                    System.out.println("No Such Address Book");
                    break;
                }

            }

            // shows all available address books
            else if (userOption == 3) {
                if (!addressBook.isEmpty()) {
                    System.out.println("Available Address Books : ");
                    for (String key : addressBook.keySet()) {
                        System.out.print(key);
                    }
                    System.out.println();
                } else {
                    System.out.println("Address Book is Empty.");
                }
            }

            // exit
            else {
                break;
            }
        }
    }

    // adding person info to the address book
    public static ArrayList<Person> addContact(Person person, ArrayList<Person> personArrayList) {
        System.out.print("Enter First Name : ");
        String firstName = scanner.next();
        person.setFirstName(firstName);

        System.out.print("Enter Last Name : ");
        String lastName = scanner.next();
        person.setLastName(lastName);

        System.out.print("Enter Address : ");
        String address = scanner.next();
        person.setAddress(address);

        System.out.print("Enter City Name : ");
        String city = scanner.next();
        person.setCity(city);

        System.out.print("Enter State Name : ");
        String state = scanner.next();
        person.setState(state);

        System.out.print("Enter Zip Code : ");
        long zipCode = scanner.nextLong();
        person.setZipCode(zipCode);

        System.out.print("Enter Phone Number : ");
        long phoneNumber = scanner.nextLong();
        person.setPhoneNumber(phoneNumber);

        System.out.print("Enter Email Address: ");
        String email = scanner.next();
        person.setEmail(email);

        personArrayList.add(person);
        return personArrayList;
    }

    // edit the person info from address book
    public static ArrayList<Person> editContact(Person person, ArrayList<Person> personArrayList) {

        System.out.print("Enter First Name : ");
        String firstName = scanner.next();
        System.out.print("Enter Last Name : ");
        String lastName = scanner.next();
        for (int index = 0; index < personArrayList.size(); index++) {
            if (personArrayList.get(index).getFirstName().equals(firstName) && personArrayList.get(index).getLastName().equals(lastName)) {
                System.out.print("Enter Address : ");
                String address = scanner.next();
                personArrayList.get(index).setAddress(address);

                System.out.print("Enter City Name : ");
                String city = scanner.next();
                personArrayList.get(index).setCity(city);

                System.out.print("Enter State Name : ");
                String state = scanner.next();
                personArrayList.get(index).setState(state);

                System.out.print("Enter Zip Code: ");
                long zipCode = scanner.nextLong();
                personArrayList.get(index).setZipCode(zipCode);

                System.out.print("Enter Phone Number: ");
                long phoneNumber = scanner.nextLong();
                personArrayList.get(index).setPhoneNumber(phoneNumber);

                System.out.print("Enter Email Address : ");
                String email = scanner.next();
                personArrayList.get(index).setEmail(email);

                return personArrayList;
            }
        }
        return personArrayList;
    }

    // deleting the person info from address book
    public static ArrayList<Person> deleteContact(Person person, ArrayList<Person> personArrayList) {
        System.out.print("Enter First Name : ");
        String firstName = scanner.next();
        System.out.print("Enter Last Name : ");
        String lastName = scanner.next();
        for (int index = 0; index < personArrayList.size(); index++) {
            if (personArrayList.get(index).getFirstName().equals(firstName) && personArrayList.get(index).getLastName().equals(lastName)) {
                personArrayList.remove(index);
            }
            return personArrayList;
        }
        return personArrayList;
    }

    // show all the persons information inside address book
    public static void viewContact(ArrayList<Person> personArrayList) {
        for (Person c: personArrayList) {
            System.out.println(c.getFirstName() + " " + c.getLastName() + " " + c.getAddress() + " " + c.getCity() + " " + c.getState() + " "  + c.getZipCode()
                    + " " + c.getPhoneNumber() + " " + c.getEmail());
        }
    }
}