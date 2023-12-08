// Team members: Sowmya Sree

// Project Team Name: Marvel

import java.util.Scanner;

public class contact {

    public static void main(String[] args) {

        System.out.print(" \n Team members: Sowmya Sree\n\n");

        Scanner contactName = new Scanner(System.in);

        System.out.println(" Enter contact Name: \n");

        String Contactname = contactName.next();

        Scanner contactNumber = new Scanner(System.in);

        System.out.println(" Enter contact number: \n");

        String Contactnumber = contactNumber.next();

        Scanner email = new Scanner(System.in);

        System.out.println(" Enter email ID: \n");

        String Email = email.next();

        System.out.println(" \n Enter the second contact details \n");



        Scanner contactNameTwo = new Scanner(System.in);

        System.out.println(" Enter contact Name: \n");

        String ContactnameTwo = contactNameTwo.next();

        Scanner contactNumberTwo = new Scanner(System.in);

        System.out.println(" Enter contact number: \n");

        String ContactnumberTwo = contactNumberTwo.next();

        Scanner emailOne = new Scanner(System.in);

        System.out.println(" Enter email ID: \n");

        String EmailOne = emailOne.next();

        System.out.println("\n Enter the Third contact details \n");



        Scanner contactNameThree = new Scanner(System.in);

        System.out.println(" Enter contact Name: \n");

        String Contactnamethree = contactNameThree.next();

        Scanner contactNumberThree = new Scanner(System.in);

        System.out.println(" Enter contact number: \n");

        Scanner emailTwo = new Scanner(System.in);

        System.out.println(" Enter email ID: \n");

        String EmailTwo = emailTwo.next();

        String Contactnumberthree = contactNumberThree.next();



        System.out.println("\n Saved Contact Details: \n ");


   System.out.println("\n First contact details: \n\n" + "Contact Name:" + Contactname + "\n" + "Contact Number:"
                + Contactnumber  + "\n" + "Email ID" + Email);

        System.out.println("\n Second contact details: \n\n" + "Contact Name:" + ContactnameTwo + "\n"
                + "Contact Number:" + ContactnumberTwo + "\n" + "Email ID" + EmailOne);

        System.out.println("\n Third contact details: \n\n" + "Contact Name:" + Contactnamethree + "\n"
                + "Contact Number:" + Contactnumberthree + "\n" + "Email ID" + EmailTwo);

    }
}
