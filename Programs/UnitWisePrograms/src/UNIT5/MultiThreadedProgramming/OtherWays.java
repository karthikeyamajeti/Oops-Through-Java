class Demo {
    public static void display() {
        System.out.println("Thread is executing");
    }
}
public class OtherWays  {
    public static void main(String[] args) {
        Thread t = new Thread(Demo::display);  // Method Reference
        
        Thread t1 = new Thread(() -> System.out.println("Hello PVPSIT")); //lambda expression 
        
        /* Anonymous inner Class */
        Thread t2 = new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello Anonymous inner class");
            }
        });

        t.start();
        t1.start();
        t2.start();
    } 
}
