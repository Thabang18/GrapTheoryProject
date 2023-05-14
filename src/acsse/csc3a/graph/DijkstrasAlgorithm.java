package acsse.csc3a.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

public class DijkstrasAlgorithm<T extends Comparable<T>>
{
	private List<Graph.Vertex<T>> vertices = null;
    private List<Graph.Edge<T>> edges = null;
    
    public DijkstrasAlgorithm(Graph<T> graph)
    {
    	this.vertices = new ArrayList<>(graph.getVertices());
        this.edges = new ArrayList<>(graph.getEdges());
    }
    
    public Graph.CostPathPair<T> fsp(Graph.Vertex<T> s, Graph.Vertex<T> e)
    {
       
        Map<Graph.Vertex<T>, Integer> nodeCosts = new HashMap<>();
        for (Graph.Vertex<T> v : vertices) {
            nodeCosts.put(v, Integer.MAX_VALUE);
        }
        nodeCosts.put(s, 0);

        
        Map<Graph.Vertex<T>, List<Graph.Edge<T>>> nodePaths = new HashMap<>();
        for (Graph.Vertex<T> node : vertices) {
            nodePaths.put(node, new ArrayList<>());
        }
        
        // create a priority queue to store nodes in the order of their cost
        PriorityQueue<Graph.CostVertexPair<T>> pq = new PriorityQueue<>();

        // add the start node to the priority queue
        pq.add(new Graph.CostVertexPair<>(0, s));

        // iterate through the priority queue
        while (!pq.isEmpty()) {
            Graph.CostVertexPair<T> costVertexPair = pq.poll();
            Graph.Vertex<T> current = costVertexPair.getVertex();
            int currentCost = costVertexPair.getCost();

            // if we have already found a better path to this node, skip it
            if (currentCost > nodeCosts.get(current)) {
                continue;
            }

            // iterate through the edges connected to this node
            for (Graph.Edge<T> edge : getEdges(current)) {
                Graph.Vertex<T> neighbor = getOpposite(current, edge);

                // calculate the cost of the path through this node
                int cost = currentCost + edge.getCost();

                // if we have found a better path to the neighbor node, update the cost and path
                if (cost < nodeCosts.get(neighbor)) {
                    nodeCosts.put(neighbor, cost);
                    List<Graph.Edge<T>> newPath = new ArrayList<>(nodePaths.get(current));
                    newPath.add(edge);
                    nodePaths.put(neighbor, newPath);
                    pq.add(new Graph.CostVertexPair<>(cost, neighbor));
                }
            }
        }

        // return the cost and path pair for the end node
        return new Graph.CostPathPair<>(nodeCosts.get(e), nodePaths.get(e));
    }

    private Graph.Vertex<T> getOpposite(Graph.Vertex<T> node, Graph.Edge<T> edge) 
    {
        if (edge.getFromVertex().equals(node)) {
            return edge.getToVertex();
        } else if (edge.getToVertex().equals(node)) {
            return edge.getFromVertex();
        } else {
            throw new IllegalArgumentException("Edge " + edge + " is not connected to node " + node);
        }
    }

	 private List<Graph.Edge<T>> getEdges(Graph.Vertex<T> node)
	 {
	        List<Graph.Edge<T>> nodeEdges = new ArrayList<>();
	        for (Graph.Edge<T> edge : edges) {
	            if (edge.getFromVertex().equals(node)) {
	                nodeEdges.add(edge);
	            }
	        }
	        return nodeEdges;
	    }
    
    
}
