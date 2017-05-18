import java.lang.Math;

public class Square {

    private double side;
    private double area;
    private double perimeter;

    public Square(double side) {
        this.side = side;
        this.area = getArea();
        this.perimeter = getPerimeter();
    }

    public static void main(String[] args) {
        System.out.println("Square");
    }

    public double getArea() {
        return Math.pow(this.side, 2);
    }

    public double getPerimeter() {
        return 4 * this.side;
    }

    public void printSquare() {
        System.out.printf("Square:" +
                        "\n Side: %.2f" +
                        "\n Area: %.2f" +
                        "\n Perimeter: %.2f" +
                        "\n",
                this.side,
                this.area,
                this.perimeter);
    }
}
