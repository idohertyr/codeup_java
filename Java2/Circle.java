/**
 * Compilation: javac Circle.java
 *
 * Circle methods.
 */

import java.lang.Math;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {

    }

    public double getArea() {
        // A = pi*r^2
        double radius = this.radius;
        double pi = Math.PI;
        double area = pi * Math.pow(radius, 2);
        return area;
    }

    public double getCircumference() {
        double radius = this.radius;
        double pi = Math.PI;
        double circumference = (2*pi)*radius;
        return circumference;
    }

    public void printCircle() {
        System.out.printf("Printing circle:\n Radius -> %.2f\n Area -> %.2f\n Circumference -> %.2f\n",
                this.radius,
                this.getArea(),
                this.getCircumference());
    }

}