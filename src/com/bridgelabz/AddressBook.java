package com.bridgelabz;
import java.util.*;
public class AddressBook {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Welcome to Address Book");
        selectOperation();
    }

    static void selectOperation(){
        int choice=sc.nextInt();

        switch (choice){
            case 1:
                personDetails();
                break;

            default:
        }
    }

    static void personDetails(){
        System.out.print("Enter First Name: ");
        String firstName = sc.next();
        System.out.print("Enter Last Name: ");
        String lastName = sc.next();

        System.out.print("Enter Address: ");
        String personAddress = sc.next();

        System.out.print("Enter State: ");
        String stateName = sc.next();

        System.out.print("Enter City: ");
        String cityName = sc.next();

        System.out.print("Enter Zip-code: ");
        String zipCode = sc.next();

        System.out.print("Enter phone number: ");
        String phoneNumber = sc.next();
    }
}
