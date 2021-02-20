/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;



/**
 *
 * @author Kyara Lizeth
 */
public class InvertAnArray {
    public static void main(String[] args) {
        
       int numbers [] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       
       int assistant [] = new int [numbers.length];
       
       for(int i = numbers.length - 1, j = 0; i >= 0; i--, j++){
           assistant [j] = numbers [i];
           System.out.println(assistant [j]);    
       }      
       numbers = assistant;
    }
    
}
