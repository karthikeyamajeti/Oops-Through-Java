class MyClass1 extends Thread{
	public void run() {
		for(;;){
			int i=1;
			while(i<100){
				if(i%2==0)
					System.out.println(Thread.currentThread().getName()+i);
				i++;
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
			}
		}
	}
}
class MyClass2 extends Thread{
	public void run() {
		for(;;){
			int i=1;
			while(i<100){
				if(i%2!=0)
					System.out.println(Thread.currentThread().getName()+i);
				i++;
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
			}
		}
	}
} 

class ThreadEx_Procedure1_Multiple{
	public static void main(String ar[]){
		MyClass1 mc1=new MyClass1();
		MyClass2 mc2=new MyClass2(); 
		mc1.setName("Even: ");
		mc2.setName("Odd: ");
		mc1.start(); 
		mc2.start(); 
	}
}	

