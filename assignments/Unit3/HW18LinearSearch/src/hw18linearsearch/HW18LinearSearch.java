/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18linearsearch;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW18LinearSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int findItems;
        int position;
        
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Programmer -> Kyara Lizeth");
        System.out.println("-->> SEQUENTIAL SEARCH <<-- ");
        System.out.print("Item to search: ");
        findItems = input.nextInt();
        position = sequentialSearch(array, findItems);
        System.out.println("The element is in the position: " + position);
        
        int findItems1;
        int[] array1 = {20, 10, 60, 90, 50, 80, 30, 70, 40, 100};
        Arrays.sort(array1);
        System.out.println("-->> BINARY SEARCH <<-- ");
        System.out.println(Arrays.toString(array1));
        System.out.print("Item to search: ");
        findItems1 = input.nextInt();
        int position1 = Arrays.binarySearch(array1, findItems1);
        if(position1 == -1){
        System.out.println("The value of " + findItems1 + " not in the arrangement ");
        }else{
            System.out.println("The value of " + findItems1 + " is in the position: " + position1);
        }
    }
    
    public static int sequentialSearch (int elements[], int x){
        
        int n = elements.length;
        for(int i = 0; i < n; i++){
            if(elements[i] == x)
                return i;
        }
        return -1;
    }
    
     public static int binarySearch (int[] elements, int left, int right, int x){
        if(right >= left){
            int mid = left + (right -left) / 2;
             
            if(elements[mid] == x)
                return mid;
             
            if(elements[mid] > x)
                return binarySearch(elements, mid + 1, right, x);
            
            return binarySearch(elements, mid + 1, right, x);
        }
        return -1;
    }
}


