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
public class LoopFor {
    
    public static void main(String[] args) {
    
        System.out.println("Multiplication Table : 30");
        int top = 30;
        int product = 0;
        int table = 30;
        for (int k = 1 ; k <= top ; k++){
            product = table * k;
            System.out.println("30 * " + k + " = " + product);
        }
    }
}
