package com.Bridgelabz;
import java.util.Scanner;


public class LineOfComparison {

    /*
     * UC2- check when two lines are equal
     */

    public static double equalityOfLength() {

        Scanner line = new Scanner(System.in);

        System.out.println("Enter the value for x1 = ");
        double x1 = line.nextDouble();

        System.out.println("Enter the value for x2 = ");
        double x2 = line.nextDouble();

        System.out.println("Enter the value for y1 = ");
        double y1 = line.nextDouble();

        System.out.println("Enter the value for y2 = ");
        double y2 = line.nextDouble();

        double length = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        return length;
    }
    public static void main(String[] args) {
        Double lengthOfLine1 = equalityOfLength();

        System.out.println("length of line 1 = " + lengthOfLine1);

        Double lengthOfLine2 = equalityOfLength();

        System.out.println("lenth of line 2 = " + lengthOfLine2);

        if(lengthOfLine1.equals(lengthOfLine2)) {
            System.out.println("Both lines are equal.");
        }
        else {
            System.out.println("Both lines are not equal.");
        }

    }

}