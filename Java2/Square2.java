/**
 * Compiliation: javac Square2.java
 * Execution: java Square2
 *
 * An example of an extended sub class of Quandralateral.
 */

public class Square2 extends Quadralateral {

    public Square2(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    public double getArea() {
        return length * width;
    }

}

