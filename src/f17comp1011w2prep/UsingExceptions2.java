package f17comp1011w2prep;

/**
 *
 * @author JWright
 */
public class UsingExceptions2 {

    public static void main(String[] args)
    {
        try{
            method1();
        }
        catch (Exception exception)
        {
            System.err.printf("%s%n%n", exception.getMessage());
            exception.printStackTrace();
            
            //Obtain the stack trace elements
            StackTraceElement[] traceElements = exception.getStackTrace();
            
            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.printf("%20s %20s %10s %10s%n", "Class", "File", "Line", "Method");
            
            //loop through the trace elements
            for (StackTraceElement element : traceElements)
            {
                System.out.printf("%20s ", element.getClassName());
                System.out.printf("%20s ", element.getFileName());
                System.out.printf("%10d ", element.getLineNumber());
                System.out.printf("%20s %n", element.getMethodName());               
            }
        }
    }   //end of the main method
    
    public static void method1() throws Exception
    {
        method2();
    }
    
    
    public static void method2() throws Exception
    {
        method3();
    }

    
    public static void method3() throws Exception
    {
        throw new Exception("Exception thrown in method3");
    }

}
