package P.Unit1;
import java.util.Scanner;

public class CompoundInterest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount : ");
        double principal = sc.nextDouble();

        System.out.print("Enter Rate of Interest : ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time (Years) : ");
        double time = sc.nextDouble();

        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.printf("Compound Interest = %.2f\n ", ci);
        System.out.printf("Total Amount = %.2f ", amount);

        sc.close();
    }
}