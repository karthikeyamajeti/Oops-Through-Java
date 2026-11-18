class AIMLThread implements Runnable{    
    public void run() {    
          System.out.println(Thread.currentThread() );    
    }
}
class DSThread implements Runnable{    
    public void run() {    
          System.out.println(Thread.currentThread() );    
    }
}
public class ThreadGroupWorking{	
   public static void main(String[] args) {    
          ThreadGroup tg1 = new ThreadGroup("AIML");   
          
          ThreadGroup tg2 = new ThreadGroup("DS");
          
          System.out.println("Thread Group Name: "+tg1.getName()); 
          AIMLThread ai= new AIMLThread();
		  Thread t1 = new Thread(tg1,ai );    
          t1.start();    
          
          Thread t2 = new Thread(tg1, ai );    
          t2.start();    
              
		  System.out.println("Thread Group Name: "+tg2.getName());
		  Thread t3 = new Thread(tg2, new DSThread(),"4401");    
          t3.start();    
          Thread t4 = new Thread(tg2, new DSThread(),"4402");    
          t4.start();    
     }    
}    