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

		Location GaMotupa = new Location(1, "Ga-Motupa", 51.5074, 0.1278);
		Location Morutji = new Location(2, "Morutji", 51.5074, 0.1278);
		Location Modjadji = new Location(3, "Modjadji", 51.5074, 0.1278);
		Location Morapalala = new Location(4, "Morapalala", 51.5074, 0.1278);
		Location Block12 = new Location(5, "Block 12", 51.5074, 0.1278);
		Location Block8 = new Location(6, "Block 8", 51.5074, 0.1278);
		Location Femane = new Location(7, "Femane", 51.5074, 0.1278);
		Location Mohlabaneng = new Location(8, "Mohlabaneng", 51.5074, 0.1278);
		Location Ntata = new Location(9, "Ntata", 51.5074, 0.1278);
		Location Block17 = new Location(10, "Block 17", 51.5074, 0.1278);
		Location Bellevue = new Location(11, "Bellevue", 51.5074, 0.1278);
		Location Jamela = new Location(12, "Jamela", 51.5074, 0.1278);
		Location Khesothopa = new Location(13, "Khesothopa", 51.5074, 0.1278);
		Location Mokwakwaila = new Location(14, "Mokwakwaila", 51.5074, 0.1278);
		Location Polasene = new Location(15, "Polasene", 51.5074, 0.1278);
		Location Mothobekhi = new Location(16, "Mothobekhi", 51.5074, 0.1278);
		Location Matshwi = new Location(17, "Matshwi", 51.5074, 0.1278);
		Location Matipane = new Location(18, "Matipane", 51.5074, 0.1278);
		Location Madumeleng = new Location(19, "Madumeleng", 51.5074, 0.1278);
	
		
		Edge<Integer> FMNT = new Edge(5,Femane,Ntata);
		Edge<Integer> NTBL = new Edge(11,Ntata,Bellevue);
		Edge<Integer> B17BL = new Edge(24,Block17,Bellevue);
		Edge<Integer> BLJM = new Edge(10,Bellevue,Jamela);
		Edge<Integer> BL12BL17 = new Edge(20,Block12,Block17);
		Edge<Integer> PLFM = new Edge(5,Polasene,Femane);
		Edge<Integer> MKFM = new Edge(4,Mokwakwaila,Femane);
		Edge<Integer> MRPMK = new Edge(11,Morapalala,Mokwakwaila);
		Edge<Integer> MKMT = new Edge(11,Mokwakwaila,Matipane);
		Edge<Integer> MTM = new Edge(6,Matipane,Matshwi);
		Edge<Integer> MTHM = new Edge(7,Mothobekhi,Matshwi);
		Edge<Integer> MTHPL = new Edge(4,Mothobekhi,Polasene);
		Edge<Integer> MTPMD = new Edge(25,GaMotupa,Madumeleng);
		Edge<Integer> MTPMRJ = new Edge(9,GaMotupa,Morutji);
		Edge<Integer> MRJMDJ = new Edge(8,Morutji,Modjadji);
		Edge<Integer> FMMH = new Edge(7,Femane,Mohlabaneng);
		Edge<Integer> MHKH = new Edge(2,Mohlabaneng,Khesothopa);
		Edge<Integer> KHJM = new Edge(3,Khesothopa,Jamela);
		Edge<Integer> KHBL = new Edge(8,Khesothopa,Bellevue);
		Edge<Integer> NTB17 = new Edge(17,Ntata,Block17);
		Edge<Integer> MTHJM = new Edge(21,Mothobekhi,Jamela);
		Edge<Integer> MTHMH = new Edge(17,Mothobekhi,Mohlabaneng);
		Edge<Integer> MTPL = new Edge(5,Matipane,Polasene);
		Edge<Integer> BL8FM = new Edge(18,Block8,Femane);
		Edge<Integer> BL12BL8 = new Edge(4,Block12,Block8);
		Edge<Integer> MRPBL12 = new Edge(17,Morapalala,Block12);
		Edge<Integer> MDJMRP = new Edge(12,Modjadji,Morapalala);
		Edge MRPMT = new Edge(7,Morapalala,Matipane);
		Edge MDM = new Edge(6,Madumeleng,Matshwi);
		
		vertices.add(Bellevue);
		vertices.add(Jamela);
		vertices.add(Madumeleng);
		vertices.add(Matshwi);
		vertices.add(Modjadji);
		vertices.add(Polasene);
		vertices.add(Block12);
		vertices.add(Block17);
		vertices.add(Morapalala);
		vertices.add(Morutji);
		vertices.add(GaMotupa);
		vertices.add(Mohlabaneng);
		vertices.add(Matipane);
		vertices.add(Block8);
		vertices.add(Mothobekhi);
		vertices.add(Femane);
		vertices.add(Ntata);
		vertices.add(Mokwakwaila);
		vertices.add(GaMotupa);
		
		
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
	    	System.out.println("..........................");
	        System.out.println(edge.getCost());
	    }
	}

	
}
