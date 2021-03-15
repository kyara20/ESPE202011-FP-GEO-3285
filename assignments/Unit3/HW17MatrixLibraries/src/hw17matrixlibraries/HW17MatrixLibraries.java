package hw17matrixlibraries;

import ec.edu.espe.matrix.MatrixOperation;
import java.util.Scanner;

/**
 *
 * @author Kyara Lizeth
 */
public class HW17MatrixLibraries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        float [][] a;
        float [][] b;
        float [][] t;
        float [][] c;
        int m =0;
        int n=0;
        int row1 = 0;
        int column1 = 0;
        int row2 = 0;
        int column2 = 0;
        
        // MATRIX MULTIPLICATION
        System.out.print("Enter the number of rows in the first matrix : ");
        row1 = input.nextInt();
        System.out.print("Enter the number of columns in the first matrix : ");
        column1 = input.nextInt();
        System.out.print("Enter the number of rows in the second matrix : ");
        row2 = input.nextInt();
        System.out.print("Enter the number of columns in the second matrix : ");
        column2 = input.nextInt();
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
        // TRANSPOSED MATRIX AND ADDITION  MATRIX 
        System.out.println("•••• ENTER THE MATRIX DIMENSIONS ••••");
        System.out.print("Enter the number of rows: ");
        m= input.nextInt();
        System.out.print("Enter the number of columns : ");
        n= input.nextInt();  
        a= new float[m][n];
        b= new float[m][n];
        c= new float[m][n];
        t=new float[n][m];
        
        System.out.println(">> Enter the elements of the matrix <<"); 
        a = readMatrixElements(m, n, "A",input);
        b = readMatrixElements(m, n, "A",input);
         
        for(int tab=0; tab<= n/2; tab++){  
        }
           System.out.println("★ MATRIX A ★ ");
           prettyPrintMatrix(m, n, a);
           
           System.out.println("★ MATRIX B ★ ");
            prettyPrintMatrix(m, n, b);
            
            MatrixOperation.calculateTransposedMatrix(n, m, t, a);
                    
            
        for(int tab=0; tab<= n/2; tab++){  
        }
        System.out.println("★ TRANSPOSED MATRIX ★ ");
        prettyPrintMatrix(m, n, t);         
        System.out.println("MATRIX RESULTING FROM THE SUM");
        c = MatrixOperation.calculateAddTwoMatrices(m, n, a, b);
        prettyPrintMatrix(m, n, c);
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

    public static float[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float [][] matrix;
        matrix=new float [m][n];
        for(int i=0; i< m; i++){
            System.out.println("--Row Numbers" + (i+1) + "--");
        for(int j=0; j< n; j++){
             System.out.print(matrixName + "[" + (i+1) + "][" + (j+1)+ "] ->");
             matrix[i][j] = input.nextFloat();
        }
        }
        return matrix;
        }

    public static void prettyPrintMatrix(int m, int n, float[][] matrix) {
        for (int i=0; i< m; i++){
            System.out.println("");
            for(int j=0; j< n; j++){
                if(j== 0){
                    if(i== 0){
                     System.out.println("\t");
                    }else if (i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)){
                    System.out.println("\t");
                }
                if ( j== (n - 1)){
                    if (i == 0){
                        System.out.println("\t");
                    } else if ( i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
    }
    public static void printMatrix(int m, int n, float[][] matrix){
        for (int i=0; i< m; i++){
            System.out.println("");
            for(int j=0; j< n; j++){
                if(j== 0){
                    if(i== 0){
                     System.out.println("\t");
                    }else if (i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)){
                    System.out.println("\t");
                }
                if ( j== (n - 1)){
                    if (i == 0){
                        System.out.println("\t");
                    } else if ( i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
    }
}