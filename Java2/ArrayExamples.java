/**
 * Compiliation: javac ArrayExamples.java
 * Execution: java AraryExamples
 *
 * An example of basic Arrays in Java.
 *
 * Arrays are 0 indexed, items must be same type,
 * and size needs to be specified.
 */

public class ArrayExamples {
    public static void main(String[] args) {
        double[] prices; // variable declatation
        prices = new double[4]; // Initialization and specify size of array

        prices[0] = 12.5;
        System.out.println(prices[0]);
        System.out.println(prices[3]);

        String[] names;
        names = new String[6];
        System.out.println(names[3]);

        boolean[] apples;
        apples = new boolean[10];

        int[] oranges = new int[20]; // declaration + initialization

        Scanner input = new Scanner(System.in);
        System.out.println("How many elements should this array have?");
        int size = input.nextInt();

        int [] elements = new int[size];

        // enumerate the elements of the array on creation
        String[] beatles = {"John", "Paul", "George", "Ringo"};
        System.out.println(beatles[2]);

        String[] beatlesCopy = new String[4];
        beatlesCopy[0] = "John";
        beatlesCopy[1] = "Paul";
        beatlesCopy[2] = "George";
        beatlesCopy[3] = "Ringo";

        Product[] myBasket = {
                new Product("Mango", 2.5),
                new Product("Coke", 1.5)
        };

        System.out.println(mybasket[0].format());

        System.out.println(beatles[beatles.length - 1]);

    }
}