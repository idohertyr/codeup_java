public class Rectangle {

    private double length;
    private double width;

    private double area;
    private double perimeter;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
        this.area = getArea();
        this.perimeter = getPerimeter();
    }

    public static void main(String[] args) {
        System.out.println("Hello Rectanlge");
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return (2 * this.width) + (2 * this.length);
    }

    public void printRectangle() {
        System.out.printf("Rectangle:" +
                "\n Length: %.2f" +
                "\n Width: %.2f" +
                "\n Area: %.2f" +
                "\n Perimeter: %.2f" +
                "\n",
                this.length,
                this.width,
                this.area,
                this.perimeter);
    }
}