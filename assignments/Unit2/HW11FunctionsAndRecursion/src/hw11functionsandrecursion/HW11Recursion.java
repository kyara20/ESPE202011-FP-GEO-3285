/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11functionsandrecursion;

import java.util.Scanner;


/**
 *
 * @author Kyara Lizeth
 */
public class HW11Recursion {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int base = 0;
        int exponent = 0;
        
        System.out.println("Enter base value : ");
        base = input.nextInt();
        System.out.println("Enter exponent value : ");
        exponent = input.nextInt();
        
        System.out.println("Potency result -> " + potency (base,exponent ));
        
    }
    public static double potency (int base, int exponent ){ 
     
        if (exponent == 0){
          return 1;
        } else if ( exponent == 1){
            return base;
        } else if (exponent < 0){
            return potency (base, exponent + 1) / base; 
        } else {
            return base * potency(base, exponent - 1);
        }    
    } 
}

        
    

