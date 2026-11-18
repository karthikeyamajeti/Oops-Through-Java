package UNIT5.CollectionFramework.ArrayList;
//WAP in Java to demonstrate the use of Generics and Non-Generics in ArrayList.

import java.util.*;

public class ArrayListExample4 {
    public static void main(String args[]) {

        //Using Generics
        ArrayList<String> names = new ArrayList<>();

        //Adding String elements to the ArrayList
        names.add("Ravi");
        names.add("Sita");
        names.add("Ram");
        names.add("Priya");
        names.add("Kiran");

        //Displaying the Generic ArrayList
        System.out.println(names);


        //Using ArrayList without Generics
        ArrayList names1 = new ArrayList();

        //Adding String and Integer elements to the ArrayList
        names1.add("Ravi");
        names1.add("Sita");
        names1.add(1);
        names1.add(2);
        names1.add("Kiran");

        //Displaying the Non-Generic ArrayList
        System.out.println(names1);

    }
}