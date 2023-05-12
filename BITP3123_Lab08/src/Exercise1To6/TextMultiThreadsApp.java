package Exercise1To6;

/*
 * For Exercise 6 Task 6 to 8
 * This class that will represent a multithreading application.
 * 
 * @author Ng Wei Hen
 */
public class TextMultiThreadsApp {

	public static void main(String [] args)
	{
		// create objects for class TextExtractorTask
		TextExtractorTask textExtractor = new TextExtractorTask();
		TextExtractorTask textGenerator = new TextExtractorTask();
		TextExtractorTask textAnalyzer = new TextExtractorTask();

		// create objects of threads
		Thread extractor = new Thread(textExtractor, "Extractor");
		Thread generator = new Thread(textGenerator, "Generator");
		Thread analyzer = new Thread(textGenerator, "Analyzer");
		
		try
		{
			// Execute the threads
			generator.start();
			extractor.start();
			analyzer.start();
						
			// Let threads of lower priority to execute,
			// wait until its finished, then continue execution
			generator.join();
			extractor.join();
			analyzer.join();
			
			System.out.println("Program ends!");
		}
		
		catch (Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
