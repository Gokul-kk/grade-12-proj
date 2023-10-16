import java.util.Scanner;

public class STACK {
    static int S[];
    static int top = -1;
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Stack:");
        n = sc.nextInt();
        S = new int[n];

        System.out.println("Stack operations:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("0. Exit");
        char c;
        do {
            System.out.print("Enter choice:");
            c = sc.next().charAt(0);
            switch (c) {
                case '1':
                    System.out.println("enter element to be pushed");
                    int e = sc.nextInt();
                    push(e);
                    break;
                case '2':
                    int p = pop();
                    if (p != -1)
                        System.out.println(p + "was popped");
                    break;
                case '3':
                    display();
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (c != 0);
    }

    static void push(int eL) {
        if (top == n - 1) {
            System.out.println("STACK OVERFLOW");
        } else
            S[++top] = eL;
    }

    static int pop() {
        int v = 0;
        if (top == -1) {
            System.out.println("STACK UNDERFLOW");
            return -1;
        } else {
            v = S[top--];
        }
        return v;
    }

    static void display() {
        if (top == -1) {
            System.out.println("STACK EMPTY");
        } else {
            System.out.print("STACK:");
            for (int i = 0; i <= top; i++) {
                System.out.println(S[i] + "\t");
            }
        }
    }
}
