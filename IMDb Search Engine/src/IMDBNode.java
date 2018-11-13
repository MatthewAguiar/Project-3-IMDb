import java.util.Collection;
import java.util.LinkedList;

public class IMDBNode implements Node
{
	private String _name;
	private LinkedList<Node> _neighbors;
	
	public IMDBNode(String name, LinkedList<Node> neighbors)
	{
		_name = name;
		_neighbors = neighbors;
	}
	
	public String getName()
	{
		return _name;
	}
	
	public Collection<? extends Node> getNeighbors()
	{
		return _neighbors;
	}
	
	public void addNeighbor(Node node)
	{
		_neighbors.add(node);
	}
	
	public void hasNeighbor(Node node)
	{
		_neighbors.add(node);
	}
}
