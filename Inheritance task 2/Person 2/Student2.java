import java.lang.*;

public class Student2 extends Person2 
{
    private String courseName;
    private double gpa;

    public Student2() 
	{
        super();
        this.courseName = "Undeclared";
        this.gpa = 0.0;
    }

    public Student2(String email, String phoneNumber, String courseName, double gpa) 
	{
        super(email, phoneNumber);
        this.courseName = courseName;
        this.gpa = gpa;
    }

    public String getCourseName() 
	{
		return courseName;
	}
    public void setCourseName(String courseName) 
	{
		this.courseName = courseName; 
	}

    public double getGpa() 
	{
		return gpa; 
	}
    public void setGpa(double gpa) 
	{
		this.gpa = gpa; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Course Name : " + getCourseName());
        System.out.println("GPA         : " + getGpa());
    }
}