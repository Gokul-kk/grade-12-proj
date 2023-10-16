import java.util.Scanner;

public class Saddle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter order of square mattrix (n):");
        int n = sc.nextInt();
        if (n >= 20) {
            System.out.println("enter n less than 20");
            System.exit(0);
        }

        int ar[][] = new int[n][n];
        System.out.println("Enter elements of the matrix: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Row " + (i + 1) + " :");
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix:");
        pM(ar, n);
        if(!isSaddle(ar, n))
            System.out.println("NO SADDLE POINT");

        sc.close();
    }

    public static void pM(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean isSaddle(int ar[][], int n){
        for (int i = 0; i < n; i++)
        {
            // Find the minimum element of row i.
            // Also find column index of the minimum element
            int mr = ar[i][0], id = 0;
            for (int j = 1; j < n; j++){
                if (mr > ar[i][j]){
                    mr = ar[i][j];
                    id = j;
                }
            }
      
            // Check if the minimum element of row is also
            // the maximum element of column or not
            int k;
            for (k = 0; k < n; k++)
      
                // Note that id is fixed
                if (mr < ar[k][id])
                    break;
      
            // If saddle point is present in this row then
            // print it
            if (k == n)
            {
               System.out.println("Saddle Point " + mr);
               return true;
            }
        }
        // If Saddle Point not found
        return false;
    }
}
