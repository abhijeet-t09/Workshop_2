package com.bridgelabz;
import java.util.*;
public class AddressBook {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");

        AddressBookUpdate addressBook = new AddressBookUpdate();

        Scanner sc = new Scanner(System.in);

        boolean exit = true;

        while (exit) {

            System.out.println("Select Operation....");
            System.out.println("1. Enter Contact");
            System.out.println("2. Edit Contact");
            System.out.println("Exit Address Book");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    addressBook.addContact();
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    exit = false;
                    break;
                default:
                    break;
            }
        }
    }
}
