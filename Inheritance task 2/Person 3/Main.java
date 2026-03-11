import java.lang.*;

public class Main 
{
    public static void main(String[] args) 
	{
        Student3 s1 = new Student3();
        s1.setGender("Female");
        s1.setAddress("123 Elm Street");
        s1.setAdmissionYear(2022);
        s1.setHostelName("Sunrise Hostel");

        Teacher3 t1 = new Teacher3();
        t1.setGender("Male");
        t1.setAddress("456 Oak Avenue");
        t1.setQualification("PhD in Physics");
        t1.setDesignation("Associate Professor");

        Student3 s2 = new Student3("Male", "78 Pine Road", 2023, "Blue Hostel");
        Teacher3 t2 = new Teacher3("Female", "90 Cedar Lane", "M.Sc Chemistry", "Senior Lecturer");

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
