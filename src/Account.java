import java.sql.Date;

public class Account {
    private int ID;
    private double balance;
    private double annualinterestrate;
    private Date datecreated;
    double monthlyintrestrate = annualinterestrate / 12;
    double days;

    Account() {
        ID = 0;
        balance =0;
        annualinterestrate = 0;
    }

    Account(int newID, double newbalance, double newintrest) {
        ID = newID;
        balance = newbalance;
        annualinterestrate = newintrest;
    }

    int ID() {
        return ID;
    }
    double getmonthlyintrestrate() {
        return annualinterestrate / 12; 
    }
    double monthlyintrest() {
        return balance * (days * monthlyintrestrate);
    }
}
