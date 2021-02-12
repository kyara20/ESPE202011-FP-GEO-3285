/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13taks;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class WS13Taks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {     
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            option = printMenu(input);

            switch (option) {

                case 1:
                    findTriangleArea(input);
                    break;
                    
                case 2:
                    findCircleArea(input);
                    break;
                    
                case 3:
                    findTrapezeArea(input);
                    break;
                    
                case 4:
                    findSpeedKilometersHours(input);
                    break;
                    
                case 5:
                    findDistanceBetweenTwoPoints(input);
                    break;
                    
                case 6:
                    findFinalSpeed(input);
                    break;
                    
                case 7:
                    System.out.println("__________________________ ");
                    System.out.println("  GOOD BYE MY FRIEND   ");
                    System.out.println("---  COME BACK SOON ---");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }
        } while (option != 7);

    }

    private static int printMenu(Scanner input) {
        int option;
        System.out.println("        WELCOME TO OUR MENU     ");
        System.out.println("__________  PROGRAMMER  ____________");
        System.out.println("      >>>>  Kyara Lizeth  <<<<");
        System.out.println(" ======  CHOOSE AN OPTION  ====== ");
        System.out.println("1. Triangle Area ");
        System.out.println("2. Circle Area ");
        System.out.println("3. Trapeze Area ");
        System.out.println("4. Speed ​​in Kilometers / hours ");
        System.out.println("5. Distance between two points");
        System.out.println("6. Freefall: Final speed");
        System.out.println("7. EXIT  ");
        System.out.println("Enter you menu option -->");
        option = input.nextInt();
        return option;
    }

    private static void findFinalSpeed(Scanner input) {
        float finalSpeed;
        float initialSpeed;
        float gravity;
        float time;
        System.out.println("Enter the initial speed : ");
        initialSpeed = input.nextFloat();
        System.out.println("Enter gravity : ");
        gravity = input.nextFloat();
        System.out.println("Enter time in seconds : ");
        time = input.nextFloat();
        finalSpeed = initialSpeed + (gravity * time);
        System.out.println("The final speed is -> " + finalSpeed + " m/s ");
    }

    private static void findDistanceBetweenTwoPoints(Scanner input) {
        double X1;
        double Y1;
        double X2;
        double Y2;
        double distance1;
        System.out.println("Enter the X coordinate of the first point -> ");
        X1 = input.nextDouble();
        System.out.println("Enter the Y coordinate of the first point -> ");
        Y1 = input.nextDouble();
        System.out.println("Enter the X coordinate of the second point -> ");
        X2 = input.nextDouble();
        System.out.println("Enter the Y coordinate of the second point -> ");
        Y2 = input.nextDouble();
        distance1 = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
        System.out.printf("The distance between two points is -> " + distance1);
    }

    private static void findSpeedKilometersHours(Scanner input) {
        double distance;
        double minutes;
        double seconds;
        double hundredths;
        double timeInSeconds;
        double speed;
        double speedKmH;
        System.out.println("Enter the distance traveled in meters : ");
        distance = input.nextDouble();
        System.out.println("Enter the minutes : ");
        minutes = input.nextDouble();
        System.out.println("Enter the seconds : ");
        seconds = input.nextDouble();
        System.out.println("Enter the hundredths : ");
        hundredths = input.nextDouble();
        timeInSeconds = (minutes * 60) + seconds + (hundredths / 100);
        speed = distance / timeInSeconds;
        speedKmH = (speed * 3600)/1000;
        System.out.println("The speed equals to -> " + speedKmH + " Km/h ");
    }

    private static void findTrapezeArea(Scanner input) {
        double majorBase;
        double minorBase;
        double height1;
        double area2;
        System.out.println("Enter major base : ");
        majorBase = input.nextDouble();
        System.out.println("Enter minor base : ");
        minorBase = input.nextDouble();
        System.out.println("Enter height : ");
        height1 = input.nextDouble();
        area2 = ((majorBase + minorBase)/2)* height1;
        System.out.println("The area of ​​the trapeze is -> " + area2);
    }

    private static void findCircleArea(Scanner input) {
        double radius;
        double area1 = Math.PI;
        System.out.println("Enter radius : ");
        radius = input.nextDouble();
        area1 = area1 * radius * radius;
        System.out.println("The area of ​​the circle is -> " + area1);
    }

    private static void findTriangleArea(Scanner input) {
        double base;
        double height;
        double area;
        System.out.println("Enter base : ");
        base = input.nextDouble();
        System.out.println("Enter height : ");
        height = input.nextDouble();
        area = (base * height)/2;
        System.out.println("The area of ​​the triangle is -> " + area);
    }
                    
}

