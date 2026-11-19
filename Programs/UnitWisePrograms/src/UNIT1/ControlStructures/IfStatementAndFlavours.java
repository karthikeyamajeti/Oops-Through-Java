package UNIT1.ControlStructures;
//WAP in Java to demonstrate different flavors of the if statement.

public class IfStatementAndFlavours{

    public static void main(String[] args) {

        //Declaring and initializing variables
        int marks = 78;
        int age = 20;
        int attendance = 82;
        boolean feesPaid = true;

        //==================================================
        //1. Simple if
        //==================================================
        System.out.println("1. Simple if");

        if(marks >= 35) {
            System.out.println("Result : Pass");
        }

        //==================================================
        //2. if-else
        //==================================================
        System.out.println("\n2. if-else");

        if(age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        //==================================================
        //3. Nested if
        //==================================================
        System.out.println("\n3. Nested if");

        if(attendance >= 75) {

            if(feesPaid) {
                System.out.println("Eligible for Semester Examination");
            } else {
                System.out.println("Pay Fees First");
            }

        } else {
            System.out.println("Insufficient Attendance");
        }

        //==================================================
        //4. else-if Ladder
        //==================================================
        System.out.println("\n4. else-if Ladder");

        if(marks >= 90) {
            System.out.println("Grade : A");
        } else if(marks >= 75) {
            System.out.println("Grade : B");
        } else if(marks >= 60) {
            System.out.println("Grade : C");
        } else if(marks >= 35) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Fail");
        }

    }
}