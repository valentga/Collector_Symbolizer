//This program will illustrate the concepts learned in collector 
//Symbolizer, and operator videos  

public class Collector
{
	public static void main (String [] args)
	{
		
		//declartaion of String array 
		String[] outputText = new String[5];
		outputText[0] = "This"; 
		outputText[1] = "code";
		outputText[2] = "will";
		outputText[3] = "demonstrate";
		outputText[4] = "knowledge of symbols, operators, and collectors."; 

		//for loop to iterate through the String array
		//demonstrate knowledge of collections and how to loop through arrays. 
		for(int i = 0; i < outputText.length; i++)
		{
			System.out.print(outputText[i] + " ");
		} 
		System.out.println(); 

		hoursToSeconds(); //calls hoursToSeconds method. 
		secondsToHours(); //calls secondsToHours method

	}

	//This method converts and time in hours into a time in seonds and print the time.
	public static void hoursToSeconds()
	{
		//declaration of constants 
		//deomonstrate how to declare constants with primitive type
		final int NUMBER_OF_SECONDS_IN_MINUTE = 60;
		final int NUMBER_OF_MINUTE_IN_HOUR = 60; 

		//declaration of variables for converting hours into seconds 
		//demonstrates knowledge of how to declare variables with primitive type 
		int numberOfHours = 24; 
		int numberOfSeconds;

		System.out.println("24 hours will be converted into an equivalent time in seconds."); 

		//converting 24 hours into seconds and printing the value
		numberOfSeconds = numberOfHours * NUMBER_OF_MINUTE_IN_HOUR * NUMBER_OF_SECONDS_IN_MINUTE;
		System.out.println("24 hours is equal to " + numberOfSeconds + " seconds."); 

	}

	//This method converts a time in seconds into a time displayed in hours, seconds, and minutes. 
	//Prints the time after it has been converted. 
	public static void secondsToHours()
	{
		//declaration of constants 
		//deomonstrate how to declare constants with primitive type
		final int NUMBER_OF_SECONDS_IN_MINUTE = 60;
		final int NUMBER_OF_MINUTE_IN_HOUR = 60; 

		//declartation of variables
		int startingSeconds = 8000;
		int hours;
		int remainingMin;
		int minutes;
		int seconds; 

		System.out.println(startingSeconds + " will be converted into an equivalent time in hours, minutes, and seconds"); 

		hours = startingSeconds / (NUMBER_OF_SECONDS_IN_MINUTE * NUMBER_OF_MINUTE_IN_HOUR); 
		remainingMin = startingSeconds % (NUMBER_OF_SECONDS_IN_MINUTE * NUMBER_OF_MINUTE_IN_HOUR); 
		minutes = remainingMin / NUMBER_OF_SECONDS_IN_MINUTE; 
		seconds = remainingMin % NUMBER_OF_SECONDS_IN_MINUTE; 

		System.out.println(startingSeconds + " seconds is equal to " + hours + " hours " + minutes + " minutes and " + seconds + " seconds."); 

	}
}	