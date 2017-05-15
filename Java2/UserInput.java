/**
 * Compilation: javac UserInput.java
 * Execution: java Input
 *
 * Java II - Section 6.1
 * Create a input validation class.
 */

import java.util.Scanner;

public class UserInput implements UserInputInterface {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserInput user1 = new UserInput();
        System.out.println("Hello Input!");
        user1.yesNo();
        System.out.println("Get");
    }

    public String getString() {
        return scanner.next();
    }

    public boolean yesNo() {
        System.out.println("Yes or no?");
        char answer = scanner.next().charAt(0);
        return answer == 'y';
    }

    public int getInt(int min, int max) {
        return 5;
    }

    public int getInt() {
        return 6;
    }

    public double getDouble(double min, double max) {
        return 24.3;
    }

    public double getDouble() {
        return 25.3;
    }
}