package ex07;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */
public class App {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        final double conversion = 0.09290304;

        System.out.print("What is the length of the room in feet? ");
        String strLength = input.nextLine();
        System.out.print("What is the width of the room in feet? ");
        String strWidth = input.nextLine();

        int length = Integer.parseInt(strLength);
        int width = Integer.parseInt(strWidth);

        int areaFeet = length * width;

        double areaMeters = areaFeet * conversion;

        System.out.printf("You entered dimensions of %d feet by %d feet.", length, width);
        System.out.printf("The area is\n%d square feet\n%.3f square meters", areaFeet, areaMeters);

    }

}
