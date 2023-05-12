package Exercise1To6;

import java.util.List;
import java.util.ArrayList;
/*
 * This class is for Lab Week 8 Exercise 6 Task 1 to 5
 * This class is used to develop Multithreaded Text Extractor Application using EXTENDS thread
 * 
 * @author Ng Wei Hen
 */
public class TextExtractorTask extends Thread {

	// declare two private attributes
	// first attribute represent a text
	// second attribute represents a list of word in a text
	private String text;
	private List<String> text2;
	
	// default constructor
	public TextExtractorTask()
	{
		// Assign the first attribute, text to the following text
		text = "The List component presents the user with a scrolling list of text items. The list can be set up so that the user can choose either one item or multiple items.";
		
		// Declare object for second attribute, text2 to contain each word from first attribute, text
		text2 = new ArrayList<String>();

		// split the words once there is blank space and store into a temporary array
		String[] words = text.split(" ");
		
		// add the separated word into second attribute, text2
		for(String word : words)
		{
			text2.add(word);
		}
	}
	
	// this method will generate random text from a list of word
	public void RandomTextGenerator()
	{
        // generating random number of word to be generated with the help of Math.random() function
		int word = (int)(Math.random() * text2.size());
		
		// declare an object of String builder to manipulate the string
        StringBuilder line = new StringBuilder();
        
        // generate word based on random index and combine these words into a single sentence
        // The process continues until it reach the number of words to be generated
        for(int counter = 0; counter < word; counter++)
        {
        	int random = (int)(Math.random() * text2.size());
        	line.append(text2.get(random)).append(" ");
        }
        
        // convert the sentence that append to StringBuilder to String to obtain final string
        String RandomText = line.toString().trim();
        System.out.println(RandomText);
	}
	
	// this method will extract a portion of text at random length
	public void RandomTextExtractor()
	{
        // generating random index with the help of Math.random() function
		int index = (int) (Math.random()*text.length());
		
		// extract the first variable, text starting from index 0 to the random index generated 
		System.out.println(text.substring(0, index));
       
	}
	
	
	/*
	 * The method will execute the RandomTextGenerator() when the name of the thread contains “Generator”.
	 * The method will execute the RandomTextExtractor() when the name of the thread contains “Extractor”.
	 */
	@Override
	public void run()
	{
		// Get current thread
		Thread currentThread = Thread.currentThread();
		
		// Execute the tasks based on the name of current thread
		if(currentThread.getName().equals("Generator") || currentThread.getName().equals("generator"))
		{
			RandomTextGenerator();
		}
		
		else if(currentThread.getName().equals("Extractor") || currentThread.getName().equals("extractor"))
		{
			RandomTextExtractor();
		}
		
		else
		{
			System.out.println("Error!");
		}
		
	}
}
