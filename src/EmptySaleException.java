public class EmptySaleException extends Exception
{
    public EmptySaleException()
    {
        super("You need to add products to make your purchase");
    }
}
