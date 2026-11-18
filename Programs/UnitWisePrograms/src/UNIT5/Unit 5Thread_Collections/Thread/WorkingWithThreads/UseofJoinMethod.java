class  MyClass20 extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 5; i++)
        {
            System.out.println("Child Thread: " + i);
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
public class UseofJoinMethod{
	public static void main(String[] args) throws InterruptedException
    {
    	 MyClass20 t = new  MyClass20();
         t.start();  // Starts the child thread
         t.join();   // Main thread waits until child thread finishes

        System.out.println("Main thread execution completed");
    }
}