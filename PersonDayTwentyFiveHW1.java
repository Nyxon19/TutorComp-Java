import java.util.Scanner;

public class PersonDayTwentyFiveHW1 {
    private String name;
    private int age;
    private double height;

    // Constructor
    PersonDayTwentyFiveHW1(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    // Method to check if the current person is taller
    void checkTallest(PersonDayTwentyFiveHW1 tallest) {
        if (height > tallest.height) {
            tallest.name = name;
            tallest.age = age;
            tallest.height = height;
        }
    }

    // Method to display the tallest person's details
    void displayTallest() {
        System.out.println("Tallest Person: Name - " + name + ", Age - " + age + ", Height - " + height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of people:");
        int number = sc.nextInt();

        PersonDayTwentyFiveHW1[] people = new PersonDayTwentyFiveHW1[number];
        for (int i = 0; i < number; i++) {
            sc.nextLine(); 
            System.out.println("What is the name of the person?");
            String name = sc.nextLine();
            System.out.println("What is the age of the person?");
            int age = sc.nextInt();
            System.out.println("What is the height of the person?");
            double height = sc.nextDouble();
            sc.nextLine(); 
            people[i] = new PersonDayTwentyFiveHW1(name, age, height);
        }

        PersonDayTwentyFiveHW1 tallest = new PersonDayTwentyFiveHW1(people[0].name, people[0].age, people[0].height);
        for (int i = 1; i < number; i++) {
            people[i].checkTallest(tallest);
        }
        tallest.displayTallest();
    }
}
