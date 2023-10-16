import java.util.Scanner;

public class Fiborecur {
    int limit;

    Fiborecur() {
        limit = 0;
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter limit:");
        limit = sc.nextInt();
    }

    int fib(int n) {
        if (n == 0 || n == 1)
            return n;
        else
            return (fib(n-1)+ fib(n-2));
    }
    void generateFib(){
        for(int i = 0;i<limit;i++){
            System.out.print(fib(i) + ",");
        }
    }

    public static void main(String[] args) {
        Fiborecur ob = new Fiborecur();
        ob.input();
        ob.generateFib();
    }
}
