package Array;

import java.util.Scanner;

public class ArrayOp {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many people they want to add
        System.out.print("Enter the number of people: ");
        int numberOfPeople = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create an array of Person objects
        Person[] people = new Person[numberOfPeople];

        // Input data for each person
        for (int i = 0; i < numberOfPeople; i++) {
            System.out.print("Enter name for person " + (i + 1) + ": ");
            String name = scanner.nextLine();

            System.out.print("Enter age for person " + (i + 1) + ": ");
            int age = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character

            // Create a new Person object and add it to the array
            people[i] = new Person(age, name);
        }

        // Display details of each person using getters
        System.out.println("\nDetails of People:");
        for (Person person : people) {
            System.out.println(person.getName() + " - Age: " + person.getAge());
        }

        // Close the scanner
        scanner.close();
    }
}
