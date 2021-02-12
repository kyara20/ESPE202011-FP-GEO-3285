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
public class getVAT {

    public double getVAT(double base, double percentage) {
        return base * percentage/ 100;
    } 
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       getVAT calculator = new getVAT();
       
       double base;
       double percentage;
       double total;
       double VAT;
       
        System.out.println("Enter base : ");
        base = input.nextDouble();
        
        System.out.println("Enter VAT percentage : ");
        percentage = input.nextDouble();
        VAT = calculator.getVAT(base, percentage);
        total = base + VAT;
        
        System.out.println("Base -> " + base);
        System.out.println("VAT percentage -> " + percentage);
        System.out.println("________________________ ");
        System.out.println("VAT -> " + VAT);
        System.out.println("Total -> " + total);
    }
}
