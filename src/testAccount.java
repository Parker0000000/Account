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
        double withdraw = 0;
        int wod;
        double deposit = 0;

        System.out.println("Enter the annual intrest");
        newintrest = input.nextDouble();
        System.out.println("Enter the account id");
        newID = input.nextInt();
        System.out.println("Enter the ballance");
        newbalance = input.nextDouble();
        System.out.println("Do you want to 1 withdraw or 2 deposit");
        wod = input.nextInt();
        if (wod == 1) {
            System.out.println("Enter ammount to be withdrawn from account " + newID);
            withdraw = input.nextDouble();
        }
        else {
            System.out.println("Enter ammount to deposit on account " + newID);
            deposit = input.nextDouble();
        }
        Account bank = new Account(newID, newbalance, newintrest, withdraw, deposit);
        System.out.println(bank.Ammount());
    }
}