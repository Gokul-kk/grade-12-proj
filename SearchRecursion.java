import java.util.Scanner;

public class SearchRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 nos:");
        int ar[] = new int[10];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.print("Enter search item:");
        int x = sc.nextInt();
        int r = search(ar, 0, 9, x);
        if (r == -1)
            System.out.println("element not found");
        else
            System.out.println("element found at index" + r);

    }

    static int search(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return search(arr, l, mid - 1, x);
            return search(arr, mid + 1, r, x);
        }
        return -1;
    }
}
