package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
       /*
        // question 1
        // declare a variable here
        int my_num = 2;
        // then code solution
        int answer = my_num * 2;
        // then use System.out.println()
        System.out.println("The answer is " + answer);
        // ex: System.out.println("The answer is " + answer);

        */
        int bobSalary = 28000;
        int garySalary = 40000;

        int highestSalary = Math.max(garySalary, bobSalary);
        System.out.println("The highest salary is " + highestSalary);

        int carPrice = 2800;
        int truckPrice = 4000;

        int minPrice = Math.min(carPrice, truckPrice);
        System.out.println("The less expensive car is " + minPrice);

        float circleR = 7.25f;
        float areaofCircle = (circleR*circleR) * 3.14f;
        System.out.println("Area of circle is " + areaofCircle);

        float x1 = 5;
        float y1 = 10;
        float x2 = 85;
        float y2 = 50;

        float sqrx = (x2-x1)*(x2-x1);
        float sqry = (y2-y1)*(y2-y1);
        double addSqr = sqrx+sqry;

        double distancePoint = Math.sqrt(addSqr);
        System.out.println("The distance is " + distancePoint);

        float var = -3.8f;
        float absolute = Math.abs(var);
        System.out.println("The absolute value is " + absolute);

//        double random = Math.random();
//
//        System.out.println("random number between 0 - 1: " + random);
        System.out.printf("The random number is %#.2f", Math.random() );




    }
}
