//IN this prg we are printing the current thread name in console

class Thread1 {

	public static void main(String[] args) {
		
		Runnable task = () -> {
			String threadName = Thread.currentThread().getName();
			
		    System.out.println("Hello " + threadName);
		};

		task.run();             //we called the run method from Runnable Functional Interface.

		Thread thread = new Thread(task);
		Thread thread1 = new Thread(task);
		thread.start();
		thread1.start();
		System.out.println("Done!");
	}
}
