package acsse.csc3a.Application;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class GraphDisplay extends StackPane
{

    private Graph<Integer> graph;

    public GraphDisplay(Graph<Integer> graph) 
    {
        this.graph = graph;
    }

    public void show() 
    {
        Group root = new Group();

        // Draw vertices
        for (Vertex<Integer> vertex : graph.getVertices()) 
        {
            Circle circle = new Circle(vertex.getValue() * 30, vertex.getWeight() * 30, 10, Color.BLUE);
            root.getChildren().add(circle);
        }

        // Draw edges
        for (Vertex<Integer> vertex : graph.getVertices())
        {
            for (Edge edge : vertex.getEdges())
            {
                Line line = new Line
                (
                        vertex.getValue() * 30 + 10, vertex.getWeight() * 30 + 10,
                        edge.getToVertex().getWeight() * 30 + 10, edge.getToVertex().getWeight() * 30 + 10
                );
                root.getChildren().add(line);
            }
        }

        Scene scene = new Scene(root, 600, 600, Color.WHITE);

        Stage stage = new Stage();
        stage.setTitle("Graph Display");
        stage.setScene(scene);
        stage.show();
    }

   // JavaFX Stuff 
    
    public GridPane CreateGridPane()
    {
		return null;
    }
}

