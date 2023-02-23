package com.mycompany.ifdemo;

import java.util.Scanner;

public class ifdemo {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("\nPlease enter your age:");

            int userAge = in.nextInt();

            if (userAge < 0 || userAge > 100) {
                System.out.println("Invalid age");
                System.out.println("Age must be between 0 and 100");
            }
            else if (userAge < 18) {
                System.out.println("You need parental consent");
            }
            else {
                System.out.println("Congratulations!");
                System.out.println("You may sign up for the event!");
            }
        }
    }
}
