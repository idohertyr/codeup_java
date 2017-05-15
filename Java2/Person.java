public class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person one = new Person("Ian");
        one.getName();
    }

    /* Get and Set name */
    public String getName() {
        System.out.printf("Name: %s", this.name);
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s\n", this.name);
    }

}
