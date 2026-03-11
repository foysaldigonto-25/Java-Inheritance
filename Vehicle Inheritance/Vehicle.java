import java.lang.*;

public class Vehicle {

    private String brand;
    private String color;
    private int year;
    private double engineCapacity;

    public Vehicle() 
	{
        this.brand = "Unknown";
        this.color = "Unknown";
        this.year = 0;
        this.engineCapacity = 0.0;
    }

    public Vehicle(String brand, String color, int year, double engineCapacity) 
	{
        this.brand = brand;
        this.color = color;
        this.year = year;
        this.engineCapacity = engineCapacity;
    }
	
	public void setBrand(String brand)                
	{
		this.brand = brand; 
	}
    public void setColor(String color)               
	{
		this.color = color; 
	}
    public void setYear(int year)                    
	{
		this.year = year; 
	}
    public void setEngineCapacity(double engineCapacity) 
	{
		this.engineCapacity = engineCapacity; 
	}
    public String getBrand()          
	{
		return brand;
	}
    public String getColor()          
	{
		return color; 
	}
    public int getYear()              
	{
		return year;
	}
    public double getEngineCapacity() 
	{
		return engineCapacity; 
	}

    public void showDetails() 
	{
		System.out.println();
        System.out.println("--- Vehicle Details ---");
        System.out.println("Brand          : " + brand);
        System.out.println("Color          : " + color);
        System.out.println("Year           : " + year);
        System.out.println("Engine Capacity: " + engineCapacity + "L");
    }
}