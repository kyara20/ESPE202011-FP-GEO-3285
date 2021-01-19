/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW04Menus {

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
            System.out.println("1. -> Distance");
            System.out.println("2. -> Rectangle Area");
            System.out.println("3. -> Rectangle Perimeter");
            System.out.println("4. -> Square root of a number");
            System.out.println("5. -> Square of a number");
            System.out.println("6. -> EXIT");
            
            System.out.println("Enter you menu option -->");
            option = input.nextInt();
            
            switch(option) {
              
                case 1:
                    int distance;
                    int speed;
                    int time;
                    System.out.println("Enter speed -> ");
                    speed = input.nextInt();
                    System.out.println("Enter time -> ");
                    time = input.nextInt();
                    distance = speed * time;
                    System.out.println("The distance is --> " + distance);
                    break;
                    
                case 2:
                    int areaR;
                    int base;
                    int height;
                    System.out.println("Enter base -> ");
                    base = input.nextInt();
                    System.out.println("Enter height -> ");
                    height = input.nextInt();
                    areaR = base * height;
                    System.out.println("The rectangle area is --> " + areaR);
                    break;
                    
                case 3:
                    int perimeter;
                    int side1;
                    int side2;
                    int side3;
                    int side4;
                    System.out.println("Enter side 1 -> ");
                    side1 = input.nextInt();
                    System.out.println("Enter side 2 -> ");
                    side2= input.nextInt();
                    System.out.println("Enter side 3 -> ");
                    side3 = input.nextInt();
                    System.out.println("Enter side 4 -> ");
                    side4= input.nextInt();
                    perimeter = side1 + side2 + side3 + side4;
                    System.out.println("The rectangle perimeter is --> " + perimeter);
                    break;
                    
                case 4:
                    double number, root;
                    System.out.println("Enter the number to obtain the square root - >");
                    Scanner cap = new Scanner(System.in);
                    number = cap.nextDouble ();
                    root = Math.sqrt(number);
                    System.out.println("The square root of " + number + " is " + root );
                    break;
                    
                case 5:
                    int num;
                    System.out.print("Enter the number to get the square -> ");
                    num = input.nextInt();
                    System.out.print("Squared value --> " + Math.pow(num, 2));
                    break;
                    
                case 6:
                    System.out.println("GOOD BYE MY FRIEND");
                    System.exit(0);
                    break;
                    
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
                }
            
    } while (option != 6);   
    }

    
}
