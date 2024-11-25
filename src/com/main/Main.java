package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coordinates for the first point
        System.out.println("Enter coordinates of the first point x1: ");
        double x1 = scanner.nextDouble();
        System.out.println("Enter coordinates of the first point y1: ");
        double y1 = scanner.nextDouble();

        // Input coordinates for the second point
        System.out.println("Enter coordinates of the second point y2: ");
        double x2 = scanner.nextDouble();
        System.out.println("Enter coordinates of the second point y1: ");
        double y2 = scanner.nextDouble();

        // Calculate the length of the line
        double length = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("The length of the line is: " + length);

        scanner.close();
    }
}
