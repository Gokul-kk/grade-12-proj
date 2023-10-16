import java.util.StringTokenizer;

public class Sentence {
    protected String sent;

    Sentence(String s) {// main methid + output
        sent = s;
    }

    int longestWord() {
        StringTokenizer str = new StringTokenizer(sent);
        String lw = str.nextToken(), cw = "";
        while (str.hasMoreTokens()) {
            cw = str.nextToken();
            if (lw.length() < cw.length()) {
                lw = cw;
            }
        }
        return lw.length();
    }

    void print() {
        System.out.println("sentence = " + sent);
    }
}

class EditString extends Sentence {
    char c;
    String word;

    EditString(char ch, String w, String ss) {
        super(ss);
        c = ch;
        word = w;
    }

    int frequency() {
        int f = 0;
        StringTokenizer str = new StringTokenizer(sent);
        String cw = "";
        while (str.hasMoreTokens()) {
            cw = str.nextToken();
            if (word.equals(cw))
                f++;
        }
        return f;
    }

    void removeDuplicates() {
        String out = "";
        for (int i = 0; i < sent.length() - 1; i++) {
            if (sent.charAt(i) == sent.charAt(i + 1))
                out += sent.charAt(i);
            else
                out += sent.charAt(i) + sent.charAt(i + 1);
        }
        System.out.println(out);
    }
    public static void main(){
        EditString ob = new EditString('A', "hai", "hhaaii pprogram");
        ob.removeDuplicates();
        ob.print();
        System.out.println("l:" + ob.longestWord());
        System.out.println("freq = " + ob.frequency());
    }
}
