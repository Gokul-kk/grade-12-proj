import java.util.Scanner;

public class MatrixFilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array M: ");
        int N = sc.nextInt();
        char[][] M = new char[N][N];
        System.out.println("FIRST CHARACTER:");
        char c1 = sc.next().charAt(0);
        System.out.println("SECOND CHARACTER:");
        char c2 = sc.next().charAt(0);
        System.out.println("THIRD CHARACTER:");
        char c3 = sc.next().charAt(0);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == N - 1) || (i == N - 1 && j == 0)
                        || (i == N - 1 && j == N - 1)) {
                    M[i][j] = c1;
                } else if (i == 0 || j == 0 || j == N - 1 || i == N - 1) {
                    M[i][j] = c2;
                } else
                    M[i][j] = c3;

            }

        }

        System.out.println("OUTPUT:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }

    }
}
