import java.lang.*;

public class Main 
{
    public static void main(String[] args) 
	{
        Student5 s1 = new Student5();
        s1.setBloodGroup("O+");
        s1.setHeight(165.5);
        s1.setLibraryCardNumber("LIB-4521");
        s1.setTotalMarks(450);

        Teacher5 t1 = new Teacher5();
        t1.setBloodGroup("A-");
        t1.setHeight(178.0);
        t1.setResearchArea("Artificial Intelligence");
        t1.setPublicationsCount(27);

        Student5 s2 = new Student5("B+", 170.2, "LIB-7890", 390);
        Teacher5 t2 = new Teacher5("AB+", 182.3, "Quantum Computing", 15);

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