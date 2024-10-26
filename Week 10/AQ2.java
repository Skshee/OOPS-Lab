// Custom exception class for Array Overflow
class ArrayOverflowException extends Exception {
    public ArrayOverflowException(String message) {
        super(message);
    }
}

public class AQ2 {
    private int[] array;
    private int currentIndex;

    // Constructor to initialize the array with a fixed size
    public AQ2(int size) {
        array = new int[size];
        currentIndex = 0;
    }

    // Method to add an element to the array
    public void addElement(int element) throws ArrayOverflowException {
        if (currentIndex >= array.length) {
            throw new ArrayOverflowException("Array is full. Cannot add more elements.");
        }
        array[currentIndex] = element;
        currentIndex++;
    }

    // Method to display the elements of the array
    public void displayArray() {
        System.out.print("Array elements: ");
        for (int i = 0; i < currentIndex; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AQ2 demo = new AQ2(5); // Fixed size of 5 elements

        try {
            // Adding elements to the array
            demo.addElement(10);
            demo.addElement(20);
            demo.addElement(30);
            demo.addElement(40);
            demo.addElement(50);

            // Attempting to add an extra element to trigger the exception
            demo.addElement(60); // This should cause an exception

        } catch (ArrayOverflowException e) {
            // Handle the exception
            System.out.println(e.getMessage());
        }

        // Display array elements
        demo.displayArray();
    }
}
