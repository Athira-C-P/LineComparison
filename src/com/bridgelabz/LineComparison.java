package com.bridgelabz;

import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to line comparison computation program");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of x1 : ");
        int x1 = in.nextInt();
        System.out.println("Enter the value of y1 : ");
        int y1 = in.nextInt();
        System.out.println("Enter the value of x2 : ");
        int x2 = in.nextInt();
        System.out.println("Enter the value of y2 : ");
        int y2 = in.nextInt();

        double distance = Math.sqrt( ( x2 - x1 ) * ( x2 - x1 ) + ( y2 - y1 ) * ( y2 - y1 ));

        System.out.println("The distance is : "+ distance);
    }
}
