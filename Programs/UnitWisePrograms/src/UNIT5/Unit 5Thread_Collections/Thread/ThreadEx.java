class MyClass1 extends Thread{
	public void run() {
		for(;;){
			System.out.println(Thread.currentThread().getName()); 
			try{
				Thread.sleep(1000);
			}catch(Exception e){}
		}
	}
}
class MyClass2 extends Thread{
	public void run() {
		for(;;){
			System.out.println(Thread.currentThread().getName()); 
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}
} 
class MyClass3 extends Thread{
	public void run() {
		for(;;){
			System.out.println(Thread.currentThread().getName()); 
			try{
				Thread.sleep(3000);
			}catch(Exception e){}
		}
	}
} 
class ThreadEx{
	public static void main(String ar[]){
		MyClass1 mc1=new MyClass1();
		MyClass2 mc2=new MyClass2();
		MyClass3 mc3=new MyClass3();
		
		mc1.setName("GM"); mc2.setName("GA");mc3.setName("GE");
		mc1.start(); mc2.start(); mc3.start();
 
	}
}	

