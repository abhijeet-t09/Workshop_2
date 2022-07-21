package com.bridgelabz;
import java.util.*;

public class AddressBookUpdate {
    ArrayList<Contact> arrayList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addContact(){

        Contact contact = new Contact();

        System.out.print("Enter First Name: ");
        contact.setFirstName(scanner.next());

        System.out.print("Enter Last Name: ");
        contact.setLastName(scanner.next());

        System.out.print("Enter City: ");
        contact.setCity(scanner.next());

        System.out.print("Enter State: ");
        contact.setState(scanner.next());

        System.out.print("Enter Zip-code: ");
        contact.setZipCode(scanner.next());

        System.out.print("Enter Phone Number: ");
        contact.setPhoneNumber(scanner.next());

        System.out.print("Enter Email-ID: ");
        contact.setEmail(scanner.next());

        arrayList.add(contact);
    }

    public void editContact(){

        if(arrayList.isEmpty()){
            System.out.println("Addressbook is Empty");
        }
        else{
            System.out.println("Enter First Name");
            String firstName = scanner.next();

            boolean found = false;

            for(Contact contact : arrayList){

                if(firstName.equals(contact.getFirstName())){

                    System.out.println("Contact Found !!");

                    System.out.print("Enter First Name: ");
                    contact.setFirstName(scanner.next());

                    System.out.print("Enter Last Name: ");
                    contact.setLastName(scanner.next());

                    System.out.print("Enter City: ");
                    contact.setCity(scanner.next());

                    System.out.print("Enter State: ");
                    contact.setState(scanner.next());

                    System.out.print("Enter Zip-code:");
                    contact.setZipCode(scanner.next());

                    System.out.print("Enter Phone Number");
                    contact.setPhoneNumber(scanner.next());

                    System.out.print("Enter email ID");
                    contact.setEmail(scanner.next());

                    found = true;
                    break;
                }
            }
            if (!found){
                System.out.println("Contact Not Found !!");
            }
        }
    }
}
