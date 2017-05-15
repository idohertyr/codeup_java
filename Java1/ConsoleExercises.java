/**
 * Compilation: javac ConsoleExersies.java
 * Execution: java ConsoleExercises
 *
 * Examples of java.util.Scanner I/O operations
 */
import java.io.IOException;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) throws IOException {
        // create a new scanner
        Scanner scanner = new Scanner(System.in);
        /* Use nextInt to get user integer */
        System.out.print("Enter Integer:\n");
        try{
            int i = scanner.nextInt();
            System.out.printf("%d\n", i);
        }catch(NumberFormatException nfe){
            System.err.println("Invalid Format!\n");
        }
        /* Use next to get 3 strings from user */
        System.out.println("Enter 3 words:");
        String first = scanner.next();
        String second = scanner.next();
        String third = scanner.next();

        System.out.printf("%s %s %s\n", first, second, third);

        /* Use nextLine to capture user sentence */
        System.out.println("Enter a sentence:");
        try{
            String userSentence = scanner.nextLine();
            userSentence = scanner.nextLine();
            System.out.printf("%s\n", userSentence);
        }catch(NumberFormatException nfe){
            System.out.println("No sentence");
        }

        System.out.println("Enter length: ");
        int length = scanner.nextInt();

        System.out.println("Enter width: ");
        int width = scanner.nextInt();

        System.out.printf("area: %d\n", length*width);
        System.out.printf("perimeter: %d\n", 2*length+2*width);

        // close the scanner
        scanner.close();
    }
}