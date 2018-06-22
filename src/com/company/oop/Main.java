package com.company.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Phone mobilePhone = new Phone("Donald Trump", 01234567);
        boolean quit = false;
        printInstructions();

        while (!quit) {

            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Turning phone off...");
                    quit = true;
                    break;
                case 1:
                    printInstructions();
                    break;
                case 2:
                    mobilePhone.showAllContacts();
                    break;
                case 3:
                    System.out.print("Enter a new name of contact: ");
                    String name = scanner.next();
                    System.out.print("Enter the phone number of " + name + ": ");
                    int phoneNumber = scanner.nextInt();
                    mobilePhone.addContact(name, phoneNumber);
                    printInstructions();
                    break;
                case 4:
                    System.out.println("About phone: ");
                    System.out.println(mobilePhone.getPhoneDetails());
                    break;
                    //Still working on case 5
                case 5:
                    System.out.println("Enter contact name to remove: ");
                    String contactName = scanner.next();
                    Contact contact = mobilePhone.checkContact(contactName);
                    mobilePhone.removeContact(contact);
                    break;




            }
        }

    }
    private static void printInstructions() {
        System.out.print(
                "\t0: Quit Application \n" +
                "\t1: Print Instructions \n" +
                "\t2: Show all contacts \n" +
                "\t3: Add new contact \n" +
                "\t4: Check phone info \n" +
                "\t5: Remove contact \n" +
                "\t6: Quit Application \n" +
                "Enter code to continue: "

        );
    }
    private static void removeContact(String contactName) {

    }

}
