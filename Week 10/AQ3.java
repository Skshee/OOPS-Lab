// Custom exception class for Even Number
class EvenNumberException extends Exception {
    public EvenNumberException(String message) {
        super(message);
    }
}

public class AQ3 {

    // Method to check if a number is even and raise the custom exception
    public static void checkEvenNumber(int number) throws EvenNumberException {
        if (number % 2 == 0) {
            throw new EvenNumberException("EvenNumberException: " + number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6}; // Example numbers

        for (int number : numbers) {
            try {
                checkEvenNumber(number); // Check each number
            } catch (EvenNumberException e) {
                // Handle the exception
                System.out.println(e.getMessage());
            }
        }
    }
}
