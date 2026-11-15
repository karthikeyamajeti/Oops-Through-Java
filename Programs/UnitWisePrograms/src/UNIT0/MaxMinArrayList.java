package UNIT0;
/*
WAP to find the maximum and minimum values in a list of integers
using ArrayList. Stop accepting input when a non-numeric character
is entered.
*/
import java.util.*;

public class MaxMinArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // Accepting integers until non-numeric input is entered
        while (sc.hasNextInt()) {
            list.add(sc.nextInt());
        }

        // Finding maximum and minimum values
        int max = list.get(0);
        int min = list.get(0);
        for(int n:list){
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
        }

        // Displaying maximum and minimum
        System.out.println(max);
        System.out.println(min);
    }
}