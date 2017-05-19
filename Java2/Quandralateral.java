public class Quandralateral extends Shape implements Measureable {

    protected double length;
    protected double width;

    public Quandralateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    /* Getter setter methods */
    public void getLength() {
        return this.length;
    }

    public void getWidth() {
        return this.width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}