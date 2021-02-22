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
public class ArraysQuiz220221 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("        WELCOME TO OUR MENU     ");
            System.out.println("__________  PROGRAMMER  ____________");
            System.out.println("      >>>>  Kyara Lizeth  <<<<");

            System.out.println(" ======  CHOOSE AN OPTION  ====== ");
            System.out.println("1. Customer 1 ");
            System.out.println("2. Customer 2 ");
            System.out.println("3. Customer 3 ");
            System.out.println("4. EXIT  ");
            System.out.println("Enter you menu option -->");
            option = input.nextInt();

            switch (option) {
                case 1:
                    String name1;
                    String age1;
                    System.out.println("Enter the name of customer 1° and the age : ");
                    name1 = input.nextLine();
                    age1 = input.nextLine();
                    System.out.println("Customer 1 -> " + " Name and age is " + name1 + age1);
                    break;
                    
                case 2:
                    String name2;
                    String age2;
                    System.out.println("Enter the name of customer 2° and the age : ");
                    name2 = input.nextLine();
                    age2 = input.nextLine();
                    System.out.println("Customer 2 -> " + " Name and age is " + name2 + age2);
                    break;
                    
                case 3:
                    String name3;
                    String age3;
                    System.out.println("Enter the name of customer 3° and the age : ");
                    name3 = input.nextLine();
                    age3 = input.nextLine();
                    System.out.println("Customer 3 -> " + " Name and age is " + name3 + age3);
                    break;

                case 4:
                    System.out.println("__________________________ ");
                    System.out.println("  GOOD BYE MY FRIEND   ");
                    System.out.println("---  COME BACK SOON ---");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;
            }
        } while (option != 4);
                
    }
}
