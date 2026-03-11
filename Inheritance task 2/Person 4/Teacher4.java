import java.lang.*;

public class Teacher4 extends Person4
{
    private String employeeId;
    private String officeRoom;

    public Teacher4() 
	{
        super();
        this.employeeId = "EMP-0000";
        this.officeRoom = "Not Assigned";
    }

    public Teacher4(String nationality, String dateOfBirth, String employeeId, String officeRoom) 
	{
        super(nationality, dateOfBirth);
        this.employeeId = employeeId;
        this.officeRoom = officeRoom;
    }

    public String getEmployeeId() 
	{
		return employeeId; 
	}
    public void setEmployeeId(String employeeId) 
	{
		this.employeeId = employeeId;
	}

    public String getOfficeRoom() 
	{
		return officeRoom;
	}
    public void setOfficeRoom(String officeRoom) 
	{
		this.officeRoom = officeRoom; 
	}

    public void displayInfo() 
	{
        super.displayInfo();
        System.out.println("Employee ID : " + getEmployeeId());
        System.out.println("Office Room : " + getOfficeRoom());
    }
}