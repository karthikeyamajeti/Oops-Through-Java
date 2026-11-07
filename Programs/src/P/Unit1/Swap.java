package P.Unit1;
import java.util.Scanner;
public class Swap{
	public static void main(String args[]){
		int a, b, temp;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two numbers");
		a=s.nextInt();
		b=s.nextInt();
		
		//logic
		temp=a;
		a=b;
		b=temp;

		System.out.println("After Swapping the values are");
		System.out.println("a value is:"+a);
		System.out.println("b value is:"+b);
	}
}