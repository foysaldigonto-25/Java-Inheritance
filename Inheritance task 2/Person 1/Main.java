import java.lang.*;

public class Main 
{
    public static void main(String[] args) 
	{
        Student1 s1 = new Student1();
        s1.setName("Alice");
        s1.setAge(20);
        s1.setRollNumber(101);
        s1.setGrade("A");

        Teacher1 t1 = new Teacher1();
        t1.setName("Mr. Smith");
        t1.setAge(45);
        t1.setSubject("Mathematics");
        t1.setSalary(55000.00);

        Student1 s2 = new Student1("Bob", 21, 102, "B+");
        Teacher1 t2 = new Teacher1("Ms.Jane", 38, "Science", 62000.00);

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