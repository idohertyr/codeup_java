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
        Input input = new Input();
        System.out.println("Enter an interger between 20 and 30: ");
        input.getInt(20, 30);
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
        int num = 0;
        try {
            num = Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("Please enter *an integer* between " + min + " and " + max + ": ");
            return getInt(min, max);
        }

        if (num >= min && num <= max) {
            return num;
        }

        System.out.println(num + " number out of range, try again");
        return getInt(min, max);
    }

    public int getInt() {
        try {
            return Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("Please enter an *integer*: ");
            return getInt();
        }
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
        try {
            return Integer.valueOf(this.getString());
        } catch (NumberFormatException e) {
            System.out.println("Please enter an *integer*: ");
            return getDouble();
        }
    }
}
