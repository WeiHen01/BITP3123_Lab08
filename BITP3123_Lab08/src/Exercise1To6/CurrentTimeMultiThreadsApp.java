package Exercise1To6;

/**
 * This class demonstrate the application of multiple threads object in
 * a simple Java multithreaded application
 *
 * @author emalianakasmuri
 *
 */
public class CurrentTimeMultiThreadsApp {

	public static void main(String[] args) {

		// Create thread objects
		Thread currentTimeThread1 = new CurrentTimeTask();
		Thread currentTimeThread2 = new CurrentTimeTask();
		
		/*
		 * ----- Exercise 3 -------
		 * Create another 2 different objects of thread with names
		 * 
		 */
		Thread currentTimeprinterThread1 = new Thread(currentTimeThread1, "Current Time 1");
		Thread currentTimeprinterThread2 = new Thread(currentTimeThread2);
		currentTimeprinterThread2.setName("Current Time 2");
		
		/* --------Exercise 1------------
		 * Execute threads for Exercise 1
		 *
		 * currentTimeThread2.start(); 
		 * currentTimeThread1.start();
		 */

		/* --------Exercise 3------------
		 * Execute threads for Exercise 3
		 */
		currentTimeprinterThread2.start();
		currentTimeprinterThread1.start();
		System.out.println("Program ends");

	}

}
