package UNIT1.ControlStructures;
//WAP in Java to demonstrate the use of break and continue jump statements.

public class JumpStatementsDemo {

    public static void main(String[] args) {

        //=========================================
        //1. break
        //=========================================
        System.out.println("1. break");

        //Executing the loop from 1 to 5
        for(int i = 1; i <= 5; i++) {

            //Terminating the loop when i becomes 3
            if(i == 3) {
                break;
            }

            //Displaying the current value
            System.out.println(i);
        }

        //=========================================
        //2. continue
        //=========================================
        System.out.println("\n2. continue");

        //Executing the loop from 1 to 5
        for(int i = 1; i <= 5; i++) {

            //Skipping the current iteration when i becomes 3
            if(i == 3) {
                continue;
            }

            //Displaying the current value
            System.out.println(i);
        }

    }
}