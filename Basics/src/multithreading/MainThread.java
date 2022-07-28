package multithreading;

public class MainThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("The current Thread running here is :"+t.getName());

	}

}
