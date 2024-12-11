import java.util.*;

public class Q5 {

    public static int[][] MultiplyMatrix(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        int[][] resultMatrix = new int[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                int sum = 0;
                for (int k = 0; k < colsA; k++) {
                    sum += matrixA[i][k] * matrixB[k][j];
                }
                resultMatrix[i][j] = sum;
            }
        }

        return resultMatrix;
    }

    public static void main(String[] args) {
        int n, m;
        int[][] Matrix1;
        int x, y;
        int[][] Matrix2;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter row and columns of matrix-1 : ");
        n = input.nextInt();
        m = input.nextInt();

        Matrix1 = new int[n][m];
        System.out.println("Enter " + n + " x " + m + " matrix : ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                Matrix1[i][j] = input.nextInt();
            }
        }

        System.out.print("Enter row and columns of matrix-2 : ");
        x = input.nextInt();
        y = input.nextInt();

        if (m != x) {
            System.out.println("Matrix multiplication is not possible!");
            input.close();
            return;
        }

        Matrix2 = new int[x][y];
        System.out.println("Enter " + x + " x " + y + " matrix : ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                Matrix2[i][j] = input.nextInt();
            }
        }

        int[][] resultMatrix = MultiplyMatrix(Matrix1, Matrix2);

        System.out.println("Resultant matrix after multiplication:");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[0].length; j++) {
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
