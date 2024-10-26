public class AQ2 {

    // Generic method to return the largest of three Comparable objects
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T maxValue = a; // Assume a is the maximum initially

        if (b.compareTo(maxValue) > 0) {
            maxValue = b; // b is larger
        }
        if (c.compareTo(maxValue) > 0) {
            maxValue = c; // c is larger
        }

        return maxValue; // Return the largest object
    }

    public static void main(String[] args) {
        // Test with different types of Comparable objects

        // Test with Integer
        Integer maxInt = max(10, 20, 15);
        System.out.println("Largest Integer: " + maxInt);

        // Test with Double
        Double maxDouble = max(5.5, 3.3, 4.4);
        System.out.println("Largest Double: " + maxDouble);

        // Test with String
        String maxString = max("Apple", "Orange", "Banana");
        System.out.println("Largest String: " + maxString);
    }
}
