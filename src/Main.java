import java.util.ArrayList;
import java.util.List;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;

import acsse.csc3a.Application.GraphDisplay;
import acsse.csc3a.graph.ServiceGraph;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application
{

	public static void main(String[] args)
	{
		/*ServiceGraph serviceGraph = new ServiceGraph(0, 0);
		ServiceGraph.CreateGraph();*/
	
		
		ServiceGraph serviceGraph = new ServiceGraph(0, 0);
	
		ServiceGraph.CreateGraph();
        Graph g = serviceGraph.getGraph();	
        
     // Create an instance of GraphDisplay and pass the graph to it
        GraphDisplay display = new GraphDisplay(g);

        // Call the displayGraph method to show the graph
        display.show();
        launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		// TODO Auto-generated method stub
		
	}

}
