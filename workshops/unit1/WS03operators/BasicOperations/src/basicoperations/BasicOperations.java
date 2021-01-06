/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicoperations;

/**
 *
 * @author Kyara Lizeth
 */
public class BasicOperations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //variable declaration
        int sum;
        int addend1;
        int addend2;
        
        int difference;
        int minuend;
        int subtrahend;
        
        minuend = -23;
        subtrahend = -6;
        
        int product;
        int multiplicand;
        int multiplier;
        
        multiplicand = 9;
        multiplier = 6;
        
        int quotient;
        int dividend;
        int divider;
        
        dividend = 20;
        divider = 5;
        
        int modulus;
        int dividend2;
        int divider2;
        
        dividend2 = 100;
        divider2 = 2;
        
        // -23 - (-6) = -23 + 6 = -17
        //initilization
        addend1 = 5;
        addend2 = 18;
        
        //operation
        sum = addend1 + addend2;
        
        System.out.println("The addition of " + addend1 + " + " + addend2+ " is equal to --> " +sum);
        
        ++sum;
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum is equal to--> " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        
        System.out.println("adding one to sum" + ((++sum)));
        
        difference = minuend - subtrahend;
        
        System.out.println("The subtration of " + minuend + " - " + subtrahend + " is equal to " + (minuend - subtrahend));
        
        System.out.println("diferrence is equal to --> " + difference);
        
        product = multiplicand * multiplier;
        
        System.out.println("The multiplication of " + multiplicand + " * " + multiplier + " is equal to " + (multiplicand * multiplier));
        
        System.out.println("multiplication is equal to --> " + product);
        
        quotient = dividend / divider;
        
        System.out.println("The division of " + dividend + " / " + divider + " is equal to " + (dividend / divider));
        
        System.out.println("division is equal to --> " + quotient);
        
        modulus = dividend2 % divider2;
        
        System.out.println("The module of " + dividend2 + " % " + divider2 + " is equal to " + (dividend2 % divider2));
        
        System.out.println("modulus is equal to --> " + modulus);
        
    }
    
}
