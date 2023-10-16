import java.util.Scanner;

public class EqMat {
    int a[][], m, n;

    EqMat(int mm, int nn) {
        m = mm;
        n = nn;
        a = new int[m][n];
    }

    void readarray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    static int check(EqMat P, EqMat Q) {
        if (P.m != Q.m || P.n != Q.n)
            return 0;
        for (int i = 0; i < P.m; i++) {
            for (int j = 0; j < P.n; j++) {
                if (P.a[i][j] != Q.a[i][j])
                    return 0;
            }
        }
        return 1;
    }

    void print() {
        System.out.println("OUTPUT:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        EqMat Mat1 = new EqMat(3, 3);
        EqMat Mat2 = new EqMat(3, 3);
        Mat1.readarray();
        Mat2.readarray();
        int out = check(Mat1, Mat2);
        if (out == 1) {
            System.out.println("equal matrix");
            Mat1.print();
        } else {
            System.out.println("unequal matrix");
        }
    }
}
