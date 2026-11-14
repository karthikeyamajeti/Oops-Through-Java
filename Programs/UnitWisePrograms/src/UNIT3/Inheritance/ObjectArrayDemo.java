class Student1000 {
    int rollNo;
    String name;
    Student1000(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
    void display() {
        System.out.println(rollNo + " " + name);
    }
}
public class ObjectArrayDemo {
    public static void main(String[] args) {
        // Array of Student references
        Student1000[] s = new Student1000[3];
        // Creating Student objects
        s[0] = new Student1000(101, "Ravi");
        s[1] = new Student1000(102, "Suresh");
        s[2] = new Student1000(103, "Kiran");
        // Accessing objects
        for(int i = 0; i < s.length; i++) {
            s[i].display();
        }
    }
}