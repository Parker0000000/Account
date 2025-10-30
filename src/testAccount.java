import java.sql.Date;
import java.util.Scanner;

public class testAccount {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int ID;
        double balance;
        int newID;
        Date datecreated;
        double newintrest;
        double newbalance;

        System.out.println("Hello, World!");
        newID = input.nextInt();
        newbalance = input.nextDouble();
        newintrest = input.nextDouble();
        Account bank = new Account(newID, newbalance, newintrest);
        System.out.println(bank.getmonthlyintrestrate());
    }
}
