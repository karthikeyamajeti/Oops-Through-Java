package UNIT1.ControlStructures;
//WAP in Java to demonstrate the use of nested switch statements.
public class NestedSwitch {

    public static void main(String[] args) {

        //Declaring and initializing department and year variables
        int department = 1; //1-CSE AIML, 2-ECE
        int year = 2;       //1-I Year, 2-II Year

        //Checking the department using the outer switch
        switch(department) {

            case 1:
                System.out.println("Department: CSE AIML");

                //Checking the year using the inner switch
                switch(year) {

                    case 1:
                        System.out.println("First Year");
                        break;

                    case 2:
                        System.out.println("Second Year");
                        break;

                    default:
                        System.out.println("Invalid Year");
                }
                break;

            case 2:
                System.out.println("Department: ECE");

                //Checking the year using the inner switch
                switch(year) {

                    case 1:
                        System.out.println("First Year");
                        break;

                    case 2:
                        System.out.println("Second Year");
                        break;

                    default:
                        System.out.println("Invalid Year");
                }
                break;

            default:
                System.out.println("Invalid Department");
        }

    }
}