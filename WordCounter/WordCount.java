import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter '1' to input text manually or '2' to provide a file path: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        String text = "";
        
        if (choice == 1) {
            System.out.println("Enter the text: ");
            text = scanner.nextLine();
        } else if (choice == 2) {
            System.out.print("Enter the path of the file: ");
            String filePath = scanner.nextLine();
            
            try {
                text = readTextFromFile(filePath);
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
                return;
            }
        } else {
            System.err.println("Invalid choice. Please enter '1' or '2'.");
            return;
        }
        
        int wordCount = countWords(text);
        
        System.out.println("Total word count: " + wordCount);
    }

    private static String readTextFromFile(String filePath) throws IOException {
        File file = new File(filePath);
        Scanner fileScanner = new Scanner(file);
        StringBuilder stringBuilder = new StringBuilder();

        while (fileScanner.hasNextLine()) {
            stringBuilder.append(fileScanner.nextLine());
            stringBuilder.append(" "); // Add a space between lines
        }

        fileScanner.close();
        return stringBuilder.toString();
    }

    private static int countWords(String text) {
        String[] words = text.split("[\\s\\p{Punct}]+");
        return words.length;
    }
}
