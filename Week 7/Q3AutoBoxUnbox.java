public class Q3AutoBoxUnbox {

	// Main driver method
	public static void main(String[] args)
	{

		// Creating an Integer Object
		// with custom value say it be 10
		Integer i = 10;

		// Unboxing the Object
		int i1 = i;

        int k = 5;
        Integer k1 = k;

        System.out.println("Value of k:" + k);
		System.out.println("Value of k1: " + k1);

		// Print statements
		System.out.println("Value of i:" + i);
		System.out.println("Value of i1: " + i1);

		// Autoboxing of character
		Character C = 'a';

		// Auto-unboxing of Character
		char ch = C;

		// Print statements
		System.out.println("Value of ch: " + ch);
		System.out.println(" Value of C: " + C);
	}
}
