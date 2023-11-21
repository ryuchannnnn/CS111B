//Name: Danny Chan
//Assignment: Assignment 2 
//Created: 7-1-19
// This calculates the temperatures and determines whether it is greater or less than. 
import java.util.Scanner;
public class temperatureMain 
{

	public static void main(String[] args)
	{
			tempfiles temp1 = new tempfiles();
			tempfiles temp2 = new tempfiles(50);
			tempfiles temp3 = new tempfiles('C');
			tempfiles temp4 = new tempfiles(32, 'F');
			System.out.println(temp4.getTemperatureCelsius());
			System.out.println(temp2.getTemperatureFahrenheit());
			System.out.println(temp2.getTemperatureCelsius());
			System.out.println(temp4.getTemperatureFahrenheit());
			temp3.setScale('F');
			System.out.println(temp3.toString());
			temp3.setTempandScale(0, 'C');
			System.out.println(temp3);
			System.out.println(temp3.isEqual(32));
			System.out.println(temp3.isEqual(33));
			temp1.setTempandScale(-40, 'C');
			System.out.println(temp1.isEqual(-40));
			System.out.println(temp1.isGreater(-39,'F'));
			System.out.println(temp1.isLess(-41,'F'));
			temp2.setTemp(100);
			System.out.println(temp2.isEqual(212));
			System.out.println(temp2.isGreater(211,'F'));
			System.out.println(temp2.isLess(210,'F'));

	}
}