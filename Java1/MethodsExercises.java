/**
 * Compilation: javac MethodsExercises.java
 * Execution: java MethodsExercises
 *
 * Arithmetic Operations.
 */
import java.util.Scanner;
import java.util.Random;

public class MethodsExercises {
    public static void main(String[] args) {
        double x = 5;
        double y = 10;
        /* 1. Basic Arithmetic */
        /*
        System.out.println(add(x,y));
        System.out.println(subtract(x,y));
        System.out.println(multiply(x,y));
        System.out.println(divide(x,y));
        */
        /* 2. Validate user input */
        /*
        System.out.println("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
        System.out.printf("%d", userInput);
        */
        /* 3. Calculate the factorial of a number */
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer from 1 to 10");
        int number = getInteger(1, 10);
        int factorial = getFactorial(number);
        System.out.printf("Factorial: %d", factorial);
        */
        /* 4. Create an application that simulates dice rolling. */
        /*
        Scanner scanner = new Scanner(System.in);
        String answer = "yes";
        do {
            System.out.println("Enter the number of sides for each dice");
            int diceSides = scanner.nextInt();
            System.out.printf("%d\n", rollDice(diceSides));
            System.out.printf("%d\n", rollDice(diceSides));
            System.out.println("Roll again?");
            answer = scanner.next();
        } while (answer.equals("yes"));
        */
        /* 5. Game Development 101 */
        playGame();
    }
    /* 1. Basic Arithmetic */
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        return x / y;
    }

    public static double modulus(double x, double y) {
        return x % y;
    }

    /* 2. Validate user input in a  certain range. */
    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        while ((number < min) || (number > max)) {
            System.out.println("Enter a different number: ");
            number = scanner.nextInt();
        }
        return number;
    }

    /* 3 Calculate the factorial of a number. */
    public static int getFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    /* 4. Create an application that simulates dice rolling. */
    public static int rollDice(int n) {
        Random rand = new Random();
        return rand.nextInt(n) + 1;
    }

    /* 5. Game devlopment 101 */
    public static void playGame() {
        Random rand = new Random();
        int random = rand.nextInt(100) + 1;
        int userGuess = -1;
        while (userGuess != random) {
            System.out.println("Guess a number: ");
            userGuess = getInteger(1, 100);
            if (userGuess > random) {
                System.out.println("LOWER");
            }
            if (userGuess < random) {
                System.out.println("HIGHER");
            }
        }
        System.out.println("GOOD GUESS!");
    }
}