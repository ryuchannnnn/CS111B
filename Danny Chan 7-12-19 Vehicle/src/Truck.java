public class Truck extends Vehicle
{
  private double loadCapacity;
  private int towCapacity;

public Truck()
{
  super();
  loadCapacity = 0;
  towCapacity = 0;
}
public Truck(String manu,int cylinders, Person owner,double loadCapacity, int towCapacity)
{
  super(manu,cylinders,owner);
  this.loadCapacity = loadCapacity;
  this.towCapacity = towCapacity;
}
public Truck(Truck other)
{
  super(other);
  this.loadCapacity = other.loadCapacity;
  this.towCapacity = other.towCapacity;
}
public void setloadCapacity(double loadCapacity)
{
  this.loadCapacity = loadCapacity;
}
public void settowCapacity(int towCapacity)
{
  this.towCapacity = towCapacity;
}
public double getloadCapacity()
{
  return loadCapacity;
}
public int gettowCapacity()
{
  return towCapacity;
}
public String toString()
{
  return super.toString() + "\nLoad Capactity: " + loadCapacity + "\nTow Capacity: " + towCapacity + " lbs ";
}
public boolean equals(Truck other)
{
  return super.equals(other)&& loadCapacity==other.loadCapacity && towCapacity==other.towCapacity;
}
}
