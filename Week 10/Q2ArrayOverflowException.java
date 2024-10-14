import java.util.Scanner;

public class Q2ArrayOverflowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= new int[6];

        try {
            System.out.print("Enter the position:");
            int pos = sc.nextInt();
            System.out.print("Enter the number:");
            int number = sc.nextInt();
            arr[pos-1]= number;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of limits");
        }
        sc.close();
    }
}
