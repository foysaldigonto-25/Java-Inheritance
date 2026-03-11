import java.lang.*;

public class Person1 {

    private String name;
    private int age;

    public Person1()  
	{
        this.name = "Unknown";
        this.age = 0;
    }

    public Person1(String name, int age) 
	{
        this.name = name;
        this.age = age;
    }

    public String getName() 
	{ 
	    return name; 
	}
	
    public void setName(String name)  
	{ 
	    this.name = name; 
	}

    public int getAge() 
	{
		return age; 
	}
    public void setAge(int age) 
	{ 
	    this.age = age;
	}

    public void displayInfo() 
	{
        System.out.println("Name : " + getName());
        System.out.println("Age  : " + getAge());
    }
}