/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08factorialnumber;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int factorial = 1;
        int number;
                    
        System.out.println("Enter the Number --> ");
        number = input.nextInt();
        for( int i = number; i > 0; i-- )
            factorial = factorial * i;
            System.out.println("The factorial of  " + number + " it's --> " + factorial);
                        
    }
}

 