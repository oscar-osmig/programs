package com.pluralsight;

import java.util.Scanner;

public class SandwichExercise {

    public static void main(String[] args) {
        double reg_price = 5.45;
        double large_price = 8.95;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Good evening! \nPlease choose the size of the sandwich below: \n  1: Regular: base price" + reg_price + "\n 2.  Lage: base price " + large_price);
        System.out.println("    (R)egular\n    (L)arge ");
        String option = scanner.nextLine();
        System.out.println("What is your age? ");
        float age = scanner.nextInt();
        scanner.close();

        switch (option) {
            case "R":
            case "r":
                if (age <= 17) {
                    System.out.println("Awesome you've got  10% discount. \nPay: $" + Math.round(reg_price -(reg_price * 0.1)));
                } else if (age >= 65) {
                    System.out.println("Awesome you've got 20% discount. \nPay: $" + Math.round(reg_price -(reg_price * 0.2)));
                }else {System.out.println("Ok... pay: $" + reg_price);}
                break;

            case "L":
            case "l":
                if (age <= 17) {
                    System.out.println("Awesome you've got  10% discount. \nPay: $" + (large_price - (large_price * 0.1)));
                } else if (age >= 65) {
                    System.out.println("Awesome you've got  20% discount. \nPay: $" + Math.round(large_price - (large_price * 0.2)));
                }else {System.out.println("Ok... pay: $" + large_price);}
                break;
            default:
                System.out.println("Sorry no valid option ...");
        }

    }
}

