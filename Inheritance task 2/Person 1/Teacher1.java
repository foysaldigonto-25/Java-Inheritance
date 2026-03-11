import java.lang.*;

public class Teacher1 extends Person1
{
    private String subject;
    private double salary;

    public Teacher1() 
	{
        super();
        this.subject = "Unknown";
        this.salary = 0.0;
    }

    public Teacher1(String name, int age, String subject, double salary) 
	{
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() 
	{
		return subject; 
	}
    public void setSubject(String subject) 
	{
		this.subject = subject;
	}

    public double getSalary() 
	{
		return salary;
	}
    public void setSalary(double salary) 
	{
		this.salary = salary; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Subject : " + getSubject());
        System.out.println("Salary  : " + getSalary());
    }
}