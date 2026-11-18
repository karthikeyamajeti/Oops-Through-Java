class MyClass1 implements Runnable{
	public void run(){
		int i=1;
		while(i<=100){
			if(i%2==0)
				System.out.println(Thread.currentThread().getName()+" "+i);
			i++;
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}
}
class MyClass2 implements Runnable{
	public void run(){
		int i=1;
		while(i<=100){
			if(i%2!=0)
				System.out.println(Thread.currentThread().getName()+" "+i);
			i++;
			try{
				Thread.sleep(2000);
			}catch(Exception e){}
		}
	}
}
class ThreadEx_Runnable{
	public static void main(String arh[]){
		Thread t1=new Thread(new MyClass1());
		t1.start();
		t1.setName("Even");
		Thread t2=new Thread(new MyClass2());
		t2.start(); t2.setName("Odd");
	}
}