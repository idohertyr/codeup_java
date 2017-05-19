/**
 * Compiliation: javac Rectangle.java
 * Execution: java Rectangle
 *
 * An example of an abract class to extend.
 */
public class Rectangle {

    protected double length;
    protected double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        /* main function */
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * this.width) + (2 * this.length);
    }

    public String printRectangle() {
        return String.format("%.2f x %.2f Rectangle", this.length, this.width);
    }
}