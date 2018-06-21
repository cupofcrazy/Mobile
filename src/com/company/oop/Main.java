package com.company.oop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
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
//                    mobilePhone.getContacts().remove(Contact());


            }
        }

    }
    private static void printInstructions() {
        System.out.println("Enter code to continue: \n" +
                "0: Quit Application \n" +
                "1: Print Instructions \n" +
                "2: Show all contacts \n" +
                "3: Add new contact \n" +
                "4: update an existing contact \n" +
                "5: Quit Application \n" +
                "6: Quit Application \n"

        );
    }
    private static void removeContact() {

    }

}
