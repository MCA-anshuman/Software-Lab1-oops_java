
//Write a java program to multiply two given matrices.
import java.util.Scanner;
 public class MatrixMultiplication
 {
     // Function to multiply two matrices
     public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2)
     {
        int rowsMatrix1 = matrix1.length;
        int colsMatrix1 = matrix1[0].length;
        int rowsMatrix2 = matrix2.length;
        int colsMatrix2 = matrix2[0].length;
      // Check if multiplication is possible
      if (colsMatrix1 != rowsMatrix2)
        {
            System.out.println("Matrix multiplication is not possible due to incompatible dimensions.");
            return null;
        }
        // Create a result matrix with appropriate dimensions
        int[][] result = new
        int[rowsMatrix1][colsMatrix2];
        // Perform matrix multiplication
        for (int i = 0; i < rowsMatrix1; i++)
            {
                for (int j = 0; j < colsMatrix2; j++)
                    {
                        result[i][j] = 0;
                        for (int k = 0; k < colsMatrix1; k++)
                        {
                            result[i][j] += matrix1[i][k] * matrix2[k][j];
                        }
                    }
            }
        return result;
    }
    // Function to print a matrix
    public static void printMatrix(int[][] matrix)
    {
        for(int i = 0; i < matrix.length; i++)
            {
                for (int j = 0; j < matrix[i].length; j++)
                {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Input for first matrix
        System.out.println("Enter the number of rows and columns for the first matrix:");
        int rows1 = scanner.nextInt();
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        System.out.println("Enter the elements of the first matrix:");
        for (int i = 0; i < rows1; i++)
            {
                for (int j = 0; j < cols1; j++)
                {
                    matrix1[i][j] = scanner.nextInt();
                }
            }
        // Input for second matrix
        System.out.println("Enter the number of rows and columns for the second matrix:");
        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();
        int[][] matrix2 = new int[rows2][cols2];
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < rows2; i++)
        {
            for (int j = 0; j < cols2; j++)
            {
                    matrix2[i][j] = scanner.nextInt();
            }
        }
        // Multiply matrices
        int[][] result = multiplyMatrices(matrix1, matrix2);
        // Print the result matrix if multiplication is possible
        if (result != null)
        {
            System.out.println("The result of matrix multiplication is:");
            printMatrix(result);
        }
        scanner.close();
    }
}
