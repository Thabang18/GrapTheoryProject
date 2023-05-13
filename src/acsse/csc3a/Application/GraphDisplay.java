package acsse.csc3a.Application;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Optional;

import com.jwetherell.algorithms.data_structures.Graph;
import com.jwetherell.algorithms.data_structures.Graph.Edge;
import com.jwetherell.algorithms.data_structures.Graph.Vertex;

import acsse.csc3a.graph.Location;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextInputDialog;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class GraphDisplay extends StackPane
{

    private Graph<Integer> graph;
    ArrayList<Location> vertices = vertices = new ArrayList<>();
    ArrayList<Edge> edges = null;
    File chosenFile = null;

    public GraphDisplay(Graph<Integer> graph) 
    {
        this.graph = graph; 
        
    }
    
    public void drawLineBetweenLocations(double startX, double startY, double endX, double endY, Canvas canvas) {
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(2);
        
        gc.strokeLine(startX-1, startY+4, endX+2, endY+2);
       
    }
    
    public GraphDisplay()
    {
		// Create the GUI part
	BorderPane root = new BorderPane();
	GridPane grdpane = CreateGridPane();

     // Add a titledpane 
   		
   	TitledPane titledpane = new TitledPane();
   	titledpane.setText("Resource distributor");
   	titledpane.setPrefWidth(810);
   	titledpane.setContent(grdpane);
   	titledpane.setCollapsible(false);
   	
   	// After adding a titledpane
   	
   	root.setLeft(titledpane);
   	
   	Scene scene = new Scene(root, 600, 400);
   	Stage stage = new Stage();
   	stage.setTitle("Graph ADT");
   	stage.setScene(scene);
   	
   		
   	this.getChildren().add(root); 
    }


    
    public void setLocations()
    {
		Location GaMotupa = new Location(1, "Ga-Motupa", 51.5074, 0.1278);
		GaMotupa.setX(30);
		GaMotupa.setY(40);
		Location Morutji = new Location(2, "Morutji", 51.5074, 0.1278);
		Morutji.setX(2);
		Morutji.setY(90);
		Location Modjadji = new Location(3, "Modjadji", 51.5074, 0.1278);
		Modjadji.setX(5);
		Modjadji.setY(150);
		Location Morapalala = new Location(4, "Morapalala", 51.5074, 0.1278);
		Morapalala.setX(8);
		Morapalala.setY(220);
		Location Madumeleng = new Location(19, "Madumeleng", 51.5074, 0.1278);
		Madumeleng.setX(190);
		Madumeleng.setY(85);
		Location Matshwi = new Location(17, "Matshwi", 51.5074, 0.1278);
		Matshwi.setX(215);
		Matshwi.setY(115);
		Location Mothobekhi = new Location(16, "Mothobekhi", 51.5074, 0.1278);
		Mothobekhi.setX(250);
		Mothobekhi.setY(140);
		Location Matipane = new Location(18, "Matipane", 51.5074, 0.1278);
		Matipane.setX(170);
		Matipane.setY(160);
		Location Mokwakwaila = new Location(14, "Mokwakwaila", 51.5074, 0.1278);
		Mokwakwaila.setX(120);
		Mokwakwaila.setY(200);
		Location Polasene = new Location(15, "Polasene", 51.5074, 0.1278);
		Polasene.setX(260);
		Polasene.setY(180);
		Location Femane = new Location(7, "Femane", 51.5074, 0.1278);
		Femane.setX(230);
		Femane.setY(230);
		Location Ntata = new Location(9, "Ntata", 51.5074, 0.1278);
		Ntata.setX(250);
		Ntata.setY(260);
		Location Bellevue = new Location(11, "Bellevue", 51.5074, 0.1278);
		Bellevue.setX(300);
		Bellevue.setY(300);
		Location Block17 = new Location(10, "Block 17", 51.5074, 0.1278);
		Block17.setX(240);
		Block17.setY(330);
		Location Block8 = new Location(6, "Block 8", 51.5074, 0.1278);
		Block8.setX(100);
		Block8.setY(240);
		Location Block12 = new Location(5, "Block 12", 51.5074, 0.1278);
		Block12.setX(40);
		Block12.setY(270);
		Location Mohlabaneng = new Location(8, "Mohlabaneng", 51.5074, 0.1278);
		Mohlabaneng.setX(330);
		Mohlabaneng.setY(220);
		Location Khesothopa = new Location(13, "Khesothopa", 51.5074, 0.1278);
		Khesothopa.setX(390);
		Khesothopa.setY(200);
		Location Jamela = new Location(12, "Jamela", 51.5074, 0.1278);
		Jamela.setX(410);
		Jamela.setY(170);
		
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
				
		vertices.add(GaMotupa);
		vertices.add(Morutji);
		vertices.add(Modjadji);
		vertices.add(Morapalala);
		vertices.add(Madumeleng);
		vertices.add(Matshwi);
		vertices.add(Mothobekhi);
		vertices.add(Matipane);
		vertices.add(Mokwakwaila);
		vertices.add(Polasene);
		vertices.add(Femane);
		vertices.add(Ntata);
		vertices.add(Bellevue);
		vertices.add(Block17);
		vertices.add(Block8);
		vertices.add(Block12);
		vertices.add(Mohlabaneng);
		vertices.add(Khesothopa);
		vertices.add(Jamela);
		
	//	drawLineBetweenLocations(Femane.getX(), Femane.getY(), location2.getX(), location2.getY(), canvas);
			
    }

   // JavaFX Stuff 
    
    public GridPane CreateGridPane()
    {
    	GridPane grdpane = new GridPane();
    	
    	//setLocations();
    	edges = new ArrayList<>();
    	
		// Set the vertical and the horizontal padding
		grdpane.setPadding(new Insets(18));
		grdpane.setHgap(10);
		grdpane.setVgap(10);
		
		
		
		// Now, add your buttons 
		
		Button btnAddLocation = new Button("Add Location");
		grdpane.add(btnAddLocation, 0,0,1,1);
		
		Button btnRemoveLocation = new Button("Remove Location");
		grdpane.add(btnRemoveLocation, 1,0,1,1);
		
		Button btnUpdateLocation = new Button("Update Location");
		grdpane.add(btnUpdateLocation, 2,0,1,1);
		
		Button btnSolve = new Button("Solve Graph");
		grdpane.add(btnSolve, 3, 0,1,1);
		
		Button btnSave = new Button("Save to file");
		grdpane.add(btnSave, 4,0,2,1);
		
		
		Location GaMotupa = new Location(1, "Ga-Motupa", 51.5074, 0.1278);
		GaMotupa.setX(30);
		GaMotupa.setY(40);
		Location Morutji = new Location(2, "Morutji", 51.5074, 0.1278);
		Morutji.setX(2);
		Morutji.setY(90);
		Location Modjadji = new Location(3, "Modjadji", 51.5074, 0.1278);
		Modjadji.setX(5);
		Modjadji.setY(150);
		Location Morapalala = new Location(4, "Morapalala", 51.5074, 0.1278);
		Morapalala.setX(8);
		Morapalala.setY(220);
		Location Madumeleng = new Location(19, "Madumeleng", 51.5074, 0.1278);
		Madumeleng.setX(190);
		Madumeleng.setY(85);
		Location Matshwi = new Location(17, "Matshwi", 51.5074, 0.1278);
		Matshwi.setX(215);
		Matshwi.setY(115);
		Location Mothobekhi = new Location(16, "Mothobekhi", 51.5074, 0.1278);
		Mothobekhi.setX(250);
		Mothobekhi.setY(140);
		Location Matipane = new Location(18, "Matipane", 51.5074, 0.1278);
		Matipane.setX(170);
		Matipane.setY(160);
		Location Mokwakwaila = new Location(14, "Mokwakwaila", 51.5074, 0.1278);
		Mokwakwaila.setX(120);
		Mokwakwaila.setY(200);
		Location Polasene = new Location(15, "Polasene", 51.5074, 0.1278);
		Polasene.setX(260);
		Polasene.setY(180);
		Location Femane = new Location(7, "Femane", 51.5074, 0.1278);
		Femane.setX(230);
		Femane.setY(230);
		Location Ntata = new Location(9, "Ntata", 51.5074, 0.1278);
		Ntata.setX(250);
		Ntata.setY(260);
		Location Bellevue = new Location(11, "Bellevue", 51.5074, 0.1278);
		Bellevue.setX(300);
		Bellevue.setY(300);
		Location Block17 = new Location(10, "Block 17", 51.5074, 0.1278);
		Block17.setX(240);
		Block17.setY(330);
		Location Block8 = new Location(6, "Block 8", 51.5074, 0.1278);
		Block8.setX(100);
		Block8.setY(240);
		Location Block12 = new Location(5, "Block 12", 51.5074, 0.1278);
		Block12.setX(40);
		Block12.setY(270);
		Location Mohlabaneng = new Location(8, "Mohlabaneng", 51.5074, 0.1278);
		Mohlabaneng.setX(330);
		Mohlabaneng.setY(220);
		Location Khesothopa = new Location(13, "Khesothopa", 51.5074, 0.1278);
		Khesothopa.setX(390);
		Khesothopa.setY(200);
		Location Jamela = new Location(12, "Jamela", 51.5074, 0.1278);
		Jamela.setX(410);
		Jamela.setY(170);
		
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
				
		vertices.add(GaMotupa);
		vertices.add(Morutji);
		vertices.add(Modjadji);
		vertices.add(Morapalala);
		vertices.add(Madumeleng);
		vertices.add(Matshwi);
		vertices.add(Mothobekhi);
		vertices.add(Matipane);
		vertices.add(Mokwakwaila);
		vertices.add(Polasene);
		vertices.add(Femane);
		vertices.add(Ntata);
		vertices.add(Bellevue);
		vertices.add(Block17);
		vertices.add(Block8);
		vertices.add(Block12);
		vertices.add(Mohlabaneng);
		vertices.add(Khesothopa);
		vertices.add(Jamela);
		
	    
		btnAddLocation.setOnAction(e ->
		{
		    TextInputDialog dialog = new TextInputDialog();
		    dialog.setTitle("Add Location");
		    dialog.setHeaderText("Enter Location Name and Coordinates");
		    dialog.setContentText("Location Name, Latitude, Longitude, X, Y:");

		    Optional<String> result = dialog.showAndWait();
		    result.ifPresent(locationInfo -> {
		        String[] locationParts = locationInfo.split(",");
		        if (locationParts.length == 5) 
		        {
		            String name = locationParts[0].trim();
		            int locationID = 0;
		            double latitude = Double.parseDouble(locationParts[1].trim());
		            double longitude = Double.parseDouble(locationParts[2].trim());
		            double x = Double.parseDouble(locationParts[3].trim());
		            double y = Double.parseDouble(locationParts[4].trim());

		            Location newLocation = new Location(locationID,name,latitude,longitude);
		            newLocation.setX(x);
		            newLocation.setY(y);
		            vertices.add(newLocation);
		            
		            
		        } else {
		            Alert alert = new Alert(AlertType.ERROR);
		            alert.setTitle("Error Adding Location");
		            alert.setHeaderText("Invalid Location Information");
		            alert.setContentText("Please enter location information in the format: Location Name, Latitude, Longitude, X, Y");
		            alert.showAndWait();
		        }
		    });
		});
		
	
		
		btnRemoveLocation.setOnAction(e ->
		{

		});
		
		btnSave.setOnAction(e ->
		{
			
		});

		
        
		

		
		 // Create a canvas to draw the graph on
	    Canvas canvas = new Canvas(500, 500);
	    grdpane.add(canvas, 0, 1, 3, 1);

	    // Get the graphics context of the canvas
	    GraphicsContext gc = canvas.getGraphicsContext2D();

	    // Clear the canvas
	    gc.clearRect(0, 0, canvas.getWidth(), canvas.getHeight());

	    // Draw the vertices
	    for (Location location : vertices) 
	    {
	        double x = location.getX();
	        double y = location.getY();
	        gc.fillOval(x, y, 10, 10);
	        gc.fillText(location.getName(), x + 12, y + 6);
	    }
	    
	    drawLineBetweenLocations(Femane.getX(), Femane.getY(), Mokwakwaila.getX(), Mokwakwaila.getY(), canvas);
	    drawLineBetweenLocations(Femane.getX(), Femane.getY(), Ntata.getX(), Ntata.getY(), canvas);
	    drawLineBetweenLocations(Ntata.getX(), Ntata.getY(), Bellevue.getX(), Bellevue.getY(), canvas);
	    drawLineBetweenLocations(Block17.getX(), Block17.getY(), Bellevue.getX(), Bellevue.getY(), canvas);
	    drawLineBetweenLocations(Ntata.getX(), Ntata.getY(), Block17.getX(), Block17.getY(), canvas);
	    drawLineBetweenLocations(Mokwakwaila.getX(), Mokwakwaila.getY(), Block8.getX(), Block8.getY(), canvas);
	    drawLineBetweenLocations(Block8.getX(), Block8.getY(), Block12.getX(), Block12.getY(), canvas);
	    drawLineBetweenLocations(Femane.getX(), Femane.getY(), Polasene.getX(), Polasene.getY(), canvas);
	    drawLineBetweenLocations(Polasene.getX(), Polasene.getY(), Mothobekhi.getX(), Mothobekhi.getY(), canvas);
	    drawLineBetweenLocations(Femane.getX(), Femane.getY(), Mohlabaneng.getX(), Mohlabaneng.getY(), canvas);
	    drawLineBetweenLocations(Bellevue.getX(), Bellevue.getY(), Khesothopa.getX(), Khesothopa.getY(), canvas);
	    drawLineBetweenLocations(Mohlabaneng.getX(), Mohlabaneng.getY(), Khesothopa.getX(), Khesothopa.getY(), canvas);
	    drawLineBetweenLocations(Khesothopa.getX(), Khesothopa.getY(), Jamela.getX(), Jamela.getY(), canvas);
	    drawLineBetweenLocations(Mokwakwaila.getX(), Mokwakwaila.getY(), Matipane.getX(), Matipane.getY(), canvas);
	    drawLineBetweenLocations(Matipane.getX(), Matipane.getY(), Matshwi.getX(), Matshwi.getY(), canvas);
	    drawLineBetweenLocations(Matshwi.getX(), Matshwi.getY(), Mothobekhi.getX(), Mothobekhi.getY(), canvas);
	    drawLineBetweenLocations(Matipane.getX(), Matipane.getY(), Polasene.getX(), Polasene.getY(), canvas);  
	    drawLineBetweenLocations(Block12.getX(), Block12.getY(), Morapalala.getX(), Morapalala.getY(), canvas);
	    drawLineBetweenLocations(Morapalala.getX(), Morapalala.getY(), Modjadji.getX(), Modjadji.getY(), canvas);
	    drawLineBetweenLocations(Modjadji.getX(), Modjadji.getY(), Morutji.getX(), Morutji.getY(), canvas);
	    drawLineBetweenLocations(Morutji.getX(), Morutji.getY(), GaMotupa.getX(), GaMotupa.getY(), canvas);
	    drawLineBetweenLocations(GaMotupa.getX(), GaMotupa.getY(), Madumeleng.getX(), Madumeleng.getY(), canvas);
	    drawLineBetweenLocations(Madumeleng.getX(), Madumeleng.getY(), Matshwi.getX(), Matshwi.getY(), canvas);
	    drawLineBetweenLocations(Morapalala.getX(), Morapalala.getY(), Matipane.getX(), Matipane.getY(), canvas);
	    
	    
	    
	    // Fix this.
	    /*
	    for (Edge<Integer> edge : vertices.getEdges()) 
	    {
	        Location connectedLocation = (Location) edge.getToVertex();
	        double angle2 = 2 * Math.PI * vertices.indexOf(connectedLocation) / vertices.size();
	        int x2 = (int) (width / 2 + r * Math.cos(angle2));
	        int y2 = (int) (height / 2 + r * Math.sin(angle2));
	        gc.drawLine(x1, y1, x2, y2);
	    }*/
	       		
		return grdpane;
    }
}

