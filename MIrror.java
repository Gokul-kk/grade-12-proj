import java.util.Scanner;

public class MIrror {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        p("m =");
        int m = sc.nextInt();
        p("n =");
        int n = sc.nextInt();
        
        int arr[][] = new int[m][n];
        int nArr[][] = new int[m][n];
        
        p("array =\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                nArr[i][n - 1 - j] = arr[i][j]; 
            }
        }
        //print intg 
        p("INPUT =\n");
        pr(arr,m,n);
        p("OUTPUT =\n");
        pr(nArr,m,n);
    }
    static void p(String s){
        System.out.print(s);
    }
    static void pr(int ar[][],int m, int n){
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                p(ar[i][j] + "\t");
            }
            p("\n");
        }
    }
}
