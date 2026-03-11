import java.lang.*;

public class Person2 
{
    private String email;
    private String phoneNumber;

    public Person2()  
	{
        this.email = "not_set@email.com";
        this.phoneNumber = "0000000000";
    }

    public Person2(String email, String phoneNumber) 
	{
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() 
	{ 
	    return email; 
	}
    public void setEmail(String email)  
	{ 
	    this.email = email; 
	}

    public String getPhoneNumber() 
	{
		return phoneNumber; 
	}
    public void setPhoneNumber(String phoneNumber) 
	{ 
	    this.phoneNumber = phoneNumber;
	}

    public void displayInfo() 
	{
        System.out.println("Email        : " + getEmail());
        System.out.println("Phone Number : " + getPhoneNumber());
    }
}