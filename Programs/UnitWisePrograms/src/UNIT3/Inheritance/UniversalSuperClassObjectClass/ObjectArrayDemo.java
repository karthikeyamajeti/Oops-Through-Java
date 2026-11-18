package UNIT3.Inheritance;
//WAP in Java to demonstrate an array of objects using Student class.

class Student1000 {

    int rollNo;
    String name;

    //Creating a constructor to initialize student details
    Student1000(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    //Defining a method to display student details
    void display() {
        System.out.println(rollNo + " " + name);
    }
}

public class ObjectArrayDemo {

    public static void main(String[] args) {

        //Declaring an array of Student references
        Student1000[] s = new Student1000[3];

        //Creating Student objects and assigning them to the array
        s[0] = new Student1000(101, "Ravi");
        s[1] = new Student1000(102, "Suresh");
        s[2] = new Student1000(103, "Kiran");

        //Accessing and displaying Student objects
        for(int i = 0; i < s.length; i++) {
            s[i].display();
        }

    }
}