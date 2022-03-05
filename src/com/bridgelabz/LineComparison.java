package com.bridgelabz;
import java.util.Objects;
import java.util.Scanner;
public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner in = new Scanner(System.in);
        System.out.println("Enter coordinates of line L1");
        System.out.println("Enter the value of x1 : ");
        int x1 = in.nextInt();
        System.out.println("Enter the value of y1 : ");
        int y1 = in.nextInt();
        System.out.println("Enter the value of x2 : ");
        int x2 = in.nextInt();
        System.out.println("Enter the value of y2 : ");
        int y2 = in.nextInt();
        System.out.println("Enter coordinates of line L2");
        System.out.println("Enter the value of x3 : ");
        int x3 = in.nextInt();
        System.out.println("Enter the value of y3 : ");
        int y3 = in.nextInt();
        System.out.println("Enter the value of x4 : ");
        int x4 = in.nextInt();
        System.out.println("Enter the value of y4 : ");
        int y4 = in.nextInt();

        Double distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        Double distance2 = Math.sqrt((x4 - x3) * (x4 - x3) + (y4 - y3) * (y4 - y3));
        System.out.println("Length of the line L1 is : " + distance1);
        System.out.println("Length of the line L2 is : " + distance2);

        int check = distance1.compareTo(distance2);
        if (check == 0) {
            System.out.println("Both lines are equal.");
        }
        else if (check > 0) {
            System.out.println("Line L1 is greater than Line L2.");
        }
        else {
            System.out.println("Line L1 is less than Line L2.");
        }
    }
}