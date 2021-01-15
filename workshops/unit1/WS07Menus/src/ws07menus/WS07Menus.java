/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws07menus;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class WS07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do {
            System.out.println(" ===== CALCULATOR ==== ");
            System.out.println("1. -> Addition");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Divsion");
            System.out.println("5. -> EXIT");
            
            System.out.println("Enter you menu option -->");
            option = input.nextInt();
            
            switch(option) {
              
                case 1:
                    int sum;
                    int addend1;
                    int addend2;
                    System.out.println("Enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("Enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println("The addition is --> " + sum);
                    break;
                    
                case 2:
                    int difference;
                    int minuend;
                    int subtrahend;
                    System.out.println("Enter minuend -> ");
                    minuend = input.nextInt();
                    System.out.println("Enter subtrahend -> ");
                    subtrahend = input.nextInt();
                    difference = minuend - subtrahend;
                    System.out.println("The subtraction is --> " + difference);
                    break;
                    
                case 3:
                    int product;
                    int multiplicand;
                    int multiplier;
                    System.out.println("Enter multiplicand -> ");
                    multiplicand = input.nextInt();
                    System.out.println("Enter multiplier -> ");
                    multiplier = input.nextInt();
                    product = multiplicand * multiplier;
                    System.out.println("The multiplcation is --> " + product);
                    break;
                    
                case 4:
                    int quotient;
                    int dividend;
                    int divider;
                    System.out.println("Enter dividend -> ");
                    dividend = input.nextInt();
                    System.out.println("Enter divider -> ");
                    divider = input.nextInt();
                    quotient = dividend / divider;
                    System.out.println("The division is --> " + quotient);
                    break;
                    
                case 5:
                    System.out.println("GOOD BYE MY FRIEND");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
            
        } while (option != 5);
    }
}
    
