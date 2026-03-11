import java.lang.*;

public class Teacher2 extends Person2
{
    private String department;
    private int yearsOfExperience;

    public Teacher2() 
	{
        super();
        this.department = "General";
        this.yearsOfExperience = 0;
    }

    public Teacher2(String email, String phoneNumber, String department, int yearsOfExperience) 
	{
        super(email, phoneNumber);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getDepartment() 
	{
		return department; 
	}
    public void setDepartment(String department) 
	{
		this.department = department;
	}

    public int getYearsOfExperience() 
	{
		return yearsOfExperience;
	}
    public void setYearsOfExperience(int yearsOfExperience) 
	{
		this.yearsOfExperience = yearsOfExperience; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Department          : " + getDepartment());
        System.out.println("Years of Experience : " + getYearsOfExperience());
    }
}