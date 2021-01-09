package numericprimitives;

import java.util.Scanner;

public class NumericPrimitivesShort {

    public static void main(String[] args) {
    
      Scanner dato = new Scanner(System.in);
      short n;
      System.out.println("Enter your age ");
      n = (short) dato.nextInt();
      
      if(n<=12)
          System.out.println("Children");
    
      else
      if (n<=17)
          System.out.println("Teen");
      
      else
      if (n<=30)
            System.out.println("Young");
      
      else
      if (n<=64)
            System.out.println("Adult");
      
      else
      if (n<=120)
            System.out.println("old man/woman");
     
    }
}
  
    
