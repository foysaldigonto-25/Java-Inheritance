import java.lang.*;

public class Main 
{
    public static void main(String[] args) 
	{
        Student4 s1 = new Student4();
        s1.setNationality("Indian");
        s1.setDateOfBirth("2004-03-15");
        s1.setScholarshipStatus(true);
        s1.setSemester(4);

        Teacher4 t1 = new Teacher4();
        t1.setNationality("American");
        t1.setDateOfBirth("1978-07-22");
        t1.setEmployeeId("EMP-2045");
        t1.setOfficeRoom("Room 302");

        Student4 s2 = new Student4("British", "2003-11-05", false, 6);
        Teacher4 t2 = new Teacher4("Canadian", "1982-04-18", "EMP-3310", "Room 115");

        System.out.println("--- Student 1 info (Using Setters) ---");
        s1.displayInfo();

        System.out.println("\n--- Teacher 1 info (Using Setters) ---");
        t1.displayInfo();

        System.out.println("\n--- Student 2 (Parameterized) ---");
        s2.displayInfo();

        System.out.println("\n--- Teacher 2 (Parameterized) ---");
        t2.displayInfo();
    }
}