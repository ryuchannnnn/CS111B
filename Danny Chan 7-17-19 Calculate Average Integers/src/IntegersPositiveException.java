public class IntegersPositiveException extends Exception
{
    private int N;
    
public IntegersPositiveException(int N)
{
    super("N must be postive.");
    this.N=N;
}
public IntegersPositiveException()
{
    super("IntegersPositiveException");
}
public IntegersPositiveException(String message)
{
    super(message);
}
public int getNumber()
{
    return N;
}
}