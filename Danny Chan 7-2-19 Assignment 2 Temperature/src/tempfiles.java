public class tempfiles
{
  private float temp;
  private char scale;
public tempfiles(float temp,char scale)
{
  this.temp = temp;
  this.scale = scale; 
}
public tempfiles()
{
   temp = 0;
   scale = 'C';
} 
public tempfiles(float temp)
{
  this.temp = temp;
  scale = 'C';
}
public tempfiles(char scale)
{
  this.scale = scale;
  temp = 0;
}
public double getTemperatureCelsius()
{
  if (scale == 'F')
  return ((temp - 32)*(5.0/9.0));
  return temp;
}
public double getTemperatureFahrenheit()
{
  if (scale == 'C')
  return ((9.0*temp/5.0)+32);
  return temp;
}
public char getScale()
{
  return scale;
}
public void setTemp(float temp)
{
  this.temp = temp;
}
public void setScale(char scale)
{
  this.scale =scale;
}
public void setTempandScale(float temp,char scale)
{
  this.temp = temp;
  this.scale = scale;
}
public boolean isEqual(double t)
{
  return getTemperatureCelsius() == t || getTemperatureFahrenheit() == t;
}
public boolean isGreater(double t,char s)
{
  
  return (s == 'F')&&getTemperatureFahrenheit()>t;
}
public boolean isLess(double t,char s)
{
  return (s == 'F')&& getTemperatureFahrenheit() < t;
}
public String toString()
{
  String s = ""+scale;
  return Double.toString(getTemperatureCelsius()) + s;
}

}

  

