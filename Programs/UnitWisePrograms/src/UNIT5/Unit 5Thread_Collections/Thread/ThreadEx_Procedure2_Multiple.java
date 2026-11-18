class MyClass1 extends Thread{
	MyClass1(){
		start();
	}
	public void run() {
		for(;;){
			int i=1;
			while(i<100){
				if(i%2==0)
					System.out.println("Even "+i);
				i++;
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
			}
		}
	}
}
class MyClass2 extends Thread{
	MyClass2(){
		start();
	}
	public void run() {
		for(;;){
			int i=1;
			while(i<100){
				if(i%2!=0)
					System.out.println("Odd "+i);
				i++;
				try{
					Thread.sleep(1000);
				}catch(Exception e){}
			}
		}
	}
} 

class ThreadEx_Procedure2_Multiple{
	public static void main(String ar[]){
		 new MyClass1();
		 new MyClass2();
	}
}	

