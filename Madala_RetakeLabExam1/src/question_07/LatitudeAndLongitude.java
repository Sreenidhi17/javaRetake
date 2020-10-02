/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_07;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class LatitudeAndLongitude {

    public static void main(String[] args) {
        // TODO code application logic here
        double d;
        double radius = 6371.01;
        String first;
        String second;
        double x1;
        double y1;
        double x2;
        double y2;
//        creating the Scanner object so that we can read the input values
        Scanner scan = new Scanner(System.in);
//        getting the iputs from first latitude and longitude
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        first = scan.nextLine();
//        getting the iputs from second latitude and longitude
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        second = scan.nextLine();
//        getting the substrings for first out of the input string to calculate the 
//        coordinates and converting them to double to calculate the radians
        x1 = Double.parseDouble(first.substring( 0, first.indexOf(",")));
        y1 = Double.parseDouble(first.substring(first.indexOf(",")+1, first.length()));
//        getting the substrings for second out of the input string to calculate the 
//        coordinates and converting them to double to calculate the radians
        x2 = Double.parseDouble(second.substring( 0, second.indexOf(",")));
        y2 = Double.parseDouble(second.substring(second.indexOf(",")+1, second.length()));
//      calculating the radius 
        d = radius * (Math.acos(Math.sin⁡(Math.toRadians(x1))
                * Math.sin⁡(Math.toRadians(x2)) + Math.cos⁡(Math.toRadians(x1))
                * Math.cos⁡(Math.toRadians(x2)) * Math.cos⁡(Math.toRadians(y1)
                - Math.toRadians(y2))));
        System.out.println("The distance between the two points is :" + d + "km");
    }
}