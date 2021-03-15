package ec.edu.espe.matrix;
/**
 *
 * @author Kyara Lizeth
 */
public class MatrixOperation {
    
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
    
  public static void calculateTransposedMatrix(int n, int m, float[][] t, float[][] a) {
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                t[i][j] = a[j][i];
            }
        }
    }

    public static float[][] calculateAddTwoMatrices(int m, int n, float[][] a, float[][] b) {
        float[][] c;
        c = new float [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
}

