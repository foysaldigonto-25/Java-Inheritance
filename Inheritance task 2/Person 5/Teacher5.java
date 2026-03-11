import java.lang.*;

public class Teacher5 extends Person5
{
    private String researchArea;
    private int publicationsCount;

    public Teacher5() 
	{
        super();
        this.researchArea = "General";
        this.publicationsCount = 0;
    }

    public Teacher5(String bloodGroup, double height, String researchArea, int publicationsCount) 
	{
        super(bloodGroup, height);
        this.researchArea = researchArea;
        this.publicationsCount = publicationsCount;
    }

    public String getResearchArea() 
	{
		return researchArea; 
	}
    public void setResearchArea(String researchArea) 
	{
		this.researchArea = researchArea;
	}

    public int getPublicationsCount() 
	{
		return publicationsCount;
	}
    public void setPublicationsCount(int publicationsCount) 
	{
		this.publicationsCount = publicationsCount; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Research Area      : " + getResearchArea());
        System.out.println("Publications Count : " + getPublicationsCount());
    }
}