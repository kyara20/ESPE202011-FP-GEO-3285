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
public class LoopWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int k;
        k = 0;
        
        System.out.println("=== This is a while loop from 1 to 30 ===");
        
        while(k < 30){
            System.out.println("k ->" + ( k + 1 ));
            //k += 1;
            k++;
            //k = k + 1;
        }
    }
    
}
