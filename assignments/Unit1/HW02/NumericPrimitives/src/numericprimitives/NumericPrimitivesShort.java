package numericprimitives;

import java.util.Scanner;

public class NumericPrimitivesShort {

    public static void main(String[] args) {
    
      Scanner fact = new Scanner(System.in);
      short n;
      System.out.println("Enter your age ");
      n = (short) fact.nextInt();
      
      if(n<=12)
          System.out.println("You're children");
    
      else
      if (n<=17)
          System.out.println("You're teen");
      
      else
      if (n<=30)
            System.out.println("You´re young");
      
      else
      if (n<=64)
            System.out.println("You're adult");
      
      else
      if (n<=120)
            System.out.println("You're old man/woman");
     
    }
}
  
    
