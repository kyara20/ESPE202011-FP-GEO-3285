/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05iterations;

/**
 *
 * @author Kyara Lizeth
 */
public class WS05Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k;
        k = 0;
        
        System.out.println("=== This is a while loop from 1 to 10 ===");
        
        while(k < 10){
            System.out.println("k ->" + ( k + 1 ));
            //k += 1;
            k++;
            //k = k + 1;
        }
        
        System.out.println(" First 5 even numbers");
        k = 2;
        while(k <= 10){
            System.out.println(k + " -> is even");
            k += 2;
        }
        
        System.out.println(" Firts 5 odd numbers");
        
        int stop;
        stop = 20;
        for(int s=1 ; s < stop ; s += 2){
            System.out.println(" odd number -> " + s);    
    }
        
        System.out.println("Multiplication Tables : 9");
        int top = 12;
        int product = 0;
        int table = 9;
        for (int s = 1 ; s <= top ; s++){
            product = table * s;
            System.out.println("9 * " + s + " = " + product);
        }
    }
}
