import java.util.Scanner;

public class ArrayInsDel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the element to be inserted: ");
        int eL = sc.nextInt();
        System.out.print("Enter the p to insert (0 to " + (n-1) + "): ");
        int posIns = sc.nextInt();

        array = insertElement(array, eL, posIns);
        System.out.println("Array after inserting element:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.print("\nEnter the p to delete (0 to " + (n) + "): ");
        int posDel = sc.nextInt();

        array = deleteElement(array, posDel);

        System.out.println("Array after deleting element:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertElement(int[] arr, int element, int p) {
        int n = arr.length + 1;
        int[] nA = new int[n];

        for (int i = 0, j = 0; i < n; i++) {
            if (i == p) {
                nA[i] = element;
            } else {
                nA[i] = arr[j++];
            }
        }

        return nA;
    }

    public static int[] deleteElement(int[] arr, int p) {
        int n = arr.length - 1;
        int[] nA = new int[n];

        for (int i = 0, j = 0; i < n; i++, j++) {
            if (j == p) {
                j++; // Skip the element to be deleted
            }
            nA[i] = arr[j];
        }

        return nA;
    }
}   