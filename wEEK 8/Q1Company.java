import java.util.Scanner;
interface item{
  void TotalSales(double val);
  // All variables in interfaces are public, final and static by default
}

class Hardware implements item{
    String category;
    String manufacturer;
    double value;

    Hardware(String category, String manufacturer,double value){
        this.category=category;
        this.manufacturer=manufacturer;
        this.value=value;
    }

    void Display(){
        System.out.println(category);
        System.out.println(manufacturer);
    }

    @Override
    public void TotalSales(double value) {                 // All methods implemented by interfaces must be made public 
        System.out.println("The total sales in 3 months are:"+value*3);
    }
}

class Software implements item{
    String type;
    String OS;
    double value;

    Software(String type, String OS,double value){
        this.type=type;
        this.OS=OS;
        this.value=value;
    }

    void Display(){
        System.out.println(type);
        System.out.println(OS);
    }

    @Override
    public void TotalSales(double value) {                 
        System.out.println("The total sales in 3 months are:"+value*3);
    }
}

class Q1Company{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--Enter the hardware details--");
        System.out.print("Enter the category");
        String category = sc.nextLine();
        System.out.print("Enter the manufacturer");
        String manufacturer = sc.nextLine();
        System.out.print("Enter monthly sales");
        double HardValue = sc.nextDouble();
        sc.nextLine();
        Hardware h = new Hardware(category,manufacturer,HardValue);
        h.Display();
        h.TotalSales(HardValue);

        System.out.println("--Enter the software details--");
        System.out.println("Enter the type:");
        String type = sc.nextLine();
        System.out.println("Enter the OS:");
        String OS = sc.nextLine();
        System.out.print("Enter monthly sales");
        double SoftValue = sc.nextDouble();

        Software s = new Software(type,OS,SoftValue);
        s.Display();
        s.TotalSales(SoftValue);
        sc.close();
    }
}
