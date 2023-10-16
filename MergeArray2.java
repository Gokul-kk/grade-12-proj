import java.util.Arrays;
import java.util.Scanner;

public class MergeArray2 {
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
        for (int value : C) {
            System.out.print(value + " ");
        }
    }

    static int[] mergeArrays(int A[], int B[]) {
        Arrays.sort(B);
        int n = A.length;
        int m = B.length;
        int C[] = new int[n + m];
        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (A[i] <= B[j]) {
                C[k] = A[i];
                i += 1;
                k += 1;
            } else {
                C[k] = B[j];
                j += 1;
                k += 1;
            }
        }

        while (i < n) { // Merging remaining
                        // elements of a[] (if any)
            C[k] = A[i];
            i += 1;
            k += 1;
        }
        while (j < m) { // Merging remaining
                        // elements of b[] (if any)
            C[k] = B[j];
            j += 1;
            k += 1;
        }
        return C;
    }

    public static int removeDuplicates(int a[], int nn) {
        if (nn == 0 || nn == 1) {
            return nn;
        }
        int j = 0;
        for (int i = 0; i < nn - 1; i++) {
            if (a[i] != a[i + 1]) {
                a[j++] = a[i];
            }
        }
        a[j++] = a[nn - 1];
        return j;
    }
}
