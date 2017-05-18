/**
 * Compiliation: javac ArrayIteration.java
 * Execution: java ArrayIteration
 *
 * An example of array iteration in Java.
 */

public class ArrayIteration {
    public static void main(String[] args) {
        String[] languages = {"HTML", "CSS", "JavaScript", "Java"};

        /* For loop iteration */
        System.out.println("I know the following languages: ");
        for (int i = 0; i < languages.length; i++) {
            System.out.println(languages[i]);
        }

        // enhanced for loop
        for (String language : languages) {
            System.out.println(language);
        }

        /* For loop with sum of numbers array. */
        int[] numbers = {2, 12, 23, 40, 78, 100};
        int sum = 0;
        for (int j = 0; j < numbers.length; j++) {
            sum += numbers[j];
            System.out.println(numbers[j]);
        }
        System.out.println("Total: " + sum);

        sum = 0;
        for (int number : number) {
            sum += number;
        }
        System.out.println("The sum of all the numbers is: " + sum);

    }
}