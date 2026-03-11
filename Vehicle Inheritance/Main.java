import java.lang.*;

public class Main 
    {
		
    public static void main(String[] args) 
	
	{

        Car car1 = new Car("Toyota", "Red", 2022, 2.5,
                           "Camry", 4, "Automatic", 28000.00);

        Car car2 = new Car();
        car2.setBrand("Honda");
        car2.setColor("Blue");
        car2.setYear(2021);
        car2.setEngineCapacity(1.8);
        car2.setModel("Civic");
        car2.setNumberOfDoors(4);
        car2.setTransmissionType("Manual");
        car2.setPrice(22000.00);

        car1.showDetails();
        car2.showDetails();
    }
}