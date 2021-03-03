/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilataxikq11;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class PilataxiKQ11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int number [] = new int[5];
        int i = 0;
        int sum = 0;
        System.out.println("Enter the numbers: " );
        sum = getSumOfTheArrayNumbers(i, number, input, sum);
        System.out.println("The sum is equal to -> " + sum);
    
        float num[]=new float[3];
        int x = 0;
        float average = 0;
        System.out.println("Enter the numbers: ");
        average = getAverageOfTheArrayNumbers(x, num, input, average);
        System.out.println("The average is equal to -> "+average/num.length);
        
        boolean flag = false;
        int[] seatsByCar = {12,23,34,98,87,65,0};
        System.out.println("What number do you want to see if it exists ? ");
        int numbers;
        numbers = input.nextInt();

        for(int i=0 ; i < seatsByCar.length; i++){
            if (numbers == seatsByCar[i]) {
                System.out.println("✔ The number exists in the list ");
                flag = true;
            }
        }
        if(flag == false) {
            System.out.println("The number is unlisted ");
       }
    }

    private static float getAverageOfTheArrayNumbers(int x, float[] num, Scanner input, float average) {
        for(x = 0; x < num.length; x++){
            num[x]=input.nextInt();
        }
        for(x = 0; x < num.length; x++){
            average = (average + num[x]);
        }
        return average;
    }

    private static int getSumOfTheArrayNumbers(int i, int[] number, Scanner input, int sum) {
        for(i = 0; i < number.length; i++){
            number[i]=input.nextInt();
        }
        for(i = 0; i < number.length; i++){
            sum = sum +number[i];
        }
        return sum;
    }
}

    

 
       
