/**
 * Compiliation: javac Square.java
 * Execution: java Square
 *
 * An example of an extended class.
 */

import java.lang.Math;

public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public static void main(String[] args) {
        /* main function */
    }

    public String printSquare() {
        return String.format("%.2f x %.2f Square!", this.length, this.width);
    }
}
