/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_13;

/**
 *
 * @author Sreenidhi Madala
 */
public class CreditCard {
    
//     creating an isValid boolean method
//     which returns true if the card cCNumber is valid  
    public static boolean isValid(long number) {
        boolean valid = (getSize(number) >= 13 && getSize(number) <= 16)
                && (prefixMatched(number,4) || prefixMatched(number,5)
                || prefixMatched(number,6) || prefixMatched(number,37))
                &&((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0);
        return valid;
    }
    
//     creating a sumOfDoubleEvenPlace to calculate the sum Of Double Even Place     
    public static int sumOfDoubleEvenPlace(long number) {
        int sumOfDoubleEvenPlace = 0;
        String cC = number + "";
//      checking the even place and multiplying it with 2 
        for (int i = getSize(number)-2; i >= 0; i -= 2){
            sumOfDoubleEvenPlace += getDigit(Integer.parseInt(cC.charAt(i)+"")*2);			
	}
        return sumOfDoubleEvenPlace;
    }
    
//     creating an getDigit to check the sum of digit is < or > 9
//     return cCNumber if it is a single digit, otherwise, sum of the two digits 
    public static int getDigit(int number) {
        int sum =0;
            while (number > 0 || sum > 9)  
        { 
            if (number == 0) { 
                number = sum; 
                sum = 0; 
            } 
            sum += number % 10; 
            number /= 10; 
        } 
        return sum;   
    }
    
//     creating an sumOfOddPlace to calculate the sum Of Odd Place and return sumOdd 
    public static int sumOfOddPlace(long number) {
        int sumOdd = 0;
        int i = 1; 
//      Sum of all the odd places 
        while (number != 0) {
            if (i % 2 != 0){ 
            sumOdd += number % 10;
            }
            number /= 10; 
            i++; 
        }
    return sumOdd;
   }
    
//     creating a prefixMatched to check if the prefix is matched returns true or false
    public static boolean prefixMatched(long number, int d) {
        boolean result = (getPrefix(number,getSize(d)) == d);
        return result;
    }
    
//     creating a getSize to check size of the cCNumber
//     initially converts it to string and then calculate the length and is returned 
    public static int getSize(long d) {
        return (d + "").length();
    }
    
//     creating a getPrefix to check if the prefix of the cCNumber is the given number   
    public static long getPrefix(long number, int k) {
        if (getSize(number) > k) {
            return Long.parseLong((number + "").substring(0, k));
        }
        return number;
    }   
}