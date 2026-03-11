import java.lang.*;

public class Person4 
{
    private String nationality;
    private String dateOfBirth;

    public Person4()  
	{
        this.nationality = "Unknown";
        this.dateOfBirth = "00-00-0000";
    }

    public Person4(String nationality, String dateOfBirth) 
	{
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
    }

    public String getNationality() 
	{ 
	    return nationality; 
	}
    public void setNationality(String nationality)  
	{ 
	    this.nationality = nationality; 
	}

    public String getDateOfBirth() 
	{
		return dateOfBirth; 
	}
    public void setDateOfBirth(String dateOfBirth) 
	{ 
	    this.dateOfBirth = dateOfBirth;
	}

    public void displayInfo() 
	{
        System.out.println("Nationality   : " + getNationality());
        System.out.println("Date of Birth : " + getDateOfBirth());
    }
}