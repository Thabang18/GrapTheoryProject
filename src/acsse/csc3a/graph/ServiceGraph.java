package acsse.csc3a.graph;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.jwetherell.algorithms.data_structures.Graph;

public class ServiceGraph extends Graph
{
	// Attributes 
	static ArrayList vertices = null;
	static ArrayList edges = null;
	static Graph graph = null;
	
	public ServiceGraph(int nVertices, int nEdges)
	{
        super(TYPE.UNDIRECTED);
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
    }
	
	/**
	 * Creates a new graph by adding vertices and edges to it.
	 * 
	 * @param graph The graph object to which vertices and edges will be added.
	 * @param vertices The array of vertices to add to the graph.
	 * @param edges The array of edges to add to the graph.
	 * @throws IllegalArgumentException if the vertices or edges are null or empty.
	 */
	public static void CreateGraph()
	{
		Vertex<Integer> MOTUPA = new Vertex<Integer>(1, 20);
		Vertex<Integer> MORUTJI = new Vertex<Integer>(2, 21);
		Vertex<Integer> MODJADJI = new Vertex<Integer>(3, 22);
		Vertex<Integer> MORAPALALA = new Vertex<Integer>(4, 23);
		Vertex<Integer> BLOCK12 = new Vertex<Integer>(5, 24);
		Vertex<Integer> BLOCK8 = new Vertex<Integer>(6, 25);
		Vertex<Integer> FEMANE = new Vertex<Integer>(7, 26);
		Vertex<Integer> MOHLABANENG = new Vertex<Integer>(8, 27);
		Vertex<Integer> NTATA = new Vertex<Integer>(9, 28);
		Vertex<Integer> BLOCK17 = new Vertex<Integer>(10, 29);
	    Vertex<Integer> BELLEVUE = new Vertex<Integer>(11, 30);
		Vertex<Integer> JAMELA = new Vertex<Integer>(12, 31);
		Vertex<Integer> KHESOTHOPA = new Vertex<Integer>(13, 32);
		Vertex<Integer> MOKWAKWAILA = new Vertex<Integer>(14, 33);
		Vertex<Integer> POLASENE = new Vertex<Integer>(15, 34);
		Vertex<Integer> MOTHOBEKHI = new Vertex<Integer>(16, 35);
		Vertex<Integer> MATSHWI = new Vertex<Integer>(17, 36);
		Vertex<Integer> MATIPANE = new Vertex<Integer>(18, 37);
		Vertex<Integer> MADUMELENG = new Vertex<Integer>(19, 38);
		
		Edge<Integer> FMNT = new Edge(5,FEMANE,NTATA);
		Edge<Integer> NTBL = new Edge(11,NTATA,BELLEVUE);
		Edge<Integer> B17BL = new Edge(24,BLOCK17,BELLEVUE);
		Edge<Integer> BLJM = new Edge(10,BELLEVUE,JAMELA);
		Edge<Integer> BL12BL17 = new Edge(20,BLOCK12,BLOCK17);
		Edge<Integer> PLFM = new Edge(5,POLASENE,FEMANE);
		Edge<Integer> MKFM = new Edge(4,MOKWAKWAILA,FEMANE);
		Edge<Integer> MRPMK = new Edge(11,MORAPALALA,MOKWAKWAILA);
		Edge<Integer> MKMT = new Edge(11,MOKWAKWAILA,MATIPANE);
		Edge<Integer> MTM = new Edge(6,MATIPANE,MATSHWI);
		Edge<Integer> MTHM = new Edge(7,MOTHOBEKHI,MATSHWI);
		Edge<Integer> MTHPL = new Edge(4,MOTHOBEKHI,POLASENE);
		Edge<Integer> MTPMD = new Edge(25,MOTUPA,MADUMELENG);
		Edge<Integer> MTPMRJ = new Edge(9,MOTUPA,MORUTJI);
		Edge<Integer> MRJMDJ = new Edge(8,MORUTJI,MODJADJI);
		Edge<Integer> FMMH = new Edge(7,FEMANE,MOHLABANENG);
		Edge<Integer> MHKH = new Edge(2,MOHLABANENG,KHESOTHOPA);
		Edge<Integer> KHJM = new Edge(3,KHESOTHOPA,JAMELA);
		Edge<Integer> KHBL = new Edge(8,KHESOTHOPA,BELLEVUE);
		Edge<Integer> NTB17 = new Edge(17,NTATA,BLOCK17);
		Edge<Integer> MTHJM = new Edge(21,MOTHOBEKHI,JAMELA);
		Edge<Integer> MTHMH = new Edge(17,MOTHOBEKHI,MOHLABANENG);
		Edge<Integer> MTPL = new Edge(5,MATIPANE,POLASENE);
		Edge<Integer> BL8FM = new Edge(18,BLOCK8,FEMANE);
		Edge<Integer> BL12BL8 = new Edge(4,BLOCK12,BLOCK8);
		Edge<Integer> MRPBL12 = new Edge(17,MORAPALALA,BLOCK12);
		Edge<Integer> MDJMRP = new Edge(12,MODJADJI,MORAPALALA);
		Edge MRPMT = new Edge(7,MORAPALALA,MATIPANE);
		Edge MDM = new Edge(6,MADUMELENG,MATSHWI);
		
		vertices.add(BELLEVUE);
		vertices.add(JAMELA);
		vertices.add(MADUMELENG);
		vertices.add(MATSHWI);
		vertices.add(MODJADJI);
		vertices.add(POLASENE);
		vertices.add(BLOCK12);
		vertices.add(BLOCK17);
		vertices.add(MORAPALALA);
		vertices.add(MORUTJI);
		vertices.add(MOTUPA);
		vertices.add(MOHLABANENG);
		vertices.add(MATIPANE);
		vertices.add(BLOCK8);
		vertices.add(MOTHOBEKHI);
		vertices.add(FEMANE);
		vertices.add(NTATA);
		vertices.add(MOKWAKWAILA);
		vertices.add(MOTUPA);
		
		
		edges.add(B17BL);
		edges.add(BL12BL17);
		edges.add(BL12BL8);
		edges.add(BL8FM);
		edges.add(BLJM);
		edges.add(FMMH);
		edges.add(FMNT);
		edges.add(KHBL);
		edges.add(KHJM);
		edges.add(MDJMRP);
		edges.add(MDM);
		edges.add(MHKH);
		edges.add(MKFM);
		edges.add(MKMT);
		edges.add(MRJMDJ);
		edges.add(MRPBL12);
		edges.add(MRPMK);
		edges.add(MRPMT);
		edges.add(MTHJM);
		edges.add(MTM);
		edges.add(MTHPL);
		edges.add(MTHM);
		edges.add(MTPMD);
		edges.add(NTB17);
		edges.add(NTBL);
		edges.add(PLFM);
		
		graph = new Graph(Graph.TYPE.UNDIRECTED,vertices, edges);
		System.out.println(graph);
	}

	
	
