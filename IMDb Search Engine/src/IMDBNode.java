import java.util.Collection;
import java.util.LinkedList;

/**
 * A class that gets the name of a specified node and gets all its neighbors nodes.
 *
 */

public class IMDBNode implements Node
{
	private String _name;
	private LinkedList<Node> _neighbors;
	
	/**
	 * @param name the name of the specified node in the graph
	 * @param neighbors the list of nearby nodes in the graph
	 */
	
	public IMDBNode(String name, LinkedList<Node> neighbors)
	{
		_name = name;
		_neighbors = neighbors;
	}
	
	/**
	 * Returns the name of a node in the graph
	 * @return the name of a node in the graph
	 */
	
	public String getName()
	{
		return _name;
	}
	
	/**
	 * Returns a collection of nearby nodes in the graph
	 * @return a collection of nearby nodes in the graph
	 */
	
	public Collection<? extends Node> getNeighbors()
	{
		return _neighbors;
	}
	
	/**
	 * Adds a node to the list of nearby nodes in the graph 
	 * @param node a node on the graph 
	 */
	
	public void addNeighbor(Node node)
	{
		_neighbors.add(node);
	}
	
	/**
	 * Checks if the requested node in the graph have any neighboring nodes. If it does not
	 * it should return false. 
	 * @param node a node on the graph
	 */
	
	public void hasNeighbor(Node node)
	{
		_neighbors.add(node);
	}
}
