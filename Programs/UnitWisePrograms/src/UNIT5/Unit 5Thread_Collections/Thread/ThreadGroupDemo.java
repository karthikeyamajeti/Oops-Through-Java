 class TG1 implements Runnable{    
    public void run() {    
          System.out.println(Thread.currentThread().getName());    
    }
}
class TG2 implements Runnable{    
    public void run() {    
          System.out.println(Thread.currentThread().getName());    
    }
}
public class ThreadGroupDemo{	
   public static void main(String[] args) {    
          ThreadGroup tg1 = new ThreadGroup("Thread Group1");    
          ThreadGroup tg2 = new ThreadGroup("Thread Group2");    
          System.out.println("Thread Group Name: "+tg1.getName());   
		  Thread t1 = new Thread(tg1, new TG1(),"one");    
          t1.start();    
          Thread t2 = new Thread(tg1, new TG1(),"two");    
          t2.start();    
              
		  System.out.println("Thread Group Name: "+tg2.getName());
		  Thread t3 = new Thread(tg2, new TG2(),"three");    
          t3.start();    
          Thread t4 = new Thread(tg2, new TG2(),"four");    
          t4.start();    
     }    
}    