import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[][] A = new int[n][n];
        System.out.println("Enter elements of array A 4x4:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        int[][] B = new int[n][n];
        System.out.println("Enter elements of array B 4x4:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        int[][] C = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++)
                    C[i][j] += A[i][k] * B[k][j];
            }
        }

        System.out.println("OUTPUT:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
