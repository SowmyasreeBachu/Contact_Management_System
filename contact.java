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

        System.out.println(" \n Enter the second contact details \n");



        Scanner contactNameTwo = new Scanner(System.in);

        System.out.println(" Enter contact Name: \n");

        String ContactnameTwo = contactNameTwo.next();

        Scanner contactNumberTwo = new Scanner(System.in);

        System.out.println(" Enter contact number: \n");

        String ContactnumberTwo = contactNumberTwo.next();

        System.out.println("\n Enter the Third contact details \n");



        Scanner contactNameThree = new Scanner(System.in);

        System.out.println(" Enter contact Name: \n");

        String Contactnamethree = contactNameThree.next();

        Scanner contactNumberThree = new Scanner(System.in);

        System.out.println(" Enter contact number: \n");

        String Contactnumberthree = contactNumberThree.next();



        System.out.println("\n Saved Contact Details: \n ");


   System.out.println("\n First contact details: \n\n" + "Contact Name:" + Contactname + "\n" + "Contact Number:"
                + Contactnumber);

        System.out.println("\n Second contact details: \n\n" + "Contact Name:" + ContactnameTwo + "\n"
                + "Contact Number:" + ContactnumberTwo);

        System.out.println("\n Third contact details: \n\n" + "Contact Name:" + Contactnamethree + "\n"
                + "Contact Number:" + Contactnumberthree);

    }
}
