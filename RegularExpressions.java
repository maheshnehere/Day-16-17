package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegularExpressions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String message = "Hello <<name>>, We have your full"+
                         "name as <<full name>> in our system. your contact number is <<91-xxxxxxxxxx>>"+
                         " Please,let us know in case of any clarification Thank you BridgeLabz <<01/01/2016>>";


        System.out.println("Enter First Name  =");            // Replacing first name in message.
        String firstName = sc.next();
        message = message.replace("<<name>>", firstName);

        System.out.println("Enter Full Name = ");
        String fullName = sc.next();
        Pattern pattern = Pattern.compile("[\\w]+ [\\w]+"); // Replacing Full name in message.
        Matcher matcher = pattern.matcher(fullName);
        if (matcher.find() == true) {
            message = message.replace("<<full name>>", fullName);
        }

        System.out.println("Enter Contact Number =");
        String contact = sc.next();
        Pattern pattern1 = Pattern.compile("[+91] \\d{10}"); // Replacing contact number in message.
        Matcher matcher1 = pattern1.matcher(contact);
        if (matcher1.find() == true) {
            message = message.replace("<<91-xxxxxxxxxx>>", contact);
        }

        System.out.println("Enter Date  =");
        String date = sc.next();
        message = message.replace("<<01/01/2016>>", firstName); // Replacing date in message.

        System.out.println(message);
    }
}