package UNIT3.Inheritance;
//WAP in Java to demonstrate overriding the toString() method in a user-defined class.

class Car {

    int year;
    String model;

    //Creating a constructor to initialize car details
    Car(int year, String model) {
        this.year = year;
        this.model = model;
    }

    //Overriding toString() to display car details
    @java.lang.Override
    public String toString() {
        return "Car Model: " + model + ", Year: " + year;
    }
}

public class useofToString {

    public static void main(String[] args) {

        //Creating a Car object
        Car car = new Car(2024, "Toyota");

        //Displaying the object using toString()
        System.out.println(car);

    }
}