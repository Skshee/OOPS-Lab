import java.util.Scanner;

class Student {
    private String registrationNumber;
    private String firstName;
    private String lastName;
    private String degree;

    // Constructor
    public Student(String registrationNumber, String firstName, String lastName, String degree) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    // Getters
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDegree() {
        return degree;
    }

    // Method to display student details
    public void display() {
        System.out.println("Registration Number: " + registrationNumber +
                ", First Name: " + firstName +
                ", Last Name: " + lastName +
                ", Degree: " + degree);
    }
}

public class AQ2 {

    public static void main(String[] args) {
        // Create an array of 10 Student objects
        Student[] students = new Student[10];
        
        // Initialize the array with some student data
        students[0] = new Student("1", "Armaan", "Gupta", "CSE");
        students[1] = new Student("2", "Gokul", "Nair", "CCE");
        students[2] = new Student("3", "Suvan", "Shee", "Physics");
        students[3] = new Student("4", "David", "Wilson", "Maths");
        students[4] = new Student("5", "Lamar", "Davis", "Biology");
       

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first name or last name to search: ");
        String searchName = scanner.nextLine();

        // Search for the student by first name or last name
        boolean found = false;
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(searchName) || 
                student.getLastName().equalsIgnoreCase(searchName)) {
                student.display();
                found = true;
                break; // Stop searching after finding the first match
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        scanner.close();
    }
}
