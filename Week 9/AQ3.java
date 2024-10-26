import java.util.Scanner;

public class AQ3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to hold the five strings
        String[] strings = new String[5];
        
        // Accept five strings from the user
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            strings[i] = scanner.nextLine();
        }
        
        // Concatenate the strings
        StringBuilder concatenatedString = new StringBuilder();
        for (String str : strings) {
            concatenatedString.append(str); // Append each string
        }
        
        // Display the concatenated string
        System.out.println("Concatenated String: " + concatenatedString.toString());
        
        scanner.close();
    }
}
