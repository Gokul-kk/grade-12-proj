import java.util.Scanner;

public class QUEUE {
    static int Q[];
    static int r = -1;
    static int f = -1;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Queue:");
        n = sc.nextInt();
        Q = new int[n];
  
        System.out.println("QUEUE operations:");
        System.out.println("1. INSERT");
        System.out.println("2. DELETE");
        System.out.println("3. Display");
        System.out.println("0. Exit");
        char c;///// try with int or string k?
        do {
            System.out.print("Enter choice:");
            c = sc.next().charAt(0);
            switch (c) {
                case '1':
                    System.out.println("enter element to be inserted");
                    int e = sc.nextInt();
                    insert(e);
                    break;
                case '2':
                int del = delete();
                    if ( del != -1)
                        System.out.println(del + " was deleted");
                    break;
                case '3':
                    display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (c != 0);
    }

    static void insert(int item) {
        if (r == n - 1) {
            System.out.println("QUEUE OVERFLOW");
            return;
        } else {
            if (f == -1 && r == -1) {
                f = r = 0;
                 
            } else {
                r++;
            }
            Q[r] = item;
        }
    }

    static int delete() {
        int v;
        if (f == -1 && r == -1) {
            System.out.println("QUEUE UNDERFLOW");
            return -1;
        } else {
            v = Q[f];
            if (f == r) {
                f = -1;
                r = -1;
            } else
                f++;
            return v;
        }
    }

    static void display() {
        if (f == -1 && r == -1) {
            System.out.println("QUEUE EMPTY");
        } else {
            System.out.print("QUEUE:");
            for (int i = f; i <= r; i++) {
                System.out.print(Q[i] + " ");
            }
            System.out.println();
        }
    }
}