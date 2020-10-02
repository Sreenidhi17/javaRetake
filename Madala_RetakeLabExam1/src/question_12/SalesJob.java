/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_12;

/**
 *
 * @author Sreenidhi Madala
 */
public class SalesJob {
    
    public static void main(String[] args) {
        double sales_Amount = 0.0;
        double commission = 0.0;
        do {            
//            checking the sales_Amount if greater than 10000 then calculating 
//                the commision 
            if (sales_Amount > 10000) {
                commission = 5000 * 0.08 + 5000 * 0.10 + (sales_Amount - 10000) * 0.12;
            } else if (sales_Amount > 5000) {
//            checking the sales_Amount if greater than 5000 then calculating 
//                the commision 
                commission = 5000 * 0.08 + (sales_Amount - 5000) * 0.10;
            
            } else {
//            checking the sales_Amount if less than or equal 5000 then  
//                calculating the commision             
                commission = (sales_Amount - 5000) * 0.08;
            }
//            incrementing the sales amount by 1
            sales_Amount += 1;
        } while (commission < 30000);
        System.out.println("Minimum sales you have to generate in order to make"
                + " $30,000 is :" + sales_Amount);
    }
}

