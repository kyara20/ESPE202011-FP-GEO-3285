
        package numericprimitives;

import java.util.Scanner;

public class NumericPrimitivesFloat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        float height = sc.nextFloat();
        if (height >= 1.80){
        System.out.println("You're tall");
    } else {
            System.out.println("You're short");
       } 
    }
}

   
