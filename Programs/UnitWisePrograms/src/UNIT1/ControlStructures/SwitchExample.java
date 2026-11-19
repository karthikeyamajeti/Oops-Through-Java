package UNIT1.ControlStructures;
//WAP in Java to demonstrate the use of a switch statement with String values.

public class SwitchExample {

    public static void main(String arg[]) {

        //Declaring and initializing a String variable
        String day = "Tuesday";

        //Checking the day using the switch statement
        switch(day) {

            case "Monday":
                System.out.println("First Working Day");
                break;

            case "Tuesday":
                System.out.println("Second Working Day");
                break;

            default:
                System.out.println("Invalid Day");
        }

    }
}