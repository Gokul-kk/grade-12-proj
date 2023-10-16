import java.util.Scanner;

public class InsertionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[10];
        System.out.println("Enter 10 elements: ");
        for (int i = 0; i < 10; i++) {
            ar[i] = sc.nextInt();
        }
        int n = ar.length;
        int curnt, j;
        for (int i = 1; i < 10; i++) {
            curnt = ar[i];
            j = i - 1;
            while (j >= 0 &&ar[j] > curnt) {
                ar[j+1] = ar[j--];
            }
            ar[j+1] = curnt;
        }
        System.out.print("sorted array = ");
        for (int i = 0; i < ar.length; i++) {
                System.out.print(ar[i] + " ");
        }
    }
}