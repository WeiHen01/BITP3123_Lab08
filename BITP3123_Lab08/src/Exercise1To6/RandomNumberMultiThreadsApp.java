package Exercise1To6;

/**
 * This class demonstrate execution of multiple threads object
 * from the same class.
 *
 * @author emalianakasmuri
 *
 */

public class RandomNumberMultiThreadsApp {

	public static void main(String[] args) {

		// Create Runnable object
		Runnable randomNumberTask1 = new RandomNumberTask(1, 100);
		Runnable randomNumberTask2 = new RandomNumberTask(5, 50);

		// Create thread objects
		Thread randomNumberThread1 = new Thread(randomNumberTask1);
		Thread randomNumberThread2 = new Thread(randomNumberTask2);
		
		/*
		 * ---------Exercise 4 ----------------
		 * Create 2 thread objects with name
		 */
		Thread randomNumberPrinterThread1 = new Thread(randomNumberTask1, "Random Number Printer 1");
		Thread randomNumberPrinterThread2 = new Thread(randomNumberTask2);
		randomNumberPrinterThread2.setName("Random Number Printer 2");
		
		// -----Exercise 2---------
		// Execute threads 
		/*
		 * randomNumberThread1.start();
		 * randomNumberThread2.start();
		*/
		
		/*
		 * -----Exercise 4----------
		 * Execute Threads
		 */
		randomNumberPrinterThread1.start();
		randomNumberPrinterThread2.start();

		System.out.println("Program ends");


	}

}
