import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashMap;

public class GraphSearchEngineImpl implements GraphSearchEngine
{
	public GraphSearchEngineImpl()
	{
		
	}
	
	public List<Node> findShortestPath (Node s, Node t)
	{
		//First perform a bfs.
		List<Node> visitedNodes = new LinkedList<Node>();
		HashMap<String, Integer> distanceFromStartMap = new HashMap<String, Integer>();
		Queue<Node> nodesToVisit = new LinkedList<Node>();
		
		nodesToVisit.add(s); //enqueue.
		distanceFromStartMap.put(s.getName(), 0);
		Node newlyVisitedNode;
		while(nodesToVisit.size() > 0)
		{
			newlyVisitedNode = nodesToVisit.remove(); //dequeue.
			visitedNodes.add(newlyVisitedNode);
			
			if(newlyVisitedNode.equals(t))
			{
				break;
			}
			
			for(Node subNode : newlyVisitedNode.getNeighbors())
			{
				if(!nodesToVisit.contains(subNode) && !visitedNodes.contains(subNode))
				{
					nodesToVisit.add(subNode);
					distanceFromStartMap.put(subNode.getName(), distanceFromStartMap.get(newlyVisitedNode.getName()) + 1);
				}
			}
		}
		
		//Backtrack! Should shortest path start at t and go to s or from s to t.
		List<Node> shortestPath = new LinkedList<Node>();
		shortestPath.add(visitedNodes.getLast());
		while(visitedNodes.size() > 0)
		{
			
		}
		
		return shortestPath;
	}
}
