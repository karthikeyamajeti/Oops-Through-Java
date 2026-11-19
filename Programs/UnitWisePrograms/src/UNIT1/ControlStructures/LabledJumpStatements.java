package UNIT1.ControlStructures;
//WAP in Java to demonstrate the use of break and continue statements with labels.

public class LabledJumpStatements{

    public static void main(String[] args) {

        //=========================================
        //1. break with label
        //=========================================
        System.out.println("\n1. break with label");

        //Defining a label for the outer loop
        outer:
        for(int i = 1; i <= 3; i++) {

            //Executing the inner loop
            for(int j = 1; j <= 3; j++) {

                //Terminating the outer loop when j becomes 2
                if(j == 2) {
                    break outer;
                }

                //Displaying the current values of i and j
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        //=========================================
        //2. continue with label
        //=========================================
        System.out.println("\n2. continue with label");

        //Defining a label for the outer loop
        outer:
        for(int i = 1; i <= 3; i++) {

            //Executing the inner loop
            for(int j = 1; j <= 3; j++) {

                //Skipping the current outer loop iteration when j becomes 2
                if(j == 2) {
                    continue outer;
                }

                //Displaying the current values of i and j
                System.out.println("i = " + i + ", j = " + j);
            }
        }

    }
}