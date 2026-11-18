package UNIT3.Inheritance;
//WAP in Java to create an Employee class and display employee details using toString().

class Employee {

    int id;
    String name;
    double salary;

    //Creating a constructor to initialize employee details
    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //Overriding toString() to display employee details
    @java.lang.Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name +
               ", Salary=" + salary + "]";
    }
}