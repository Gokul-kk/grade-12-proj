import java.util.Scanner;

public class Denomintion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amt:");
        int amt = sc.nextInt();
        int t = amt,c, ar[] = {2000, 500, 200, 100, 50, 20, 10, 1};
        for(int i = 0;i<ar.length;i++){
            c = t / ar[i];
            if (c != 0)
                System.out.println(ar[i] + "\t*\t"+ c + "\t=\t" + (c * ar[i]));
            t = t % ar[i];
        }
    }
}
