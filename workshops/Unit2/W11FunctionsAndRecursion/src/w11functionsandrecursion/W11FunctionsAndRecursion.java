/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w11functionsandrecursion;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class W11FunctionsAndRecursion {

/**
 * @param args the command line arguments
 */
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        float operand1;
        float operand2;
        float product;
        float division;
        float addition;
        float modulus;
        char option = 0;
        
        int number = 5;
        int fact = 0;

        do {
            System.out.print("Enter operand1 --> ");
            operand1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter operand2 -->  ");
            operand2 = scanner.nextInt();
            scanner.nextLine();

            if (operand1 % 2 == 0 && operand2 % 2 == 0) {
                showMultiplication(operand1, operand2);
            } else if (operand1 % 3 == 0 && operand2 % 3 == 0) {
                showAddition(operand1, operand2);
            } else if (operand1 % 7 == 0 && operand2 % 7 == 0) {
                showModulus(operand1, operand2);
            } else if (operand1 % 11 == 0 && operand2 % 11 == 0) {
                showMultiplicationTable(operand1 , operand2);
            } else if (operand1 % 13 == 0 && operand2 % 13 == 0) {
                showDivision(operand1, operand2);
            } else {
                System.out.println("The operation is not recognized");
                System.out.println("The operation not exist");
            }

            System.out.println();
            System.out.println();
            System.out.println("Do you want retry again? [y/n]");
            option = scanner.nextLine().charAt(0);
        } while (option != 'n');
        
        
        fact = factorial(number);
        System.out.println("Factorial of " + number + " is equal to -> " + fact);
        }
        public static int factorial (int n){
         if ( n < 0){
             return -1;
         } else {
         if ( n == 0) {
         return 1;
        }
         return (n * factorial(n-1));
        }     
}

    private static void showDivision(float operand1, float operand2) {
        float division;
        division = (operand1 / operand2);
        System.out.println(operand1 + " / " + operand2 + " = " + division);
    }

    private static void showModulus(float operand1, float operand2) {
        float modulus;
        modulus = operand1 % operand2;
        System.out.println(operand1 + " % " + operand2 + " = " + modulus);
    }

    private static void showAddition(float operand1, float operand2) {
        float addition;
        addition = operand1 + operand2;
        System.out.println(operand1 + " + " + operand2 + " = " + addition);
    }

    private static void showMultiplication(float operand1, float operand2) {
        float product;
        product = operand1 * operand2;
        System.out.println(operand1 + " x " + operand2 + " = " + product);
    }
        
        public static void showMultiplicationTable(float operand1 , float  operand2){
          for (int i = 1; i <= 12; i++) {
                    System.out.println(operand1 + " x " + i + " = " + (1 * i));
                }
                if (operand1 != operand2) {
                    for (int i = 1; i <= 12; i++) {
                        System.out.println(operand2 + " x " + i + " = " + (operand2 * i));
                    }
        }  
                
    } 
        
}
  
