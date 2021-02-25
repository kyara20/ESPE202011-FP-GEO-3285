/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfunction;

import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW16MatrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        readDataEntered(row1, column1, row2, column2);
        System.out.println();
        
        if (column1 == row2) {
            int[][] matrix1 = new int[row1][column1];
            int[][] matrix2 = new int[row2][column2];
            int[][] resultingMatrix = new int[row1][column2];
            
            //Matrix 1
            System.out.println("★ MATRIX VALUES 1 ★ ");
            readMatrixElements1(row1, column1, matrix1, input);
            
            System.out.println();
            
            System.out.println("Matrix 1");
            printMatrix1(row1, column1, matrix1);
            
            //Matrix 2
            System.out.println();
            System.out.println("★ MATRIX VALUES 2 ★ ");
            readMatrixElements2(row2, column2, matrix2, input);
            
            System.out.println();
            
            System.out.println("Matrix 2");
            printMatrix2(row2, column2, matrix2);
            
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
    
    public static int [][] multiplyTwoMatrices (int [][] matrix1, int[][] matrix2, int row1, int column1, int column2){
  
       int[][] resultingMatrix = new int [row1][column2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                for (int h = 0; h < column1; h++) {
                    resultingMatrix[i][j] += matrix1[i][h] * matrix2[h][j];
                }
            }
        }
        return resultingMatrix;
    } 

    private static void readDataEntered(int row1, int column1, int row2, int column2) {
        System.out.println("Matrix 1 of : " + row1 + " x " + column1 );
        System.out.println("Matrix 2 of : " + row2 + " x " + column2 );
    }
        
    private static void printMatrix2(int row2, int column2, int[][] matrix2) {
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print(matrix2[i][j] + "    ");
            }
            System.out.println();
            System.out.println();
        }
    }

    private static void printMatrix1(int row1, int column1, int[][] matrix1) {
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(matrix1[i][j] + "    ");
            }
            System.out.println();
            System.out.println();
        }
    }

    private static void readMatrixElements2(int row2, int column2, int[][] matrix2, Scanner input) {
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                System.out.print("Enter the value of the element " + i + "," + j + " : ");
                matrix2[i][j] = input.nextInt();
            }
        }
    }

    private static void readMatrixElements1(int row1, int column1, int[][] matrix1, Scanner input) {
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print("Enter the value of the element " + i + "," + j + " : ");
                matrix1[i][j] = input.nextInt();
            }
        }
    }
}