import java.util.Scanner;

public class CircularPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();
        sc.close();
        if(isPrime(num)&&num>0){
            System.out.println(num);
            int l = (""+num).length();
            int temp= swth(num, l);
            boolean flag = true;
            while(num!=temp){
                if(isPrime(temp))
                    System.out.println(temp);
                else{
                    System.out.println("Not Circular prime");
                    flag = false;
                    break;
                }
                temp = swth(temp, l);
            }
            if(flag){
                System.out.println(num + " is CircularPrime");
            }
        }
        else{
            System.out.println("Entered value not prime");
            System.exit(0);
        }
    }

    public static boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                c++;
        }
        return c == 2;
    }

    static int swth(int n, int l) {
        int div = (int) Math.pow(10, l - 1);
        int fd = n / div;
        n %= div;
        return (n * 10) + fd;
    }

}
