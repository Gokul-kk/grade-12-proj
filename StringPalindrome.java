import java.util.*;
class StringPalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter string:");
        String s = sc.nextLine();
        int n = s.length()-1;
        String rev = "";
        for(int i = n;i>=0;i--){
            rev+=s.charAt(i);
        }
        if(rev.equals(s))
        System.out.println(s + " == "+ rev);
        else
        System.out.println("nope");
    }    
}