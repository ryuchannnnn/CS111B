public class HotDogStandDemo
{
	  public static void main(String[] args) 
	  {
	    // create class instances
	    HotDogStand Brandon= new HotDogStand(4586,234);
	    HotDogStand Dolphin = new HotDogStand(1320,0);
	    HotDogStand Marys = new HotDogStand(1234,567);
	    
	    // JustSold method calls
	    Brandon.JustSold();
	    Dolphin.JustSold();
	    Marys.JustSold();
	    
	    // return results
	    System.out.println("Brandon " + Brandon.toString());
	    System.out.println("Dolphin " + Dolphin.toString());
	    System.out.println("Marys " + Marys.toString());
	    System.out.println("\nTotal number of hot dogs sold: " + HotDogStand.getTotalSoldHotDogs());
	  }
	}