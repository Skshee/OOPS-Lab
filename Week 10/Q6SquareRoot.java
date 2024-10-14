import java.util.Scanner;

public class Q6SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();

        try{
            double sqrt = Math.sqrt(num);
            System.out.println("The square root is"+sqrt);
        }
        catch(IllegalArgumentException e){
            System.out.println("Negative number");
        }
        sc.close();
    }
}
