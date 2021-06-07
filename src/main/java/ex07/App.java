package ex07;

import java.util.Scanner;

/*
Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet. Then display the area in both square feet and square meters.

Example Output
What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters
The formula for this conversion is m2 = f2 × 0.09290304

Constraints
Keep the calculations separate from the output.
Use a constant to hold the conversion factor.



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
