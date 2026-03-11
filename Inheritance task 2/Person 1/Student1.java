import java.lang.*;

public class Student1 extends Person1 
{
    private int rollNumber;
    private String grade;

    public Student1() 
	{
        super();
        this.rollNumber = 0;
        this.grade = "N/A";
    }

    public Student1(String name, int age, int rollNumber, String grade) 
	{
        super(name, age);
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    public int getRollNumber() 
	{
		return rollNumber;
	}
    public void setRollNumber(int rollNumber) 
	{
		this.rollNumber = rollNumber; 
	}

    public String getGrade() 
	{
		return grade; 
	}
    public void setGrade(String grade) 
	{
		this.grade = grade; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Roll Number : " + getRollNumber());
        System.out.println("Grade       : " + getGrade());
    }
}