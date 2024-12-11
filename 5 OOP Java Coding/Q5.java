import java.util.Scanner;

class Account {
    String account_holder_name;
    double balance;

    public Account(String account_holder_name, double balance) {
        this.account_holder_name = account_holder_name;
        this.balance = balance;
    }

    public void credit(double amount) {
        balance += amount;
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SBI extends Account {
    public SBI(String account_holder_name, double balance) {
        super(account_holder_name, balance);
    }

    public double calculate_interest() {
        return balance * 0.08;
    }
}

class HDFC extends Account {
    public HDFC(String account_holder_name, double balance) {
        super(account_holder_name, balance);
    }

    public double calculate_interest() {
        return balance * 0.07;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter SBI customer details");
        String sbiName = input.next();
        double sbiBalance = input.nextDouble();
        double sbiCredit = input.nextDouble();
        double sbiDebit = input.nextDouble();

        SBI sbiCustomer = new SBI(sbiName, sbiBalance);
        sbiCustomer.credit(sbiCredit);
        sbiCustomer.debit(sbiDebit);

        System.out.println("Enter HDFC customer details");
        String hdfcName = input.next();
        double hdfcBalance = input.nextDouble();
        double hdfcCredit = input.nextDouble();
        double hdfcDebit = input.nextDouble();

        HDFC hdfcCustomer = new HDFC(hdfcName, hdfcBalance);
        hdfcCustomer.credit(hdfcCredit);
        hdfcCustomer.debit(hdfcDebit);

        System.out.printf("%s %.0f %.0f %s %.0f %.0f\n",
                sbiCustomer.account_holder_name, sbiCustomer.balance, sbiCustomer.calculate_interest(),
                hdfcCustomer.account_holder_name, hdfcCustomer.balance, hdfcCustomer.calculate_interest());

        input.close();
    }
}
