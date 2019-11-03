package com.mycompany.lab6;

import java.util.Scanner;

public class LandTractMain {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the length of the first piece of land: ");
        double length = keyboard.nextDouble();
        System.out.println("Please enter the width of the first piece of land: ");
        double width = keyboard.nextDouble();
        LandTract firstLand = new LandTract(length, width);
        System.out.println(firstLand.toString());

        System.out.println("Please enter the length of the second piece of land: ");
        double secondLength = keyboard.nextDouble();
        System.out.println("Please enter the width of the second piece of land: ");
        double secondWidth = keyboard.nextDouble();
        LandTract secondLand = new LandTract(secondLength, secondWidth);

        System.out.println(secondLand.toString());
        System.out.println("The area of the first piece of land is: " + firstLand.area() + " Square Feet");
        System.out.println("The area of the second piece of land is: " + secondLand.area() + " Square Feet");

        if (firstLand.equals(secondLand) == true) {
            System.out.println("The Pieces of Land are of Equal Size");
        } else {
            System.out.println("The Pieces of Land are Not of Equal Size");
        }

    }
}
