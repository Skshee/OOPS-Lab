import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AQ5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a five-letter word from the user
        System.out.print("Enter a five-letter word: ");
        String inputWord = scanner.nextLine();
        
        // Check if the word is exactly five letters
        if (inputWord.length() != 5) {
            System.out.println("Please enter exactly five letters.");
            scanner.close();
            return;
        }

        // Set to store unique three-letter combinations
        Set<String> threeLetterWords = new HashSet<>();

        // Generate all combinations of three letters
        for (int i = 0; i < inputWord.length(); i++) {
            for (int j = 0; j < inputWord.length(); j++) {
                for (int k = 0; k < inputWord.length(); k++) {
                    if (i != j && i != k && j != k) { // Ensure unique letters
                        String threeLetterWord = "" + inputWord.charAt(i) + inputWord.charAt(j) + inputWord.charAt(k);
                        threeLetterWords.add(threeLetterWord); // Add to the set
                    }
                }
            }
        }

        // Display the unique three-letter words
        System.out.println("Possible three-letter words:");
        for (String word : threeLetterWords) {
            // Here, you can check against a dictionary if needed
            System.out.println(word);
        }

        scanner.close();
    }
}
