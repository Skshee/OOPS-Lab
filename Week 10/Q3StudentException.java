import java.util.Scanner;

public class Q3StudentException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter your name");
            String name = sc.nextLine();
            System.out.println("Enter Roll number:");
            String input1 = sc.nextLine();
            int RollNo = Integer.parseInt(input1);
            System.out.println("Enter Marks:");
            String input2 = sc.nextLine();
            int marks = Integer.parseInt(input2);
        } 
        catch (NumberFormatException e) {
            System.out.println("Illegal Input");
        }
    }
}
