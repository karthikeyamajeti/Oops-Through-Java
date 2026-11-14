class Car {
    int year;
    String model;
    Car(int year, String model) {
        this.year = year;
        this.model = model;
    }
    public String toString() {
        return "Car Model: " + model + ", Year: " + year;
    } 
}
class useofToString{
     public static void main(String[] args) {
        Car car = new Car(2024, "Toyota");
        System.out.println(car);  
    }
}