package Exercise1To6;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * This class represent a task to print current time
 * 
 * @author emalianakasmuri
 *
 */
public class CurrentTimeTask extends Thread {
	
	private DateFormat dateFormat;
	private Calendar calendar;
	
	public CurrentTimeTask() {
		
		dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.ms");
		calendar = Calendar.getInstance();
	}
	
	/**
	 * This method gets a current time
	 * 
	 * @return a current time
	 */
	public String getCurrentTime() {

		return dateFormat.format(calendar.getTime());
	}
	
	/*
	 * ---------- Exercise 1 -------------
	 * For Exercise 1
	 */
	/*
	@Override
	public void run()
	{
		/*
		 * prints 10 current time
		 */
		/*
		for (int counter = 0; counter < 10; counter++)
		{
			System.out.println (getCurrentTime());
		}
		
	}
	*/
	
	
	/*
	 * 
	 * ---------- Exercise 3 -------------
	 * 
	 */
	/*
	@Override
	 
	public void run()
	{
		/*
		 * prints 10 statements that consist of the name of the current thread and current time
		 */
		/*
		for (int counter = 0; counter < 10; counter++)
		{
			Thread currentThread = Thread.currentThread();
			System.out.println(currentThread.getName() + " -> " + counter + " " + getCurrentTime());
		}
	}
	*/

	
	/*
	 * 
	 * ---------- Exercise 5 -------------
	 * 
	 */
	@Override
	public void run()
	{
		/*
		 * prints 10 statements that consist of the name of the current thread and current time
		 */
		try 
		{
			for (int counter = 0; counter < 10; counter++)
			{
				Thread currentThread = Thread.currentThread();
				
				//suspend the operation for 4000 milliseconds before proceed to print statement
				Thread.sleep(4000);
				System.out.println(currentThread.getName() + " -> " + counter + " " + getCurrentTime());
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	

}
