package acsse.csc3a.graph;

import com.jwetherell.algorithms.data_structures.Graph.Vertex;

public class Location extends Vertex<Integer>
{
	// Private attributes 
	private String name;
    private double latitude;
    private double longitude;
    private double x;
    private double y;
    private int id = 0;

	public Location(Integer value)
	{
		super(value);
		// TODO Auto-generated constructor stub
	}
	
	public Location(Integer id, String name, double latitude, double longitude)
	{
        super(id);
        this.id = id;
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }
	
	public int getID()
	{
		return id;
	}
	
	public String getName() 
	{
        return name;
    }
    
    public double getLatitude() 
    {
        return latitude;
    }
    
    public double getLongitude() 
    {
        return longitude;
    }
    
    public void setX(double x)
    {
    	this.x = x;
    }
    
    public void setY(double y)
    {
    	this.y = y;
    }

	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}
	


}
