package UNIT3.ObjectClassMethods;
//WAP to demonstrate the use of toString() method.
class Car{
    int year;
    String model;

    //Parameterized constructor to initialize car details.
    Car(int year, String model){
        this.year = year;
        this.model = model;
    }

    //Overriding the toString() method of Object class.
    @Override
    public String toString(){
        return "Car Model: " + model + ", Year: " + year;
    }
}

public class UseoftoString {
    
    public static void main(String args[]){
        //Creating an object of Car class.
        Car car = new Car(2024, "Toyota");

        //Displaying the object using println().
        System.out.println(car);
    }
}