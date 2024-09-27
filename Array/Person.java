package Array;

public class Person {

    // Private fields for name and age
    private String name;
    private int age;

    // Constructor to initialize age and name
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }
}
