import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array A[]: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        System.out.println("Enter elements of array A[] in ascending order:");
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        System.out.print("Enter the size of array B[]: ");
        int m = sc.nextInt();
        int[] B = new int[m];
        System.out.println("Enter elements of array B[] in descending order:");
        for (int i = 0; i < m; i++) {
            B[i] = sc.nextInt();
        }

        int[] C = mergeArrays(A, B);
        System.out.println("Array C[] with non-repeated elements in ascending order:");
        for (int i = 0; i < C.length; i++) {
            if (i != 0 &&C[i] ==0)
                continue;
            else
                System.out.print(C[i] + " ");
        }
    }

    static int[] mergeArrays(int A[], int B[]) {
        int C[] = new int[A.length + B.length];
        int a = 0;
        int b = B.length - 1;
        int c = 0;
        while (a < A.length && b >= 0) {
            if (A[a] < B[b]) {
                if (isDuplicatePresent(C, A[a]))
                    a++;
                else
                    C[c++] = A[a++];
            } else {
                if (isDuplicatePresent(C, B[b]))
                    b--;
                else
                    C[c++] = B[b--];
            }
        }
        while (a < A.length) {
            if (isDuplicatePresent(C, A[a]))
                a++;
            else
                C[c++] = A[a++];
        }
        while (b >= 0) {
            if (isDuplicatePresent(C, B[b]))
                b--;
            else
                C[c++] = B[b--];
        }
        return C;
    }

    static boolean isDuplicatePresent(int ar[], int n) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == n)
                return true;
        }
        return false;
    }
}
