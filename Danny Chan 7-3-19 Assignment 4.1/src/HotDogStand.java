 /* name: Brandon Tran, Danny Chan, Mary Lynn Tom
 * date: 2019-07-03
 * assignment: In-Class Exercise 4.1
 * 
 * description: HotDogStand Tester class
 */
public class HotDogStand
 {
    // instance variables
    private int id;
    private int soldhotdogs;
    public static int totalsoldhotdogs = 0;
 
 // constructors
    public HotDogStand()
  {
    id = 0;
    soldhotdogs = 0;
  }
 
  public HotDogStand(int id, int soldhotdogs)
  {
    this.id = id;
    this.soldhotdogs = soldhotdogs;
    totalsoldhotdogs += soldhotdogs;
  }

  // set ID
  public void setID(int id)
  {
    this.id = id;
  }

  //accessor
  public int getID()
  {
    return id;
  }

  // JustSold method
  public void JustSold()
  {
    soldhotdogs += 1;
    totalsoldhotdogs += 1;
  }

  //accessor
  public int getJustSold()
  {
    return soldhotdogs;
  }

  // return results of total hot dogs
  public static int getTotalSoldHotDogs()
  {
    return totalsoldhotdogs;
  }
}