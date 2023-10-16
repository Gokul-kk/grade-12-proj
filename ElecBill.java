import java.util.Scanner;

public class ElecBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Consumer No:");
        String cN = sc.nextLine();
        System.out.println("Enter Consumer Name:");
        String name = sc.nextLine();
        System.out.println("Enter units consumed:");
        int units = sc.nextInt();
        double amount = 0;
        if (units <= 100) {
            amount = units * 10;
        } else if (units <= 200) {
            amount = 1000 + (units - 100) * 15;
        } else if (units <= 300) {
            amount = 1000 + 1500 + (units - 200) * 20;
        } else if (units > 300) {
            amount = 1000 + 1500 + 2000 + (units - 300) * 25;                                     
            amount += (amount + 3.5) / 100;
        } else
            System.out.println("Invalid unit");
        // print ing
        System.out.println("Consumer No.\tName\tUnits_Consumed\tAmount");
        System.out.println(cN +"\t"+ name +"\t"+ units +"\t"+ amount);
    }
}
