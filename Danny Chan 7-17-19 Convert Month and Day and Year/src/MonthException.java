public class MonthException extends Exception
{
    public MonthException()
    {
        super("Invalid Month! Input Month should be within 1 and 12");
    }
    public MonthException(String message)
    {
        super(message);
    }
    
}