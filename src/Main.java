import java.util.ArrayList;
import java.util.List;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;

import acsse.csc3a.Application.GraphDisplay;
import acsse.csc3a.graph.ServiceGraph;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application
{

	public static void main(String[] args)
	{	
		ServiceGraph serviceGraph = new ServiceGraph(0, 0);
	    
    	ServiceGraph.CreateGraph();
		
        launch(args);
	}

	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		GraphDisplay root = new GraphDisplay();
		primaryStage.setScene(new Scene(root));
		primaryStage.setTitle("GRAPH ADT Mini Project");
		primaryStage.setHeight(750);
		primaryStage.setWidth(820);
		primaryStage.show();
		
	}

}
