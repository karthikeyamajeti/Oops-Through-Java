class MyClass1 implements Runnable{
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
class MyClass2 implements Runnable{
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

class Thread_Multiple_Runnable{
	public static void main(String ar[]){
		 Thread t1=new Thread(new MyClass1() );
		 Thread t2=new Thread(new MyClass2());
		 t1.start();
		 t2.start();
	}
}	

