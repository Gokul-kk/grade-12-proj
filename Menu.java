import java.util.*;

class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num:");
        int num = sc.nextInt();
        System.out.println("MENU");
        System.out.println("A) Smith");
        System.out.println("B) Prime-Adam");
        System.out.print("Enter choice:");
        char c = sc.next().charAt(0);
        switch (c){
            case 'A':
                if (isSmithNumber(num))
                    System.out.println(num + " is a smith number");
                else
                    System.out.println(num + " is not a smith num");
                break;

            case 'B':
                if (isPrimeAdam(num))
                    System.out.println(num + " is a PrimeAdam number");
                else
                    System.out.println(num + " is not a PrimeAdam num");
                System.out.print("Enter value of m = :");
                int m = sc.nextInt();
                System.out.print("Enter value of n = :");
                int n = sc.nextInt();
                sc.close();
                if(m<n){
                    int freq = 0;
                    System.out.print("Prime adam numbers in range between m & n = ");
                    for(int i =m+1;i<n;i++){
                        if (isPrimeAdam(i)){
                            freq++;
                            System.out.print(i + ",");
                        }    
                    }
                    System.out.println();
                    System.out.println("frequency of Prime adam number is = " + freq);
                }
                break;
            default:
                System.out.println("wrong choice");
        }
    }

    public static boolean isSmithNumber(int n) {
        if (n <= 0 && isPrime(n) && n != 1) {
            return false;
        }
        int sD = 0;
        int temp = n;
        while (temp != 0) {
            int d = temp % 10;
            sD += d;
            temp /= 10;
        }

        int sPD = 0;
        temp = n;
        for (int i = 2; i < temp; i++) {
            while (temp % i == 0) {
                temp /= i;
                int t = i;
                while (t != 0) {
                    int d = t % 10;
                    sPD += d;
                    t /= 10;
                }
            }
        }
        if (temp > 2) {
            while (temp != 0) {
                int d = temp % 10;
                sPD += d;
                temp /= 10;
            }
        }
        if (sPD == sD)
            return true;
        else
            return false;

    }

    public static boolean isPrimeAdam(int n) {
        if (isPrime(n)) {
            int sqNum = n * n;
            int revNum = reverse(n);
            int sqRevNum = revNum * revNum;
            int rev = reverse(sqNum);

            return rev == sqRevNum;

        } else
            return false;
    }

    public static int reverse(int num) {
        int rev = 0;

        while (num != 0) {
            int d = num % 10;
            rev = rev * 10 + d;
            num /= 10;
        }

        return rev;
    }

    public static boolean isPrime(int n) {
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) c++;
        }
        return c == 2;
    }
}
