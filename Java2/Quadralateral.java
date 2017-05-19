/**
 * Compiliation: javac Quadralateral.java
 * Execution: java Quadralateral
 *
 * A sub class that holds the variables and functions to define an abstract class.
 */

abstract class Quadralateral extends Shape implements Measureable {

    protected double length;
    protected double width;

    public Quadralateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /* Getter setter methods */
    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}