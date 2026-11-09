//WAP to demonstrate Array of Objects.
class Student1000{
    int rollNo;
    String name;

    //Parameterized constructor to initialize student details.
    Student1000(int rollNo, String name){
        this.rollNo = rollNo;
        this.name = name;
    }

    //Method to display student details.
    void display(){
        System.out.println(rollNo + " " + name);
    }
}

public class ObjectArrayDemo {
    
    public static void main(String args[]){
        //Creating an array of Student1000 references.
        Student1000[] s = new Student1000[3];

        //Creating Student1000 objects and assigning them to the array.
        s[0] = new Student1000(101, "Ravi");
        s[1] = new Student1000(102, "Suresh");
        s[2] = new Student1000(103, "Kiran");

        //Accessing each object using a for loop.
        for(int i = 0; i < s.length; i++){
            s[i].display();
        }
        
    }
}