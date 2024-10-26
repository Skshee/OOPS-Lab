public class AQ1 {

    // Generic method to print array of any type
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // New line after printing the array
    }

    public static void main(String[] args) {
        // Test with different types of arrays

        // Array of Integers
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.print("Integer Array: ");
        printArray(intArray);

        // Array of Strings
        String[] stringArray = {"Hello", "World", "Generics", "in", "Java"};
        System.out.print("String Array: ");
        printArray(stringArray);

        // Array of Doubles
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.print("Double Array: ");
        printArray(doubleArray);

        // Array of Characters
        Character[] charArray = {'A', 'B', 'C', 'D', 'E'};
        System.out.print("Character Array: ");
        printArray(charArray);
    }
}
