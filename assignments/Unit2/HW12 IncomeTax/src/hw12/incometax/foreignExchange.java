/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.incometax;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class foreignExchange {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float change;
        float dollar;
        float pesos;
        
        System.out.println("Enter the current price of the dollar : ");
        change = input.nextFloat();
        
        System.out.println("Enter the dollar amount : ");
        dollar = input.nextFloat();
        
        pesos = dollar * change;
        System.out.println(dollar + " dollars are equal to " + pesos + " pesos ");
        
   }
}


