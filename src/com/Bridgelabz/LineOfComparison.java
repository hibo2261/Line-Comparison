package com.Bridgelabz;

import java.util.Scanner;

public class LineOfComparison {

    public static double lengthOfLine1, lengthOfLine2;
    static int result;

    public double equalityOfLength() {
        /*
        Taking inputs from user
         */

        Scanner line = new Scanner(System.in);

        System.out.println("Enter the value for x1");
        double x1 = line.nextDouble();

        System.out.println("Enter the value for x2");
        double x2 = line.nextDouble();

        System.out.println("Enter the value for y1");
        double y1 = line.nextDouble();

        System.out.println("Enter the value for y2");
        double y2 = line.nextDouble();

        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;
    }
    public static void main(String[] args) {

        LineOfComparison line = new  LineOfComparison();
        Double lengthOfLine1 = line.equalityOfLength();

        System.out.println("length of line 1: " + lengthOfLine1);

        Double lengthOfLine2 = line.equalityOfLength();

        System.out.println("lenth of line 2: " + lengthOfLine2);

        System.out.println("euqal:: " + lengthOfLine1.equals(lengthOfLine2));
        result = Double.compare(lengthOfLine1, lengthOfLine2);
        if(result < 0 ) {
            System.out.println(  lengthOfLine1 + " is lesser than "  + lengthOfLine2);
        }
        else {
            System.out.println(lengthOfLine1 + " is greater than "  + lengthOfLine2);
        }




    }
}