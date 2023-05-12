package Exercise1To6;

/*
 * This class is for Lab Week 8 Exercise 5 
 * This class is used to develop Multithread Application on Different Thread Tasks
 * 
 * @author Ng Wei Hen
 */

public class CurrentTimeRandomNumberApp {

	public static void main (String [] args)
	{
		// Create two objects of thread from class RandomNumberTask
		Runnable number1 = new RandomNumberTask(1,100);
		Runnable number2 = new RandomNumberTask(5,20);
		
		// Create an object of thread from class CurrentTimeTask
		Thread time1 = new CurrentTimeTask();
				
		Thread printerNumber1 = new Thread(number1);
		Thread printerNumber2 = new Thread(number2);

		// Execute threads
		printerNumber2.start();
		printerNumber1.start();
		time1.start();	
	}
	
}
