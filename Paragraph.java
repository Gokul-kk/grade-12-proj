import java.util.Scanner;
import java.util.StringTokenizer;

public class Paragraph {// fix formating// study tokenizer thourglhy
    static String vow = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter paragraph with max 5 sentences(terminated by  .or ! or ? ):");
        String str = sc.nextLine();
        int c = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '.' || str.charAt(i) == '!' || str.charAt(i) == '?')
                c++;
            if (c > 5) {
                System.out.println("more than 5 sentences");
                return;
            }
        }
        StringTokenizer st = new StringTokenizer(str, ".!?", true);
        String out = "";
        while (st.hasMoreTokens()) {
            out += arrange(st.nextToken()).trim();
        }
        System.out.println("OUTPUT:" + out.trim());
        System.out.println("Vowels:" + vow);
    }

    public static String arrange(String s) {
        StringTokenizer stt = new StringTokenizer(s);
        int t = stt.countTokens(), i = 0;
        String crt, nxt, out = "", temp;
        String[] wrds = new String[t];
        while (stt.hasMoreTokens())
            wrds[i++] = stt.nextToken();

        for (i = 0; i < wrds.length; i++) {
            for (int j = 0; j < wrds.length - 1; j++) {
                crt = wrds[j];
                nxt = wrds[j + 1];
                if (crt.compareTo(nxt)>0) {
                    temp = wrds[j];
                    wrds[j] = wrds[j + 1];
                    wrds[j + 1] = temp;
                }
            }
        }
        for (int j = 0;j<wrds.length;j++) {
            out += wrds[j] + " ";
            if (isVowel(wrds[j].charAt(0)) && isVowel(wrds[j].charAt(wrds[j].length() - 1)))
                vow += wrds[j] + " ";
        }
        return out;
    }

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
