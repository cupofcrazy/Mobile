package com.company.oop;

import java.util.ArrayList;

public class Phone {
    private String name;
    private int phoneNumber;
    private ArrayList<Contact> contacts;

    /**
     * @param name: Name of mobile phone user
     * @param phoneNumber: Phone number of the user
     *
     * */
    public Phone(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.contacts = new ArrayList<>();
    }

    // Review phone details
    public String getPhoneDetails() {
        return "Name: " + this.name + ", Phone: " + this.phoneNumber;
    }
    // Add a contact to phone
    public void addContact(String name, int phoneNumber) {
        this.contacts.add(createContact(name, phoneNumber));
    }
    private Contact createContact(String name, int phoneNumber) {
        return new Contact(name, phoneNumber);
    }
    public int numberOfContacts() {
        return contacts.size();
    }
    // Show all contacts
    public void showAllContacts() {
        if (contacts.size() > 0) {
            System.out.println("Here are all your contacts: ");
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println(i + 1 + ". " + contacts.get(i).getContactDetails());
            }
        }
        else {
            System.out.println("You currently do not have any contacts in your phone, " + this.name);
        }
    }
    public boolean checkContact(String contactName) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(contactName)) {
                return true;
            }
        }
        return false;

    }
    // Remove a contact
    public void removeContact(Contact contact) {
        if (checkContact(contact.getName())) {
            this.contacts.remove(contact);
        }
    }
    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }

}