	/**
	 * Uses Prim's algorithm to find the minimum spanning tree of a given graph.
	 * 
	 * @param graph the graph to find the minimum spanning tree for
	 * @return an ArrayList of Edges representing the minimum spanning tree
	 */
	public static ArrayList<Edge> PrimsAlgorithm(Graph<Integer> graph)
	{
	    // Initialize the result list and the visited set
	    ArrayList<Edge> result = new ArrayList<>();
	    Set<Vertex<Integer>> visited = new HashSet<>();
	    
	    // Pick any vertex as the starting vertex
	    Vertex<Integer> start = graph.getVertices().iterator().next();
	    visited.add(start);
	    
	    // Loop until all vertices are visited
	    while (visited.size() != graph.getVertices().size()) 
	    {
	        Edge minEdge = null;
	        Vertex<Integer> minVertex = null;
	        
	        // For each visited vertex, find the minimum-weight edge that connects to an unvisited vertex
	        for (Vertex<Integer> vertex : visited) 
	        {
	            for (Edge edge : vertex.getEdges()) 
	            {
	                Vertex<Integer> to = edge.getToVertex();
	                if (!visited.contains(to)) {
	                    if (minEdge == null || edge.getCost() < minEdge.getCost()) 
	                    {
	                        minEdge = edge;
	                        minVertex = to;
	                    }
	                }
	            }
	        }
	        
	        // Add the minimum-weight edge to the result and mark the corresponding vertex as visited
	        if (minEdge != null && minVertex != null) 
	        {
	            result.add(minEdge);
	            visited.add(minVertex);
	        }
	    }
	   
	    return result;
	}
	


	
	/**
	 * @return the graph representation of the service network
	 */
	public Graph<Integer> getGraph()
	{
		return graph;
	}

	public static void showResults()
	{
		ArrayList<Edge> mst = PrimsAlgorithm(graph);
	    for (Edge edge : mst) 
	    {
	        System.out.println(edge.getCost());
	    }
	}

	
}
