import java.util.Arrays;
import java.util.Scanner;

public class AQ1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create an array to hold the strings
        String[] strings = new String[n];

        // Accept strings from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }

        // Sort the array in alphabetical order
        Arrays.sort(strings);

        // Display the sorted array
        System.out.println("Strings in alphabetical order:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
