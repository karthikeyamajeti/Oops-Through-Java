class Student {
    void display() {
        System.out.println("Student details");
    }
    void study() {
        System.out.println("Student is studying");
    }
    int calculateMarks(int a, int b) {
        return a + b;
    }
}
public class UseofGetClass {
    public static void main(String[] args) {
        Student s = new Student();
        // Get the Class object of the concerned object
        Class c = s.getClass();//returns run-time class
        System.out.println("Class Name: " + c.getName());
        System.out.println("\nMethods of Student class:");

        java.lang.reflect.Method[] methods = c.getDeclaredMethods();
        for (java.lang.reflect.Method m : methods) {
            System.out.println(m.getName());
        }
    }
}