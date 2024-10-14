
import java.util.Scanner;

class Q1NumberFormatException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String input = sc.nextLine();
            int num = Integer.parseInt(input);
            System.out.println("The input you gave is :"+input);
        } catch (NumberFormatException e) {
            System.out.println("You have to pass integer input");
        }
        sc.close();
    }
}
