//Name: Danny Chan
//Assignment: Exercise 5.3
//Created: 7-12-19
// This assignment labels the owner of a car or truck and shows 
//  how much it can carry and how heavy it is and who it belongs to. 
public class carownersmain 
{
	public static void main(String[] args) 
	{
		Person owner1 = new Person("Micheal Phelps");
		Person owner2 = new Person("Missy Franklin");
		Vehicle Car = new Vehicle("Ferrari", 4, owner1);
		Truck Truck = new Truck();       
		Truck.setmanufacturer("Lamborghini");
		Truck.setCylinders(4);
		Truck.setownerName(owner2);
		Truck.setloadCapacity(150);
		Truck.settowCapacity(2000);	    
	    System.out.println("Details of Vehicle 1: ");        		    
		System.out.println(Car);
		System.out.println();
		// truck prints additional details
	  	System.out.println("Details of Vehicle 2: ");
		System.out.println(Truck);
	}   		    
}