//Danny Chan
// Assignment: Assignment 2
// Created: 7-1-19
public class OdometerTest
{ 
    private double milesDriven;
    public double mpg;
public OdometerTest(double milesDriven,double mpg)
{
    this.milesDriven = milesDriven;
    this.mpg = mpg;
}
public void setOdometer()
{
    this.milesDriven = 0;     
}
public void setMPG(double mpg)
{
    this.mpg = mpg;
}

public void setMiles(double odometer)
{
    milesDriven += odometer;
}

public double getGasoline()
{
    double gasoline = milesDriven/mpg;
    return gasoline;

}
}

