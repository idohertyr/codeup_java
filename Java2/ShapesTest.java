/**
 * Compiliation: javac ShapesTest.java
 * Execution: java ShapesTest
 *
 * Creates and tests the Rectangle and Square classes.
 */
public class ShapesTest {
    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(4, 5);
        System.out.println(box1.printRectangle());
        Square box2 = new Square(4);
        System.out.println(box2.printSquare());
    }
}
