import java.util.Scanner;

public class AQ4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input telephone number
        System.out.print("Enter a telephone number in the format (555) 555-5555: ");
        String phoneNumber = scanner.nextLine();
        
        // Extracting the area code
        String areaCode = phoneNumber.substring(1, 4); // Extracting digits 2 to 4 (555)
        
        // Extracting the first three digits of the phone number
        String firstThreeDigits = phoneNumber.substring(6, 9); // Extracting digits 7 to 9 (555)
        
        // Extracting the last four digits of the phone number
        String lastFourDigits = phoneNumber.substring(10, 14); // Extracting digits 11 to 14 (5555)
        
        // Displaying the results
        System.out.println("Area Code: " + areaCode);
        System.out.println("Seven-digit Phone Number: " + firstThreeDigits + "-" + lastFourDigits);
        
        scanner.close();
    }
}
