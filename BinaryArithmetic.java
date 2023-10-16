import java.util.Scanner;

public class BinaryArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bin 1 not more than 4 bits:");
        int bin1 = sc.nextInt();
        System.out.print("Enter bin 2 not more than 4 bits:");
        int bin2 = sc.nextInt();

        int len1 = ("" + bin1).length();
        int len2 = ("" + bin2).length();
        if (len1 > 4 || len2 > 4) {
            System.out.println("Error:entered number must be not more than 4 bits each");
            System.exit(0);
        }
        // extra to check for binary

        int carry = 0, last = 0;
        String out = "";
        while (bin1 != 0 || bin2 != 0) {
            last = (int) ((bin1 % 10 + bin2 % 10 + carry) % 2);
            carry = (int) ((bin1 % 10 + bin2 % 10 + carry) / 2);
            bin1 /= 10;
            bin2 /= 10;
            out = ("" + last) + out;
        }
        if (carry != 0)
            out = "1" + out;

        System.out.println("\nOUTPUT = " + out);
        System.out.println("Decimal Equivalent:" + toDec(Integer.valueOf(out)));

    }

    static int toDec(int bin) {
        int out = 0,i=0;
        while(bin>0){
            out+=bin%10 * (int)(Math.pow(2,i));
            i++;
            bin/=10;
        }
        return out;
    }
}
