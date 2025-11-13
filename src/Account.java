

public class Account {
    private int ID;
    private double balance;
    private double annualinterestrate;
    private double datecreated;
    double days = datecreated;
    double newamount;
    double newasdf;

    Account() {
        ID = 0;
        balance =0;
        annualinterestrate = 0;
    }

    Account(int newID, double newbalance, double newintrest, double withdraw, double deposit) {
        ID = newID;
        balance = newbalance;
        annualinterestrate = newintrest;
        newamount = withdraw;
        newasdf = deposit;
    }

    int ID() {
        return ID;
    }
    double getmonthlyintrestrate() {
        return annualinterestrate / 12; 
    }
    double monthlyintrest() {
        return balance * (days * getmonthlyintrestrate());
    }
    double Withdraw() {
        return balance - newamount;
    }
    double Deposit() {
        return balance + newasdf;
    }
    double Ammount() {
        return balance;
    }
}