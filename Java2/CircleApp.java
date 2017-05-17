public class CircleApp {
    public static void main(String[] args) {
        Input user = new Input();
        double radius = user.getInt(1, 10);
        Circle circle = new Circle(radius);
        circle.printCircle();
    }
}