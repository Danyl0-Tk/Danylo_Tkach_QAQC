package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of radius: ");
        double radius = sc.nextDouble();

        double perimetre;
        double area;
        double pi_value = Math.PI;

        perimetre = 2 * pi_value * radius;
        area = pi_value * Math.pow(radius, 2);

        System.out.println("Value of perimetre is: "+ perimetre);
        System.out.println("Value of area is: "+ area);


        double c1, c2, c3;
        double t1, t2, t3;

        System.out.println("Enter first country: ");
        c1 = sc.nextDouble();
        System.out.println("Enter second country: ");
        c2 = sc.nextDouble();
        System.out.println("Enter third country: ");
        c3 = sc.nextDouble();

        System.out.println("Enter first time: ");
        t1 = sc.nextDouble();
        System.out.println("Enter second time: ");
        t2 = sc.nextDouble();
        System.out.println("Enter third time: ");
        t3 = sc.nextDouble();

        System.out.println("Units for first call: " + c1 * t1);
        System.out.println("Units for second call: " + c2 * t2);
        System.out.println("Units for third call: " + c3 * t3);
        System.out.println("Units for all calls: " + (c1 * t1 + c2 * t2 + c3 * t3));

    }
}
