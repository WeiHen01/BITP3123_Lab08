package Exercise1To6;

import java.util.Random;

/**
 * This class represent a task to generate a random number.
 * 
 * @author emalianakasmuri
 *
 */
public class RandomNumberTask implements Runnable {
	
	private Random random;
	private int min;
	private int max;
	
	public RandomNumberTask (int min, int max) {
		
		random = new Random();
		
		this.min = min;
		this.max = max;
	}
	
	/**
	 * This method gets a random number between min and max values
	 * 
	 * @return a random number
	 */
	public int getRandomNumber () {
		
		int number = random.nextInt(max-min) + min;
		
		return number;
	}
	
	
	/*
	 * -----------Exercise 2------------------
	 * print 10 random numbers
	 */
	/*
	@Override
	public void run()
	{
		Thread currentThread = Thread.currentThread();
		for (int counter = 0; counter < 10; counter++)
		{
			System.out.println(getRandomNumber());
		}
	}
	*/
	
	/*
	 * -----------Exercise 4------------------
	 * print 10 random numbers with names
	 * 
	 */
	/*
	@Override
	public void run()
	{
		Thread currentThread = Thread.currentThread();
		for (int counter = 0; counter < 10; counter++)
		{
			System.out.println(currentThread.getName() + ": " + getRandomNumber());
		}
	}
	*/
	
	/*
	 * -----------Exercise 5------------------
	 * print 10 random numbers with names
	 * 
	 */
	@Override
	public void run()
	{
		Thread currentThread = Thread.currentThread();
		try
		{
			for (int counter = 0; counter < 10; counter++)
			{
				
				System.out.println(currentThread.getName() + ": " + getRandomNumber());
			}
			
			// Suspend the operation for 5000 milliseconds after finish printing all statements
			Thread.sleep(5000);
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}