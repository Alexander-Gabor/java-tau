package chapter8;

public class Person {
    // Private fields
    private String name;
    private int age;

    // Getter for the name
    public String getName() {
        return name;
    };

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    };

    // Getter for the age
    public int getAge(){
        return age;
    }

    // Setter for the age
    public void setAge(int age) {
        // Optional1: Add a condition to check if age is valid
        if (age > 0){
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }

    // A method to display the person's information
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method to run the code
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person();

        // Set values using setters
        person.setName("John Doe");
        person.setAge(25);

        // Get and print values using getters
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        // Display all info
        person.displayPersonInfo();
    }
};
