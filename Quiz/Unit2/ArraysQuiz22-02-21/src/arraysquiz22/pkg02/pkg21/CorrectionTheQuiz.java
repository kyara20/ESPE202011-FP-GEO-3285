/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysquiz22.pkg02.pkg21;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class CorrectionTheQuiz {
    public static void main(String[] args) {
        int names = 0;
        String [] customers;
        float [] age;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount of customers you want to record ->  ");
        names = scanner.nextInt();
        
        customers = new String[names];
        age = new float [names];
        
        for(int i = 0; i < names; i++){
            scanner.nextLine();
            System.out.print("Enter the name of customer : " + i + " -> ");
            customers[i] = scanner.nextLine();
            System.out.print("Please enter " + customers[i] + " age is -> ");
            age[i] = scanner.nextFloat();
        }
        System.out.println("Customer    ->  \t     Age ");
        for(int i = 0; i < names; i++){
            System.out.println(customers[i] + " ->  \t " + age[i]);
        }      
    }   
}
