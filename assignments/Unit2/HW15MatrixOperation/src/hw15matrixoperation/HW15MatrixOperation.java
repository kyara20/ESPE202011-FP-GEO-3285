/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrixoperation;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Matrix Multiplication
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of rows in the first matrix : ");
        int row1 = input.nextInt();
        System.out.print("Enter the number of columns in the first matrix : ");
        int column1 = input.nextInt();
        System.out.print("Enter the number of rows in the second matrix : ");
        int row2 = input.nextInt();
        System.out.print("Enter the number of columns in the second matrix : ");
        int column2 = input.nextInt();
        System.out.println();
        System.out.println("•••••• DATA ENTERED •••••• ");
        System.out.println("Matrix 1 of : " + row1 + " x " + column1 );
        System.out.println("Matrix 2 of : " + row2 + " x " + column2 );
        System.out.println();
        
        if (column1 == row2) {
            int[][] matrix1 = new int[row1][column1];
            int[][] matrix2 = new int[row2][column2];
            int[][] resultingMatrix = new int[row1][column2];
            
            //Matrix 1
            System.out.println("★ MATRIX VALUES 1 ★ ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print("Enter the value of the element " + i + "," + j + " : ");
                    matrix1[i][j] = input.nextInt();
                }
            }
            System.out.println();
            System.out.println("Matrix 1");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column1; j++) {
                    System.out.print(matrix1[i][j] + "    ");
                }
                System.out.println();
                System.out.println();
            }
            //Matrix 2
            System.out.println();
            System.out.println("★ MATRIX VALUES 2 ★ ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print("Enter the value of the element " + i + "," + j + " : ");
                    matrix2[i][j] = input.nextInt();
                }
            }
            System.out.println();
            System.out.println("Matrix 2");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.print(matrix2[i][j] + "    ");
                }
                System.out.println();
                System.out.println();
            }
            // Resulting Matrix
            System.out.println();
            System.out.println("RESULTING MATRIX ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int h = 0; h < column1; h++) {
                        resultingMatrix[i][j] += matrix1[i][h] * matrix2[h][j];
                    }
                    System.out.print(resultingMatrix[i][j] + "    ");
                }
                System.out.println();
                System.out.println();
            }
        } else {
            System.out.println("Operation cannot be performed ");
        }
    }
}
    
