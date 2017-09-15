package f17comp1011w2prep;

/**
 * figure 11.5 from the text
 * @author JWright
 */
public class UsingExceptions {
    public static void main(String[] args)
    {
        try
        {
            throwException();            
        }
        catch(Exception exception)
        {
            System.err.println("Exception handled in main");
        }
        doesNotThrowException();
    }
    
    /**
     * Demostrates try...catch....finally
     */
    public static void throwException() throws Exception
    {
        try
        {
            System.out.println("Method throwsException");
            throw new Exception();
        }
        catch(Exception exception)
        {
            System.err.println("Exception handled in method throwException");
            throw exception;
        }
        finally
        {
            System.err.println("Finally executed in throwException");
        }
    }
    
    public static void doesNotThrowException()
    {
        try
        {
            System.out.println("Method does not throw exception");
        }
        catch (Exception exception)
        {
            System.err.println(exception);
        }
        finally
        {
            System.err.println("Finally executed in doesNotThrowException");
        }
        System.out.println("End of method doesNotThrowException");
    }
}
