import java.lang.*;

public class Student5 extends Person5 
{
    private String libraryCardNumber;
    private int totalMarks;

    public Student5() 
	{
        super();
        this.libraryCardNumber = "LIB-0000";
        this.totalMarks = 0;
    }

    public Student5(String bloodGroup, double height, String libraryCardNumber, int totalMarks) 
	{
        super(bloodGroup, height);
        this.libraryCardNumber = libraryCardNumber;
        this.totalMarks = totalMarks;
    }

    public String getLibraryCardNumber() 
	{
		return libraryCardNumber;
	}
    public void setLibraryCardNumber(String libraryCardNumber) 
	{
		this.libraryCardNumber = libraryCardNumber; 
	}

    public int getTotalMarks() 
	{
		return totalMarks; 
	}
    public void setTotalMarks(int totalMarks) 
	{
		this.totalMarks = totalMarks; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Library Card No : " + getLibraryCardNumber());
        System.out.println("Total Marks     : " + getTotalMarks());
    }
}