import java.util.concurrent.TimeUnit;
public class Thread2 {

	public static void main(String[] args) {
		Runnable runnable = () -> {
		    try {
		        String name = Thread.currentThread().getName();
		        System.out.println("Foo " + name);
		        TimeUnit.SECONDS.sleep(5);
		        System.out.println("Bar " + name);
		    }
		    catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		};

		Thread thread = new Thread(runnable);
		thread.start();
		Thread thread1 = new Thread(runnable);
		thread1.start();
	}

}
