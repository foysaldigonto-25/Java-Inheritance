import java.lang.*;

public class Student4 extends Person4 
{
    private boolean scholarshipStatus;
    private int semester;

    public Student4() 
	{
        super();
        this.scholarshipStatus = false;
        this.semester = 1;
    }

    public Student4(String nationality, String dateOfBirth, boolean scholarshipStatus, int semester) 
	{
        super(nationality, dateOfBirth);
        this.scholarshipStatus = scholarshipStatus;
        this.semester = semester;
    }

    public boolean getScholarshipStatus() 
	{
		return scholarshipStatus;
	}
    public void setScholarshipStatus(boolean scholarshipStatus) 
	{
		this.scholarshipStatus = scholarshipStatus; 
	}

    public int getSemester() 
	{
		return semester; 
	}
    public void setSemester(int semester) 
	{
		this.semester = semester; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Scholarship : " + (getScholarshipStatus() ? "Yes" : "No"));
        System.out.println("Semester    : " + getSemester());
    }
}