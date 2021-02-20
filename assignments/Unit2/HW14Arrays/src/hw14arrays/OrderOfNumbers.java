/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class OrderOfNumbers {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int groupA [], groupB [], groupC [];
        
        groupA = new int [10];  //Array of group "A" with 10 elements
        groupB = new int [10];  //Array of group "B" with 10 elements
        groupC = new int [20];  //Array of group "C" contain group A and B
        
        //Array of Group A
        System.out.println(">>> Enter the first array <<< ");
        for(int i = 0; i < 10; i++){
            System.out.print((i + 1) + ". Enter a number : ");
            groupA [i] = input.nextInt();
        }
        
        //Array of Group B
        System.out.println("\n>>> Enter the second array <<< ");
        for(int i = 0; i < 10; i++){
            System.out.print((i + 1) + ". Enter a number : ");
            groupB [i] = input.nextInt();
        }
        
        //Array of Group C (contains group A and B)
        //Use the iterator "i" for group A and B
        //Iterator "j" for group C
        int j = 0;
        for(int i = 0; i < 10; i++){
            groupC [j] = groupA [i];  // 1°GroupA, 2°GroupA...
            j++;
            groupC [j] = groupB [i];  // 1°GroupB, 2°GroupB...
            j++;   
        }
        
        System.out.print("\n The third array is : ");
        for(int i = 0; i < 20; i++){
            System.out.print(groupC [i] + " " );
        }
        System.out.println();
    }
    
}
