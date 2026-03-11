import java.lang.*;

public class Teacher3 extends Person3
{
    private String qualification;
    private String designation;

    public Teacher3() 
	{
        super();
        this.qualification = "Not Specified";
        this.designation = "Lecturer";
    }

    public Teacher3(String gender, String address, String qualification, String designation) 
	{
        super(gender, address);
        this.qualification = qualification;
        this.designation = designation;
    }

    public String getQualification() 
	{
		return qualification; 
	}
    public void setQualification(String qualification) 
	{
		this.qualification = qualification;
	}

    public String getDesignation() 
	{
		return designation;
	}
    public void setDesignation(String designation) 
	{
		this.designation = designation; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Qualification : " + getQualification());
        System.out.println("Designation   : " + getDesignation());
    }
}
