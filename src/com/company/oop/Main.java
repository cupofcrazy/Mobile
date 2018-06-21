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
                    System.out.print("Enter the phone number of " + name);
                    int phoneNumber = scanner.nextInt();
                    mobilePhone.addContact(name, phoneNumber);


            }
        }

    }
    private static void printInstructions() {
        System.out.println("Enter code to continue: \n" +
                "0: Quit Application \n" +
                "1: View all Contacts \n" +
                "2: Add new contact \n" +
                "3: Remove contact \n" +
                "4: Quit Application \n" +
                "5: Quit Application \n" +
                "6: Quit Application \n"

        );
    }

}
