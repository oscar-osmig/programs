package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your hours worked: ");
        float hours = scanner.nextFloat();
        System.out.println("Enter your pay rate: ");
        float pay = scanner.nextFloat();
        scanner.close();

        if (hours <= 40) {
            System.out.println("\n" + name + " your gross pay is " + "$" + (hours * pay));
        } else if (hours > 40) {
            float overtime = ((hours - 40) * pay) * 1.5f;
            float diff = (40 * pay);
            System.out.println("\n" + name + " your gross pay is " + "$" + (overtime+diff));
        }


    }
}
