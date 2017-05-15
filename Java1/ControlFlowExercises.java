/**
 * Compilation: javac ControlFlowExercises.java
 * Execption: java ControlFlowExercises
 *
 * Control statements and loops.
 */

import java.lang.Math;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        /* 1. Loop Basics */
        //int i = 5;
        //while (i<=15) {
            //System.out.printf("%d\n", i);
            //i++;
        //}
        /* Do while */
        //int j = 2;
        //do {
            //j = j * j;
            //System.out.println(j);
        //} while (j < 10000);
        /* For */
        //for (int k = 2; k < 10000; k=k*k) {
            //System.out.println(k);
        //}

        /* FizzBuzz
        for( int a = 1; a<=100; a++) {
            if ((a % 3 == 0) && (a % 5 == 0)) {
                System.out.println("Fizz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 == 0) {
                System.out.println("FizzBuzz");
            }
        }
        */

        /* 3. Display a table of powers.
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int cursor = 0;
        String userContinue = "yes";
        do {
            System.out.println("Enter a number");
            number = scanner.nextInt();
            System.out.printf("number\t|\tsquared\t|\tcubed\n");
            while (cursor < number) {
                cursor++;
                System.out.printf("%d\t|\t%d\t|\t%d\n", cursor, (cursor * cursor),(cursor * cursor * cursor));
            }
            System.out.println("continue?");
            userContinue = scanner.next();
        } while (userContinue.equals("yes"));
        */

        /* Convert given number grades into letter grades

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your grade (0 to 100)");
        int grade = scanner.nextInt();
        char letter = 'F';
        if (grade > 87) {
            letter = 'A';
        } else if (grade > 79) {
            letter = 'B';
        } else if (grade > 69) {
            letter = 'C';
        } else if (grade > 59) {
            letter = 'D';
        } else {
            letter = 'F';
        }
        System.out.println(letter);
    }
}