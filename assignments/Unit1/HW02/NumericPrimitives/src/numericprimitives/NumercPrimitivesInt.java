
package numericprimitives;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class NumercPrimitivesInt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your birthdate");
        
        System.out.println("Day: ");
        int day = sc.nextInt();
        
        System.out.println("Month: ");
        int month = sc.nextInt();
        
        System.out.println("Year: ");
        int year = sc.nextInt();
        
        LocalDate today = LocalDate.now();
        LocalDate birthdate = LocalDate.of(year, month, day);

        Period k = Period.between(birthdate, today);

        System.out.println("You're " + k.getYears() + " years, " + k.getMonths() + " months, " + k.getDays() + " days.");       

    }

}
        
 
