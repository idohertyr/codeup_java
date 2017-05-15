/**
 * Compilation: javac Person.java
 * Execution: java Person
 *
 * Java II - Section 6.1
 * Object the represents a person.
 */

/* 1. Create a Person class */
public class Person {

    private String name;

    Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        /* 1. Create a Person class, and test basic functions. */
        Person one = new Person("Ian");
        one.getName();
        one.setName("Ean");
        one.sayHello();

        /* 2. Understanding references */
        /*
        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);
        */
        /*
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1 == person2);
        */
        /*
        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        */
    }

    /* Get and Set name */
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, %s\n", this.name);
    }

}
