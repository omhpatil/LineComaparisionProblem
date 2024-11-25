package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates for the first point of line 1
        System.out.println("Enter coordinates of the first point of line 1 x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter coordinates of the first point of line 1 y1: ");
        double y1 = scanner.nextDouble();

        // Input coordinates for the second point
        System.out.println("Enter coordinates of the second point of line 1 x2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter coordinates of the second point of line 1 y2: ");
        double y2 = scanner.nextDouble();

        // Calculate the length of the line 1
        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The length of the line is: " + length1);

        // Input coordinates for the first point of line 2
        System.out.println("Enter coordinates of the first point of line 1 x3: ");
        double x3 = scanner.nextDouble();
        System.out.println("Enter coordinates of the first point of line 1 y3: ");
        double y3 = scanner.nextDouble();

        // Input coordinates for the second point
        System.out.println("Enter coordinates of the second point of line 1 x4: ");
        double x4 = scanner.nextDouble();
        System.out.println("Enter coordinates of the second point of line 1 y4: ");
        double y4 = scanner.nextDouble();

        // Calculate the length of the line 1
        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));
        System.out.println("The length of the line is: " + length2);

        // Compare the two lines using compareTo method
        int comparison = length1.compareTo(length2);

        if (comparison == 0) {
            System.out.println("The two lines are equal in length.");
        } else if (comparison > 0) {
            System.out.println("The first line is longer than the second line.");
        } else {
            System.out.println("The first line is shorter than the second line.");
        }

        scanner.close();
    }
}
