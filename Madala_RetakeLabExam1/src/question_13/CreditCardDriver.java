/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_13;

import java.util.Scanner;

/**
 *
 * @author Sreenidhi Madala
 */
public class CreditCardDriver {

    public static void main(String[] args) {
//        creating the Scanner object so that we can read the input values
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long cCNumber = sc.nextLong();
//        Printing for valid or invalid card checking isValid true or false
//          creating the new CreditCard object
        CreditCard cc = new CreditCard();
        if (cc.isValid(cCNumber)) {
//            if true  we print that given card number it is valid
            System.out.println(cCNumber + " is valid");
        } else {
//            if true  we print that given card number it is not valid
            System.out.println(cCNumber + " is invalid");
        }
    }
}