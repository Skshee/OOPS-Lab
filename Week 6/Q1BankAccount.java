import java.util.Scanner;

class Account {
    String name;
    int AccNo;
    double balance;
    double minimum=10000;
    //System.out.println("Enter Balance Amount:");
    void Deposit(double amount){
        balance = balance+amount;
    }
    void DisplayBalance(){
        System.out.println("Balance :"+balance);
    }
}


class SavingsAccount extends Account{
    double interest=3.5;
    SavingsAccount(String name,int AccNo,double balance){
        this.name=name;
        this.AccNo=AccNo;
        this.balance=balance;
    }
    void ComputeInterest(){
        double amount=balance*(interest/100);
        System.out.println("Interest to be paid is:"+amount);
    }
    double WithdrawAmount(double withdraw){
        double amount=balance-withdraw;
        return amount;
    }
}

class CurrentAccount extends Account{
    double interest;
    CurrentAccount(String name,int AccNo,double balance){
        this.name=name;
        this.AccNo=AccNo;
        this.balance=balance;
    }
    void ComputeInterest(){
        System.out.println("No Interest in Current account");
    }
    double WithdrawAmount(double withdraw){
        double balance=this.balance-withdraw;
        return balance;
    }
}

class Q1BankAccount{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the customer:");
    String name=sc.nextLine();
    System.out.print("Enter the account number:");
    int AccNo=sc.nextInt();
    System.out.print("Enter the balance amount");
    double balance=sc.nextDouble();
    System.out.print("Enter the amount to be Deposited:");
    double amount = sc.nextDouble();
    System.out.print("Enter the withdrawal amount:");
    double withdraw = sc.nextDouble();
    System.out.println("Enter S for Savings and C for Current");
    char flag = sc.next().charAt(0);
    if(flag=='S'){
        SavingsAccount s = new SavingsAccount(name,AccNo,balance);
        s.Deposit(amount);
        s.DisplayBalance();
        s.ComputeInterest();
        System.out.println("The balance after withdrawal is:"+s.WithdrawAmount(withdraw));
        s.DisplayBalance();
    }
    if(flag=='C'){
        CurrentAccount c = new CurrentAccount(name,AccNo,balance);
        c.Deposit(amount);
        c.DisplayBalance();
        c.ComputeInterest();
        System.out.println("The balance after withdrawal is:"+c.WithdrawAmount(withdraw));
    }
    sc.close();
}
}