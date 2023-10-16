import java.util.Scanner;

public class PredictDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day number between 1 and 366: ");
        int day = sc.nextInt();
        System.out.print("Enter a year (4 digits): ");
        int year = sc.nextInt();
        System.out.print("Enter n (1 to 100 inclusive): ");
        int n = sc.nextInt();
        if (day < 1 || day > 366 || year < 1000 || year > 9999 || n < 1 || n > 100) {
            System.out.println("Invalid dates.");
            System.exit(0);
        }
        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String[] mn = { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" };
        days[1] = leapYr(year);//leap yr
        int month = 0;
        while (day > days[month]) {
            day -= days[month];
            month++;
        }
        System.out.println("Entered date:" + day + "-" + mn[month] + "-" + year);

        day = day + n;
        while (day > days[month]) {
            day -= days[month];
            month++;
            if (month > 11) {
                month = 0;
                year++;
                days[1] = leapYr(year);//leap yr
            }
        }

        System.out.println("Future date:" + day + "-" + mn[month] + "-" + year);
    }

    static int leapYr(int yr) {
        if (yr % 4 == 0 && (yr % 100 != 0 || yr % 400 == 0)) {
            return 29;
        } else
            return 28;

    }
}
