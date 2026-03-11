import java.lang.*;

public class Person5 
{
    private String bloodGroup;
    private double height;

    public Person5()  
	{
        this.bloodGroup = "Unknown";
        this.height = 0.0;
    }

    public Person5(String bloodGroup, double height) 
	{
        this.bloodGroup = bloodGroup;
        this.height = height;
    }

    public String getBloodGroup() 
	{ 
	    return bloodGroup; 
	}
    public void setBloodGroup(String bloodGroup)  
	{ 
	    this.bloodGroup = bloodGroup; 
	}

    public double getHeight() 
	{
		return height; 
	}
    public void setHeight(double height) 
	{ 
	    this.height = height;
	}

    public void displayInfo() 
	{
        System.out.println("Blood Group : " + getBloodGroup());
        System.out.println("Height      : " + getHeight() + " cm");
    }
}