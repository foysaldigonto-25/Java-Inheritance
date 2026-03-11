import java.lang.*;

public class Student3 extends Person3 
{
    private int admissionYear;
    private String hostelName;

    public Student3() 
	{
        super();
        this.admissionYear = 0;
        this.hostelName = "Day Scholar";
    }

    public Student3(String gender, String address, int admissionYear, String hostelName) 
	{
        super(gender, address);
        this.admissionYear = admissionYear;
        this.hostelName = hostelName;
    }

    public int getAdmissionYear() 
	{
		return admissionYear;
	}
    public void setAdmissionYear(int admissionYear) 
	{
		this.admissionYear = admissionYear; 
	}

    public String getHostelName() 
	{
		return hostelName; 
	}
    public void setHostelName(String hostelName) 
	{
		this.hostelName = hostelName; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Admission Year : " + getAdmissionYear());
        System.out.println("Hostel Name    : " + getHostelName());
    }
}