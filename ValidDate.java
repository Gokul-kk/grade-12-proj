import java.util.Scanner;

public class ValidDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter date of birth in dd/mm/yyyy");// input ask maam before wrting
        int dd = sc.nextInt();
        int mm = sc.nextInt();
        int yyyy = sc.nextInt();
        if(isValid(dd, mm, yyyy)){
            System.out.println("\nValid date");
            System.out.println("No:days = " + daysCal(dd, mm, yyyy));
        }
        else
            System.out.println("Invalid date");
    }

    static boolean isValid(int d, int m, int y) {
        if (d < 1 || d > 31 || m < 1 || m > 12 || y < 1000 || y > 9999)
            return false;
        else
            return true;
    }

    static int daysCal(int d, int m,int y){
        int day[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        if(y%4==0 && (y%100!=0 || y%400==0))
            day[2] = 29;
        int days = d;
        for(int i = 1;i<m;i++){
            days+=day[i];
        }
        return days;
    }
}
