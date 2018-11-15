import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.io.File;

/**
 * A class that parses the files of actors and actresses and it builds a graph
 * of the  corresponding actors/actresses and movies.
 */

public class IMDBGraphImpl
{	
	private final Scanner _actorParser;
	private final Scanner _actressParser;
	private final HashMap<String, Node> _actorNodes = new HashMap<String, Node>();
	private final HashMap<String, Node> _movieNodes = new HashMap<String, Node>();
	
	public IMDBGraphImpl (String actorsFilename, String actressesFilename) throws java.io.IOException 
	{
		_actorParser = new Scanner(new File(actorsFilename), "ISO-8859-1");
		_actressParser = new Scanner(new File(actressesFilename), "ISO-8859-1");
		buildGraph();
	}
	
	
	
	private void buildGraph()
	{
		
	}
	
	/**
	 * Gets all the actor nodes in the graph.
	 * @return a collection of all the actor and actress nodes in the graph.
	 */
	
	public Collection<? extends Node> getActors()
	{
		return _actorNodes.values();
	}
	
	/**
	 * Gets all the movie nodes in the graph
	 * @return a Collection of all the movies in the graph
	 */
	
	public Collection<? extends Node> getMovies()
	{
		return _movieNodes.values();
	}
	
	/**
	 * Returns the actor node having the specified name.
	 * @param name the name of the requested actor
	 * @return the actor node associated with the specified name or null
	 * if no such actor exists.
	 */
	
	public Node getActor(String name)
	{
		return _actorNodes.get(name);
	}
	
	/**
	 * Returns the movie node having the specified name.
	 * @param name the name of the requested movie
	 * @return the movie node associated with the specified name or null
	 * if no such movie exists.
	 */
	
	public Node getMovie(String name)
	{
		return _movieNodes.get(name);
	}
	
}
