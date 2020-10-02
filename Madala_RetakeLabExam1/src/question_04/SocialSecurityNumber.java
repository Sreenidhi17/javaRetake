/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_04;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class SocialSecurityNumber {

    public static void main(String[] args) {
//      to get the entry for SSN 
        System.out.print("Enter a SSN: ");
//        creating the Scanner object so that we can read the input values 
        Scanner sc = new Scanner(System.in);
        String ssn = sc.nextLine();
        boolean j = true;
//        checkin the length of the entered SSN value 9 digits and 2 '-'
        if (ssn.length() == 11) {
            for (int i = 0; i < ssn.length(); i++) {
                if (i <= 2) {
//                  checks the values of 0-2 wether it is digit or character 
                    if (Character.isDigit(ssn.charAt(i)) == false) {
//                        if it is not a digit then it will set j as false, 
//                          so that we can print the value " is an invalid 
//                              social security number"
                        j = false;
                    }
                } else if (i == 3 || i == 6) {
//                  checks the values at 3 and 6 wether it is digit or character 
                    if (ssn.charAt(i) != '-') {
//                        if it is not a character then it will set j as false, 
//                          so that we can print the value " is an invalid 
//                              social security number"
                        j = false;
                    }
                } else if (i > 3 && i<6) {
//                  checks the values of 4&5 wether it is digit or character
                    if (Character.isDigit(ssn.charAt(i)) == false) {
//                        if it is not a digit then it will set j as false, 
//                          so that we can print the value " is an invalid 
//                              social security number"                   
                        j = false;
                    }
                } else if (i > 6) {
//                  checks the values of 6-10 wether it is digit or character
                    if (Character.isDigit(ssn.charAt(i)) == false) {
//                        if it is not a digit then it will set j as false, 
//                          so that we can print the value " is an invalid 
//                              social security number"                   
                        j = false;
                    }
                }
            }
            if (j != false) {
//                if j is true then the entered value is a valid social security
//                  number
                System.out.println(ssn + " is a valid social security number");
            } else {
//                if j is false then the entered value is an invalid social 
//                  security number
                System.out.println(ssn + " is an invalid social security "
                        + "number");
            }
        } else {
//                if length of  the entered value is less than 11 then it should 
//                   print as is an invalid social security number
            System.out.println(ssn + " is an invalid social security "
                    + "number");
        }
    }
}
