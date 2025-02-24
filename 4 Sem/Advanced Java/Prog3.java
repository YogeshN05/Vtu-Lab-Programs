//Implement a java program to illustrate storing user defined classes in collection.

package pkg4jd23is126;
import java.util.ArrayList;
class Student {
    // Attributes of the Student class
    private String name;
    private int age;
    private int rollNumber;

    // Constructor to initialize the attributes
    public Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    // Getter methods for the attributes
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    // Method to display Student details
    public void displayStudentInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll Number: " + rollNumber);
    }
}
public class Prog3 
{
    public static void main(String[] args) {
        // Create an ArrayList to store Student objects
        ArrayList<Student> studentList = new ArrayList<>();

        // Add instances of Student to the ArrayList
        studentList.add(new Student("Yogi", 20, 101));
        studentList.add(new Student("Teja", 22, 102));
        studentList.add(new Student("Vinay", 21, 103));

        // Display all students stored in the ArrayList
        System.out.println("Student List:");
        for (Student student : studentList) {
            student.displayStudentInfo();
        }
    }
}

/*
Output:-

Student List:
Name: Yogi, Age: 20, Roll Number: 101
Name: Teja, Age: 22, Roll Number: 102
Name: Vinay, Age: 21, Roll Number: 103

*/

