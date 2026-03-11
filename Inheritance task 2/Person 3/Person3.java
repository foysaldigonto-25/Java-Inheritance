import java.lang.*;

public class Person3 
{
    private String gender;
    private String address;

    public Person3()  
	{
        this.gender = "Not Specified";
        this.address = "Not Provided";
    }

    public Person3(String gender, String address) 
	{
        this.gender = gender;
        this.address = address;
    }

    public String getGender() 
	{ 
	    return gender; 
	}
    public void setGender(String gender)  
	{ 
	    this.gender = gender; 
	}

    public String getAddress() 
	{
		return address; 
	}
    public void setAddress(String address) 
	{ 
	    this.address = address;
	}

    public void displayInfo() 
	{
        System.out.println("Gender  : " + getGender());
        System.out.println("Address : " + getAddress());
    }
}