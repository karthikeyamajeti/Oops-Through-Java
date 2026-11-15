package UNIT0;
/*
WAP to find the roots of a quadratic equation (ax^2 + bx + c = 0) using the 
discriminant (D=b^2-4ac). Display whether the roots are distinct real, equal 
real, or no real roots.
*/
import java.util.*;
public class RootsOfQuadraticEquation {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Reading coefficients for quadratic equation
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        //Calculating Discriminent Value
        double D = b*b-4*a*c;
        
        //For two real and distinct roots
        if(D>0){
            double r1=(-b+Math.sqrt(D))/(2*a);
            double r2=(-b+Math.sqrt(D))/(2*a);
            System.out.println("Two real roots");
            System.out.println("Root1: "+r1);
            System.out.println("Root2: "+r2);
        }
        
        //For One real root
        else if(D==0){
            double r1=-b/(2*a);
            System.out.println("One Real root");
            System.out.println("Root: "+r1);
        }
        
        //For No real roots
        else{
            System.out.println("No Real Root");
        }
        
    }
}