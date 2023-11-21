public class YearException extends Exception 
{
    public YearException()
    {
        super("Invalid Year! Input Year should be within 1000 and 3000!");
    }
    public YearException(String message)
    {
        super(message);
    }
}