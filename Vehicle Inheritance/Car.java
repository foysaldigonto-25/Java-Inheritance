import java.lang.*;

public class Car extends Vehicle 
{
    private String model;
    private int numberOfDoors;
    private String transmissionType;
    private double price;

    public Car() 
	{
        super();
        this.model = "Unknown";
        this.numberOfDoors = 0;
        this.transmissionType = "Unknown";
        this.price = 0.0;
    }
	
    public Car(String brand, String color, int year, double engineCapacity,String model, int numberOfDoors, String transmissionType, double price) 
    {
        super(brand, color, year, engineCapacity); 
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.transmissionType = transmissionType;
        this.price = price;
    }
	
	public void setModel(String model)                      
	{
		this.model = model; 
	}
    public void setNumberOfDoors(int numberOfDoors)         
	{
		this.numberOfDoors = numberOfDoors; 
	}
    public void setTransmissionType(String transmissionType)
	{
		this.transmissionType = transmissionType;
	}
    public void setPrice(double price)                     
	{
		this.price = price; 
	}

    public String getModel()            
	{
		return model;
	}
    public int getNumberOfDoors()       
	{
		return numberOfDoors; 
	}
    public String getTransmissionType() 
	{ 
	return transmissionType; 
	}
    public double getPrice()            
	{ 
	return price; 
	}
    
    public void showDetails() 
	{
        super.showDetails(); 
		System.out.println();
        System.out.println("--- Car Details ---");
        System.out.println("Model          : " + model);
        System.out.println("Number of Doors: " + numberOfDoors);
        System.out.println("Transmission   : " + transmissionType);
        System.out.println("Price          : $" + price);
        System.out.println();
    }
}