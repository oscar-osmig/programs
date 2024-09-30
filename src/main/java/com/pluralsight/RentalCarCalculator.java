package com.pluralsight;

import java.util.Scanner;

public class RentalCarCalculator {

    public static void main(String[] args) {
        float toll = 3.95f;
        float GPS = 2.95f;
        float road_side = 3.95f;
        float basic_rental = 29.99f;
        float supercharge = (basic_rental * 0.30f) + basic_rental;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What day will you pick up the car? (dd-mm-year)");
        String date = scanner.nextLine();

        System.out.println("Do you want toll tag at $3.95/day? (yes/no) ");
        String toll_tag = scanner.nextLine();

        System.out.println("Do you want GPS at $2.95/day? (yes/no) ");
        String gps = scanner.nextLine();

        System.out.println("Do you want roadside assistence at $3.95/day? (yes/no) ");
        String roadside = scanner.nextLine();

        System.out.println("How many days do you need the car for? ");
        float how_long = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("What is your age? ");
        int age = scanner.nextInt();
        scanner.close();

        if (age > 25){
            if (toll_tag.equals("no") || toll_tag.equals("n")){
                toll *= 0;
            } else if (gps.equals("no") || gps.equals("n")) {
                GPS *= 0;
            } else if (roadside.equals("no") || roadside.equals("n")) {
                road_side *= 0;
            }
            float options = toll + GPS + road_side;
            System.out.println("        Calculate and display\n");
            System.out.println("-   pick up date: " + date +
                               "\n-   rented for: " + how_long + " days");
            System.out.println("-   basic car rental: $" + (basic_rental*how_long) +
                               "\n-   options cost: $" + (options*how_long) +
                               "\n-   underage driver supercharge: $" + 0 +
                               "\n-   total: $" + ( (basic_rental*how_long) + (options*how_long) + 0));

        }if (age >= 18 && age <= 25){
            if (toll_tag.equals("no") || toll_tag.equals("n")){
                toll *= 0;
            } else if (gps.equals("no") || gps.equals("n")) {
                GPS *= 0;
            } else if (roadside.equals("no") || roadside.equals("n")) {
                road_side *= 0;
            }
            float options = toll + GPS + road_side;
            System.out.println("        Calculate and display\n");
            System.out.println("-   pick up date: " + date +
                               "\n-   rented for: " + how_long + " days");
            System.out.println("-   basic car rental: $" + (basic_rental*how_long) +
                               "\n-   options cost: $" + (options*how_long) +
                               "\n-   underage driver supercharge: $" + supercharge +
                               "\n-   total: $" + ( (basic_rental*how_long) + (options*how_long) + supercharge ) );
        }

    }
}
