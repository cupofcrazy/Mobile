package com.company.oop;

import java.util.ArrayList;

public class Phone {
    private String name;
    private int phoneNumber;
    private ArrayList<Contact> contacts;

    public Phone(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.contacts = new ArrayList<>();
    }
    public String getPhoneDetails() {
        return "Name: " + this.name + ", Phone: " + this.phoneNumber;
    }
    public void addContact(String name, int phoneNumber) {
        this.contacts.add(createContact(name, phoneNumber));
    }
    private Contact createContact(String name, int phoneNumber) {
        return new Contact(name, phoneNumber);
    }
    public int numberOfContacts() {
        return contacts.size();
    }
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
    public void removeContact(Contact contact) {
        if (checkContact(contact.getName())) {
            this.contacts.remove(contact);
        }
    }
    public ArrayList<Contact> getContacts() {
        return this.contacts;
    }

}
