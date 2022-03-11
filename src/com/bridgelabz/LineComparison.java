package com.bridgelabz;
import java.util.Objects;
import java.text.DecimalFormat;
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
        calculateLength(x1, y1, x2, y2, x3, y3, x4, y4);
    }
    private static void calculateLength(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        DecimalFormat deciForm = new DecimalFormat("0.##");
        //CALCULATE LENGTH OF TWO LINES
        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of first line is : " + deciForm.format(length1));
        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("Length of second line is : " + deciForm.format(length2));

        // COMPARISON OF LENGTHS
        if(length1.compareTo(length2) > 0)
            System.out.println("Line1 is larger than Line2");
        else if(length1.compareTo(length2) < 0)
            System.out.println("Line1 is smaller than Line2");
        else
            System.out.println("Both lines are same");
    }
}