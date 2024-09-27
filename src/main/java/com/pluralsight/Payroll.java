package com.pluralsight;
import java.util.Scanner;

public class Payroll {

    public static void display_grosspay(Scanner scanner){
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your hours worked: ");
        float hours = scanner.nextFloat();
        System.out.println("Enter your pay rate: ");
        float pay = scanner.nextFloat();
        calculate_over(hours, pay, name);
        scanner.close();
    }

    public static void calculate_over(double hours, double pay, String name){
        if (hours > 40) {
            double overtime = ((hours - 40) * pay) * 1.5;
            System.out.println("\n name: " + name + "\n total hours worked: " + hours + "\n regular hours: 40" + "\n overtime hours: " + (hours - 40) + "\n pay rate: " + pay + "\n Your gross pay is: $" + (overtime + (40 * pay)));
        }else if ( hours <= 40){
            System.out.println("\n name: " + name + "\n total hours worked: " + hours + "\n pay rate: " + pay + "\n Your gross pay is: $" + (hours * pay));

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        display_grosspay(scanner);
    }
}
