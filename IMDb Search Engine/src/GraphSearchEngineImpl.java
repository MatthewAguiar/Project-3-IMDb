import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
import java.util.HashMap;

public class GraphSearchEngineImpl implements GraphSearchEngine
{	
	public List<Node> findShortestPath (Node s, Node t)
	{
		//First perform a bfs.
		Queue<Node> nodesToVisit = new LinkedList<Node>();
		Stack<Node> visitedNodes = new Stack<Node>();
		HashMap<String, Integer> distanceFromStartMap = new HashMap<String, Integer>();
		
		nodesToVisit.add(s); //enqueue.
		distanceFromStartMap.put(s.getName(), 0);
		Node currentNode;
		while(nodesToVisit.size() > 0)
		{
			currentNode = nodesToVisit.remove();
			visitedNodes.push(currentNode);
			
			if(currentNode.equals(t))
			{
				break;
			}
			
			for(Node subNode : currentNode.getNeighbors())
			{
				if(!nodesToVisit.contains(subNode) && !visitedNodes.contains(subNode))
				{
					nodesToVisit.add(subNode);
					distanceFromStartMap.put(subNode.getName(), distanceFromStartMap.get(currentNode.getName()) + 1);
				}
			}
		}
		
		//Backtrack!
		List<Node> shortestPath = new LinkedList<Node>();
		Node backtrackingNode = visitedNodes.pop();
		shortestPath.add(backtrackingNode);
		while(!visitedNodes.empty())
		{
			if(distanceFromStartMap.get(visitedNodes.peek().getName()) == distanceFromStartMap.get(backtrackingNode.getName()) - 1 && backtrackingNode.getNeighbors().contains(visitedNodes.peek()))
			{
				backtrackingNode = visitedNodes.pop();
				shortestPath.add(0, backtrackingNode);
			}
			else
			{
				visitedNodes.pop();
			}
		}
		
		return shortestPath;
	}
}
