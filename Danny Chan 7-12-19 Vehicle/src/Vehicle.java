public class Vehicle
{
  private String manufacturer;
  private int cylinders;
  private Person ownerName;

public Vehicle()
{
  manufacturer = " ";
  cylinders = 0;
  ownerName = null;
}
public Vehicle(String manufacturer,int cylinders,Person ownerName)
{
  this.manufacturer = manufacturer;
  this.cylinders = cylinders;
  this.ownerName = ownerName;
}
public Vehicle(Vehicle other)
{
  this.manufacturer = other.manufacturer;
  this.cylinders = other.cylinders;
  this.ownerName = other.ownerName;
}
public void setmanufacturer(String manufacturer)
{
  this.manufacturer = manufacturer;
}
public void setCylinders(int cylinders)
{
  this.cylinders = cylinders;
}
public void setownerName(Person ownerName)
{
  this.ownerName = new Person(ownerName);
}
public String getmanufacturer()
{
  return manufacturer;
}
public int getCylinders()
{
  return cylinders;
}
public Person getownerName()
{
  return ownerName;
}
public String toString()
{
  return "Manufacturer's name: " + manufacturer + "\nNumber of cylinders in the engine: " + cylinders + "\nOwner is " + ownerName;
}
public boolean equals(Vehicle other)
{
  return manufacturer.equals(other.manufacturer) && cylinders == other.cylinders;
}
}