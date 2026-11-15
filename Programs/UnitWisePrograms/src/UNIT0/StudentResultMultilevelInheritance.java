package UNIT0;
import java.util.*;

// Parent class to store student details
class Student {
    int id;
    String name;

    Scanner sc = new Scanner(System.in);

    // Method to set student ID and name
    void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display student details
    void displayData() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}

// Marks class inherits Student class
class Marks extends Student {
    float javaMarks, cMarks, cppMarks;

    // Method to set subject marks
    void setMarks(float javaMarks, float cMarks, float cppMarks) {
        this.javaMarks = javaMarks;
        this.cMarks = cMarks;
        this.cppMarks = cppMarks;
    }

    // Method to display subject marks
    void displayMarks() {
        System.out.println("Java marks : " + javaMarks);
        System.out.println("C marks : " + cMarks);
        System.out.println("Cpp marks : " + cppMarks);
    }
}

// Result class inherits Marks class
class Result extends Marks {
    float total, avg;

    // Method to calculate total and average marks
    void compute() {
        total = javaMarks + cMarks + cppMarks;
        avg = total / 3;
    }

    // Method to display total and average marks
    void showResult() {
        System.out.println("Total : " + total);
        System.out.println("Avg : " + avg);
    }
}

public class StudentResultMultilevelInheritance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating an object of Result class
        Result r = new Result();

        // Accepting student details
        System.out.print("Id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        // Accepting subject marks
        System.out.print("Java marks: ");
        float javaMarks = sc.nextFloat();

        System.out.print("C marks: ");
        float cMarks = sc.nextFloat();

        System.out.print("CPP marks: ");
        float cppMarks = sc.nextFloat();

        // Setting student details and marks
        r.setData(id, name);
        r.setMarks(javaMarks, cMarks, cppMarks);

        // Displaying student details and marks
        r.displayData();
        r.displayMarks();

        // Calculating and displaying result
        r.compute();
        r.showResult();
    }
}