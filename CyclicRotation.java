import java.util.Scanner;
import java.util.StringTokenizer;

public class CyclicRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sentence with max 5 words:");
        String str = sc.nextLine().toUpperCase();
        StringTokenizer s = new StringTokenizer(str);
        int l;
        String c = "",out = str;
        while(s.hasMoreTokens()){
            c= s.nextToken();
            l= c.length(); 
            out = out.substring(l) +" "+out.substring(0, l);
            System.out.println(out);
            out = out.trim();
        }

    }
}