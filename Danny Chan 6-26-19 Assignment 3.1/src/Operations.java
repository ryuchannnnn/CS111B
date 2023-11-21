// Name: Danny Chan
// Assignment: 3-1
// Created: 6-26-19
public class Operations 
{
    // instance variables in Operations
    private int num, result;
    
    // default constructor for Operations
    public Operations()
    {
        num = result = 0;
    }
    
    // method: determine if number is composite
    public int composite(int num)
    {
        int count = 0; // count number of factors in input 
        
        int i = 2;
        while (i <= 9)
        {
            if ((num % i) == 0)
                count++;
            i++;
        }
        
        // determine if composite or prime (prime=1, composite=0)
        if (count >= 2)
            result = 1;
        else
            result = 0;
        
        return result;
    }
    
    // method: find the number of digits in the number the user inputted
    public int count(int num)
    {
        result = (int)(Math.log10(num) + 1);
        return result;
    }
    
    // method: raise input of a number to a power
    public int power(int num, int power)
    {
        result = (int)(Math.pow(num, power));
        return result;
    }
    
}