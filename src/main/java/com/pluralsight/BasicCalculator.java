package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int num2 = scanner.nextInt();
        scanner.nextLine(); // eat left over



        System.out.println("Possible calculations: " +
                "\n (A)dd " +
                "\n (S)ubstract" +
                "\n (M)ultiply " +
                "\n (D)ivide " +
                "\nPlease select an option: ");

        String choice = scanner.nextLine();
        scanner.close();
        switch (choice) {
            case "A": case "a":
                System.out.println("\n" + num1 + '+' + num2 + '=' + (num1+num2));
                break;
            case "S": case "s":
                System.out.println("\n" + num1 + '-' + num2 + '=' + (num1-num2));
                break;
            case "M": case "m":
                System.out.println("\n" + num1 + 'x' + num2 + '=' + (num1*num2));
                break;
            case "D": case "d":
                System.out.println("\n" + num1 + '/' + num2 + '=' + (num1/num2));
                break;
            default:
                System.out.println("Sorry no option available ...");
                break;
        }





    }
}
