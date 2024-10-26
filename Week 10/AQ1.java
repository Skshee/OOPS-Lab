import java.util.Scanner;

// Custom exception class
class Input_Exception extends Exception {
    public Input_Exception(String message) {
        super(message);
    }
}

public class AQ1 {

    // Method to validate the input
    public static int validateInput(double number) throws Input_Exception {
        if (number % 1 != 0) { // Check if the number is not an integer
            throw new Input_Exception("Floating-point numbers are not allowed.");
        }
        return (int) number;
    }
//Comment
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        
        while (true) {
            System.out.print("Enter an integer (or -1 to stop): ");
            try {
                double input = scanner.nextDouble(); // Accepts user input as double

                // Validate input and convert to integer
                int validatedInput = validateInput(input);

                // Stop when -1 is entered
                if (validatedInput == -1) {
                    break;
                }
                
                // Add validated integer to sum
                sum += validatedInput;

            } catch (Input_Exception e) {
                System.out.println(e.getMessage()); // Custom message for floating-point number
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter an integer.");
                scanner.next(); // Clear the invalid input
            }
        }

        System.out.println("Sum of all integers entered: " + sum);
        scanner.close();
    }
}
