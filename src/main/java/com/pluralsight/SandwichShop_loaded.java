package com.pluralsight;

import java.util.Scanner;

public class SandwichShop_loaded {

    public static void display_options(Scanner scanner){
        float reg_price = 5.45f;
        float large_price = 8.95f;
        float reg_load = 1.00f;
        float large_load = 1.75f;
        System.out.println("Good evening! \nPlease choose the size of the sandwich below: \n  1: Regular: base price" + reg_price + "\n  2. Lage: base price " + large_price);
        System.out.println("    (R)egular\n    (L)arge ");
        String option = scanner.nextLine();
        System.out.println("Do you want to load your sandwich? (y/n)");
        String answer = scanner.nextLine();
        System.out.println("what is your age? ");
        int age = scanner.nextInt();
        scanner.close();

        switch (option){
            case "R": case "r":
               get_price(age, reg_price, answer,reg_load);
                break;
            case "L": case "l":
                get_price(age, large_price, answer,large_load);
                break;
            default:
                System.out.println("Sorry not an option ...");
        }

    }

    public  static void get_price(int age, float price, String answer, float load){
        if ((age <= 17) && (answer.equals("y"))){
            System.out.println("Awesome you got 10% discount your total is: $" + ((price + load) * .9f));
        }else if( age >= 65 && (answer.equals("y"))){
            System.out.println("Ok your total is: $" + (price+load) * .8f);
        }else if (age <= 17 && (answer.equals("n"))){
            System.out.println("Awesome you got 10% discount your total is: $" + (price + load));
        }else if( age >= 65 && answer.equals("n")){
            System.out.println("Ok your total is: $" + (price+load));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        display_options(scanner);

    }
}
