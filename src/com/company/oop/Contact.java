package com.company.oop;

public class Contact {
    private String name;
    private int phoneNumber;

    public Contact(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getContactDetails() {
        return "Name: " + this.name + ", Phone: " + this.phoneNumber;
    }

}
