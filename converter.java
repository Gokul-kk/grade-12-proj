import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p("MENU\n");
        p("1) Decimal to Bin:\n");
        p("2) Decimal to Oct:\n");
        p("choice:");
        char c = sc.next().charAt(0);
        switch (c) {
            case '1':
            p("Enter num in dec:");
                int bin = sc.nextInt();
                p(bin + " in bin is " + toBin(bin) + "\n");
                break;
            case '2':
                p("Enter num in dec:");
                int oct = sc.nextInt();
                p(oct + " in oct is " + toOct(oct) + "\n");
                break;
            default:
                p("invalid input" + "\n");
        }
    }

    static int toBin(int d) {
        if (d == 0)
            return 0;
        else
            return (toBin(d / 2) * 10 + (d % 2));
    }

    static int toOct(int d) {
        if (d < 8)
            return d;
        else
            return (toOct(d / 8) * 10 + (d % 8));
    }
    static void p(String a){
        System.out.print(a);
    }
}
