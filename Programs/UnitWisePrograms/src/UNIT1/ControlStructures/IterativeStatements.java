package UNIT1.ControlStructures;
//WAP in Java to demonstrate different types of loops.

public class IterativeStatements{

    public static void main(String[] args) {

        //=========================================
        //1. while Loop
        //=========================================
        System.out.println("1. while Loop");

        //Initializing the loop variable
        int i = 1;

        //Checking the condition before executing the loop
        while(i <= 5) {

            //Displaying the current value
            System.out.println(i);

            //Incrementing the loop variable
            i++;
        }

        //=========================================
        //2. do-while Loop
        //=========================================
        System.out.println("\n2. do-while Loop");

        //Initializing the loop variable
        int j = 1;

        //Executing the loop body before checking the condition
        do {

            //Displaying the current value
            System.out.println(j);

            //Incrementing the loop variable
            j++;

        } while(j <= 5);

        //=========================================
        //3. for Loop
        //=========================================
        System.out.println("\n3. for Loop");

        //Initializing, checking, and incrementing in the for loop
        for(int k = 1; k <= 5; k++) {

            //Displaying the current value
            System.out.println(k);
        }

        //=========================================
        //4. Enhanced for Loop (for-each)
        //=========================================
        System.out.println("\n4. Enhanced for Loop");

        //Declaring and initializing an integer array
        int numbers[] = {10, 20, 30, 40, 50};

        //Accessing and displaying each array element
        for(int num : numbers) {
            System.out.println(num);
        }

    }
}