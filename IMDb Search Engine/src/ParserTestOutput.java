import java.io.IOException;

public class ParserTestOutput 
{

	public static void main(String[] args) throws IOException 
	{
		final IMDBGraphImpl testParser = new IMDBGraphImpl("C:\\Users\\Matt\\Documents\\Microsoft Documents\\WPI\\Freshman Year 2018 - 2019\\B Term\\CS 2103 - Object Oriented Design Concepts\\Projects\\Project 3 - IMDb\\IMDb Search Engine\\src\\actors_test.list", 
				"C:\\Users\\Matt\\Documents\\Microsoft Documents\\WPI\\Freshman Year 2018 - 2019\\B Term\\CS 2103 - Object Oriented Design Concepts\\Projects\\Project 3 - IMDb\\IMDb Search Engine\\src\\actresses_test.list");
		System.out.println(testParser._actorParser.nextLine());
	}

}
