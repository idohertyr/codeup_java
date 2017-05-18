/**
 * Compilation: javac Input.java
 * Execution: java Input
 *
 * Java II - Section 6.1
 * Create a input validation class.
 */

import java.util.Scanner;

public class Input implements InputInterface  {

    private Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {

    }

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        System.out.println("(Y/n) ?");
        String answer = scanner.next();
        return ("y".equalsIgnoreCase(answer));
    }

    public int getInt(int min, int max) {
        int userInput;
        do {
            userInput = scanner.nextInt();
        } while((userInput < min) || (userInput > max));
        return userInput;
    }

    public int getInt() {
        return scanner.nextInt();
    }

    public double getDouble(double min, double max) {
        double userInput;
        do {
            System.out.printf("Enter a double between %.2f and %.2f\n", min, max);
            userInput = scanner.nextDouble();
        } while((userInput <= min) || (userInput >= max));
        return userInput;
    }

    public double getDouble() {
        return scanner.nextDouble();
    }
}
