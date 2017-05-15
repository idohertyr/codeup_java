/**
 * Compilation: javac Input.java
 * Execution: java Input
 *
 * Java II - Section 6.1
 * Create a input validation class.
 */

import java.util.Scanner;

public class UserInput implements UserInput {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hello Input!");
    }

    public static String getString() {
        return scanner.next();
    }
}