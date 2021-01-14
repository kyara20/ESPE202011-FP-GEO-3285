/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw03iterations;

/**
 *
 * @author Kyara Lizeth
 */
public class ExerciseLoop {
  
    public static void main(String[] args) {
    
        System.out.println("Subtraction Table : 100");
        int top = 100;
        int difference = 0;
        int table = 100;
        for (int k = 1 ; k <= top ; k++){
            difference = table - k;
            System.out.println("100 - " + k + " = " + difference);
        }
    }
}
