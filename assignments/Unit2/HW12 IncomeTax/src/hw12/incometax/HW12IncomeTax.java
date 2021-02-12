/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw12.incometax;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW12IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double annualExpenses;
        double housing;
        double education;
        double feeding;
        double clothing;
        double health;
        
        System.out.println("Enter annual net income : ");
        annualExpenses = input.nextDouble();
        System.out.println("Enter deductible expenses (housing) : ");
        housing = input.nextDouble();
        System.out.println("Enter deductible expenses (education) : ");
        education = input.nextDouble();
        System.out.println("Enter deductible expenses (feeding) : ");
        feeding = input.nextDouble();
        System.out.println("Enter deductible expenses (clothing) : ");
        clothing= input.nextDouble();
        System.out.println("Enter deductible expenses (health) : ");
        health = input.nextDouble();
        
        System.out.println("Annual net income : " + annualExpenses);
        System.out.println("Housing : " + housing);
        System.out.println("Education : " + education);
        System.out.println("Feeding : " + feeding);
        System.out.println("Clothing : " + clothing);
        System.out.println("Health : " + health);
        
        double taxBase = annualExpenses - (housing + education + feeding + clothing + health);
        
        if (taxBase < 11212){
            System.out.println("Tax to pay -> " + 0 );
        }
        if (taxBase >= 11212 && taxBase < 14285){  
           System.out.println("Tax to pay -> " + ((taxBase - 11212) * 0.05) ); 
        }
        if (taxBase >= 14285 && taxBase < 17854){
            double operation = (double)(154 + (taxBase - 14285) * 0.1);
            System.out.println("Tax to pay -> " + operation );
        }
        if (taxBase >= 17854 && taxBase < 21442){
            double operation1 = (double)(511 + (taxBase - 17854) * 0.12 );
            System.out.println("Tax to pay -> " + operation1 );
        }
        if (taxBase >= 21442 && taxBase < 42874){
            double operation2 = (double)(941 + (taxBase - 21442) * 0.15 );
            System.out.println("Tax to pay -> " + operation2 );
        }
        if (taxBase >= 42874 && taxBase < 64297){
            double operation3 = (double)(4156 + (taxBase - 42874) * 0.2 );
            System.out.println("Tax to pay -> " + operation3 );
        }
        if (taxBase >= 64297 && taxBase < 85729){
            double operation4 = (double)(8440 + (taxBase - 64297) * 0.25 );
            System.out.println("Tax to pay -> " + operation4 );
        }
        if (taxBase >= 85729 && taxBase < 114288){
            double operation5 = (double)(13798 + (taxBase - 85729) * 0.3 );
            System.out.println("Tax to pay -> " + operation5 );
        }
        if (taxBase > 114288){
            double operation6 = (double)(22366 + (taxBase - 114288) * 0.35 );
            System.out.println("Tax to pay -> " + operation6 );
        }   
    }  
}
