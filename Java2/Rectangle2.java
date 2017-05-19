/**
 * Compiliation: javac Rectangle2.java
 * Execution: java Rectangle2
 *
 * An example of an extends sub class implementing a interface.
 */

public class Rectangle2 extends Quadralateral implements Measureable {

    public Rectangle2(double length, double width) {
        super(length, width);
    }

    public double getPerimeter() {
        return 2 * this.length + 2 * this.width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

}
