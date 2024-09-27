package Array;

public class Array {
    public static void main(String[] args) {
        // Single-Dimensional Array
        int[] singleArray = {1, 2, 3, 4, 5};
        System.out.println("Single-Dimensional Array:");
        for (int i : singleArray) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Multi-Dimensional Array (2D Array)
        int[][] twoDimArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("\n2D Array:");
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

        // Jagged Array (Array of arrays with different lengths)
        int[][] jaggedArray = new int[3][];
        jaggedArray[0] = new int[]{1, 2};
        jaggedArray[1] = new int[]{3, 4, 5};
        jaggedArray[2] = new int[]{6, 7, 8, 9};

        System.out.println("\nJagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // Array of Strings
        String[] stringArray = {"vikram", "guddu", "vivek"};
        System.out.println("\nArray of Strings:");
        for (String name : stringArray) {
            System.out.print(name + " ");
        }
        System.out.println();

        // Array of Objects (Example with a custom class)
        Person[] people = new Person[3];
        people[0] = new Person("vikram", 21);
        people[1] = new Person("guddu", 18);
        people[2] = new Person("vivek", 22);

        System.out.println("\nArray of Objects:");
        for (Person person : people) {
            System.out.println(person.getName() + " - Age: " + person.getAge());
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
    
}
