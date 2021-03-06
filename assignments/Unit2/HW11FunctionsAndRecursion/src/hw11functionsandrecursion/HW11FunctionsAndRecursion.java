/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11functionsandrecursion;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW11FunctionsAndRecursion {

/**
 * @param args the command line arguments
     * @throws java.io.IOException
 */
public static void main(String[] args) throws IOException {
    // TODO code application logic here
    
        Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do {
            System.out.println("        WELCOME TO OUR MENU     ");
            System.out.println("__________  PROGRAMMER  ____________");
            System.out.println("      >>>>  Kyara Lizeth  <<<<");

            System.out.println(" ======  CHOOSE AN OPTION  ====== ");
            System.out.println("1. Rectangle Area ");
            System.out.println("2. Inches to Millimeters ");
            System.out.println("3. Yards to Meters ");
            System.out.println("4. Miles to Kilometers ");
            System.out.println("5. Distance between two points");
            System.out.println("6. Encrypted code");
            System.out.println("7. EXIT  ");

            System.out.println("Enter you menu option -->");
            option = input.nextInt();

            switch (option) {

                case 1:
                    findRectangleArea(input);
                    break;

                case 2:
                    findLengthConversionInches(input);
                    break;

                case 3:
                    findLengthCorversionYards(input);
                    break;

                case 4:
                    findLengthConversionMiles(input);
                    break;

                case 5:
                    findDistanceBetweenTwoPoints(input);
                    break;

                case 6:
                    Scanner scanner = new Scanner(System.in);
                    String text;
                    int code;
                    do {
                        System.out.println("Enter text: ");
                        text = scanner.nextLine();
                    } while (text.isEmpty());
                    do {
                        System.out.println("Enter code: ");
                        code = scanner.nextInt();
                    } while (code < 1);
                    do {
                        scanner.nextLine();
                        System.out.println("(E) encrypt; (D) decrypt?: ");
                        option = (char) System.in.read();
                    } while (Character.toUpperCase(option) != 'E' && Character.toUpperCase(option) != 'D');
                    if (Character.toUpperCase(option) == 'E') {
                        System.out.println("Text encrypt: " + encryptCesar(text, code));
                    } else {
                        System.out.println("Text decrypt: " + decryptCesar(text, code));
                    }
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

    private static void findDistanceBetweenTwoPoints(Scanner input) {
        double X1;
        double Y1;
        double X2;
        double Y2;
        double distance;
        System.out.println("Enter the X coordinate of the first point -> ");
        X1 = input.nextDouble();
        System.out.println("Enter the Y coordinate of the first point -> ");
        Y1 = input.nextDouble();
        System.out.println("Enter the X coordinate of the second point -> ");
        X2 = input.nextDouble();
        System.out.println("Enter the Y coordinate of the second point -> ");
        Y2 = input.nextDouble();
        distance = Math.sqrt((X2 - X1) * (X2 - X1) + (Y2 - Y1) * (Y2 - Y1));
        System.out.printf("The distance between two points is -> " + distance);
    }

    private static void findLengthConversionMiles(Scanner input) {
        double miles;
        double kilometers;
        System.out.println("Enter the miles to convert -> ");
        miles = input.nextDouble();
        kilometers = miles * 1.6093;
        System.out.println(miles + " miles equal to " + kilometers + " kilometers ");
    }

    private static void findLengthCorversionYards(Scanner input) {
        double yards;
        double meters;
        System.out.println("Enter the yards to convert -> ");
        yards = input.nextDouble();
        meters = yards * 0.9144;
        System.out.println(yards + " yards equal to " + meters + " meters ");
    }

    private static void findLengthConversionInches(Scanner input) {
        double inches;
        double millimeters;
        System.out.println("Enter the inches to convert -> ");
        inches = input.nextDouble();
        millimeters = inches * 25.4;
        System.out.println(inches + " inches equal to " + millimeters + " millimeters ");
    }

    private static void findRectangleArea(Scanner input) {
        int area;
        int base;
        int height;
        System.out.println("Enter base -> ");
        base = input.nextInt();
        System.out.println("Enter height -> ");
        height = input.nextInt();
        area = base * height;
        System.out.println("The rectangle area is --> " + area);
    }

    //Method to encrypt the text
    private static String encryptCesar(String text, int code) {
        StringBuilder encrypt = new StringBuilder();
        code = code % 26;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                if ((text.charAt(i) + code) > 'z') {
                    encrypt.append((char) (text.charAt(i) + code - 26));
                } else {
                    encrypt.append((char) (text.charAt(i) + code));
                }
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                if ((text.charAt(i) + code) > 'Z') {
                    encrypt.append((char) (text.charAt(i) + code - 26));
                } else {
                    encrypt.append((char) (text.charAt(i) + code));
                }
            }
        }
        return encrypt.toString();
    }

    //Method to decrypt the text
    private static String decryptCesar(String text, int code) {
        StringBuilder decrypt = new StringBuilder();
        code = code % 26;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                if ((text.charAt(i) - code) < 'a') {
                    decrypt.append((char) (text.charAt(i) - code + 26));
                } else {
                    decrypt.append((char) (text.charAt(i) - code));
                }
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                if ((text.charAt(i) - code) < 'A') {
                    decrypt.append((char) (text.charAt(i) - code + 26));
                } else {
                    decrypt.append((char) (text.charAt(i) - code));
                }
            }
        }
        return decrypt.toString();
    }
}

