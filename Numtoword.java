import java.util.Scanner;

public class Numtoword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no:");
        String s = sc.nextLine(),out= "";
        for(int i = 0 ; i <s.length();i++){
            out+= toWord(s.charAt(i)) + " ";
        }
        System.out.println("num to word = " + out.trim());
    }

    public static String toWord(char c) {
        switch (c) {
            case '0':
                return "zero";
            case '1':
                return "one";
            case '2':
                return "two";
            case '3':
                return "three";
            case '4':
                return "four";
            case '5':
                return "five";
            case '6':
                return "six";
            case '7':
                return "seven";
            case '8':
                return "eight";
            case '9':
                return "nine";
            default:
                return "";
        }
    }
}
