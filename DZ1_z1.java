package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x value: ");
        int x = sc.nextInt();
        System.out.println("Enter y value: ");
        int y = sc.nextInt();

        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Enter c value: ");
        int c = sc.nextInt();

        int area_of_hole = x * y;

        int area_of_bc_side = b * c;
        int area_of_ca_side = c * a;
        int area_of_ba_side = b * a;

        if(area_of_hole >= area_of_bc_side){
            System.out.println("Brick fits!");
        }
        else if(area_of_hole >= area_of_ca_side){
            System.out.println("Brick fits!");
        }
        else if(area_of_hole >= area_of_ba_side){
            System.out.println("Brick fits!");
        }
        else{
            System.out.println("Brick doesn't fit!");
        }

    }
}
