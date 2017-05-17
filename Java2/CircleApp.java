/**
 * Compilation: javac Input.java Circle.java CircleApp.java
 * Execution: java CircleApp
 *
 * Asks user for radius of circle, then prints out the area and circumference.
 */

public class CircleApp {
    public static void main(String[] args) {
        Input user = new Input();
        System.out.println("Enter a radius for a cirle:");
        double radius = user.getInt();
        Circle circle = new Circle(radius);
        circle.printCircle();
    }
}