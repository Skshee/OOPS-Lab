import java.util.Scanner;
class Bank{
    double interest;
    double getInterest(){
        return interest;
    }
}

class SBI extends Bank{
    SBI(){
        interest=7;
    }
}

class ICICI extends Bank{
    ICICI(){
        interest=5;
    }
}

class HDFC extends Bank{
    HDFC(){
        interest=10;
    }
}

class Q3BankInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Bank: ");
        String Bank = sc.nextLine();
        if(Bank.equals("SBI"))
        {
            SBI s = new SBI();
            System.out.println(s.getInterest());
        }
        if(Bank.equals("ICICI"))
        {
            ICICI ici = new ICICI();
            System.out.println(ici.getInterest());
        }
        if(Bank.equals("HDFC"))
        {
            HDFC h = new HDFC();
            System.out.println(h.getInterest());
        }
        sc.close();
    } 
}