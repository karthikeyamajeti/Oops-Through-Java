interface SurfaceArea{
	double compute(double x);
}
class Square implements SurfaceArea{
	public double compute(double x){
		return x*x;
	}
}
class Circle implements SurfaceArea{
	public double compute(double x){
		return (3.14*x*x);
	}
 
}
class InterfaceReference{
	
	public static void main(String arg[]){
		Square s=new Square();
		Circle c=new Circle();
		SurfaceArea sa;
		sa=s; 
		System.out.println("Area of Square:"+sa.compute(5));
		sa=c;
		System.out.println("Area of Circle:"+sa.compute(5));
		 
	}
}
	

	