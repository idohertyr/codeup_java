/**
 * Compilation: javac ArraysExample.java
 * Execution: java ArrayExample
 *
 * An example of array manipulation.
 */

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] prices = new int[10];
        for (int price : prices) {
            System.out.println(price);
        }

        Arrays.fill(prices, 5);
        for (int price : prices) {
            System.out.println(price);
        }

        int[] threeNumbers = {1, 2, 3};
        int[] sameThreeNumbers = {1, 2, 3};

        /* Checks memeory location */
        System.out.println(threeNumbers == sameThreeNumbers);
        /* Order matters! */
        System.out.println(Arrays.equals(threeNumbers, sameThreeNumbers));

        int [] thirdCopy = Arrays.copyOf(threeNumbers, threeNumbers.length);
        System.out.println(Arrays.toString(thirdCopy));

        int[] moreNumbers = {2, 56, 7, 34, 20, 45, 67};

        int index = Arrays.binarySearch(moreNumbers, 34);
        System.out.println("34 is at index: " + index);

        System.out.println(Arrays.binarySearch(moreNumbers, -56));

    }
}