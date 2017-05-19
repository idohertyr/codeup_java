/**
 * Compiliation: javac ShapesTest2.java
 * Execution: java ShapesTest2
 *
 * Creates and tests the Rectangle and Square classes.
 */

public class ShapesTest2 {

    public static void main(String[] args) {
        Measureable myShape = new Rectangle2(2, 3);
        System.out.printf("Perimeter: %.2f Area: %.2f\n", myShape.getPerimeter(), myShape.getArea());
    }

}
