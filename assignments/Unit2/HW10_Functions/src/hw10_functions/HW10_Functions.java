/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10_functions;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW10_Functions {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
    // TODO code application logic here
  
        int dividend = 0;
        int divisor = 0;
        float quotient;
        int x = 0;
        int y = 0;
        int number;

        
        Scanner input = new Scanner(System.in);
        System.out.println("== WELCOME TO THE FUNCTION PROGRAM == ");
        System.out.println("____________________________________  ");
        System.out.println("Enter dividend : ");
        dividend = input.nextInt();
        System.out.println("Enter divisor : ");
        divisor = input.nextInt();
        
        quotient = (float) dividend / (float) divisor;

        System.out.println("The quotient  is -> " + quotient);
        
        System.out.println("________________________ ");
      
        System.out.println("f(x) = 7 * x  + 21 ");
        System.out.println("Enter a value for x : ");
        x = input.nextInt();
        y = 7 * x  + 21 ; 
        System.out.println("Function result -> " + y);
        
        System.out.println("______________________ ");
        
        System.out.println("g(x) = x * x + 5 * x - 36 ");
        System.out.println("Enter a value for x : ");
        x = input.nextInt();
        y = x * x + 5 * x - 36; 
        System.out.println("Function result -> " + y);
        
        System.out.println("_______________________ ");
        
        System.out.println("The multiplication table of the number : ");
        number = input.nextInt();
        for (int i = 1; i <= 12; i++) {
        System.out.println(number + " x " + i + " = " + (number * i));   
        }
        
        System.out.println("_______________________  ");
        System.out.println("THANKS FOR USE MY CODE");
        System.out.println(">>>  Kyara Lizeth  <<< ");
        }

    public static float divideTwoNumbers (int dividend, int divisor) {
        float quotient;
        quotient = (float) dividend / (float) divisor;
        return quotient;
    }
        public static int f(int x) { 
            int y;
            y =  7 * x  + 21 ;
            return y;
    }
        public static int g(int x) {
            int y;
            y = x * x + 5 * x - 36;
            return y;
    }
        public static float MultiplicationTableOfNumbers (int multiplicand, int multiplier) {
            int product;
            product = multiplicand * multiplier;
            return product; 
    }
}
