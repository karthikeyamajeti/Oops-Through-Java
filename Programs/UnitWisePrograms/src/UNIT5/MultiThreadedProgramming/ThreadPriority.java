class ThreadPriority extends Thread {
    public ThreadPriority(String name) {
        setName(name);
    }
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " (priority " + 
                               Thread.currentThread().getPriority() + ") - Task " + i);
        }
    }
    public static void main(String[] args) {
		 ThreadPriority hpt = new  ThreadPriority ("High-Priority Thread");
		 ThreadPriority  mpt = new  ThreadPriority ("Medium-Priority Thread");
		 ThreadPriority  lpt = new  ThreadPriority ("Low-Priority Thread");
		
		 hpt.setPriority(Thread.MAX_PRIORITY);      // Priority 10
		 mpt.setPriority(Thread.NORM_PRIORITY);    // Priority 5
		 lpt.setPriority(Thread.MIN_PRIORITY);     // Priority 1
		
		// Start the threads
		lpt.start();
		mpt.start();
		hpt.start();
    }
} 
