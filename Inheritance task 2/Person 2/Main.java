import java.lang.*;

public class Main 
{
    public static void main(String[] args) 
	{
        Student2 s1 = new Student2();
        s1.setEmail("alice@school.com");
        s1.setPhoneNumber("9876543210");
        s1.setCourseName("Computer Science");
        s1.setGpa(3.8);

        Teacher2 t1 = new Teacher2();
        t1.setEmail("smith@school.com");
        t1.setPhoneNumber("9123456780");
        t1.setDepartment("Science");
        t1.setYearsOfExperience(12);

        Student2 s2 = new Student2("bob@school.com", "9001122334", "Mechanical Engineering", 3.5);
        Teacher2 t2 = new Teacher2("jones@school.com", "9887766554", "Arts", 8);

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