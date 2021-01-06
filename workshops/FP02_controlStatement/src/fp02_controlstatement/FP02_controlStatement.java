/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FP02_controlStatement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
  Scanner scanner = new Scanner(System.in);
  System.out.printf("Please enter a number ---> ");
  int nmb = scanner.nextInt(); 
        System.out.println("You entered--->" +nmb);
        if (nmb%2==0)
        {
            System.out.println("number " +nmb+ " even");
        }else {
            System.out.println("number " +nmb+ " odd");
        }
    }
    
}
