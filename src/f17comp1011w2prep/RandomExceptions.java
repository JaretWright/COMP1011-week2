package f17comp1011w2prep;

import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Formatter;

/**
 *
 * @author JWright
 */
public class RandomExceptions {
    public static void main(String[] args) throws FileNotFoundException
    {
        SecureRandom random = new SecureRandom();
        Formatter errorLog = new Formatter("exceptions.txt");
        for (int i=1; i<100000; i++)
        {
            try
            {
                generateException(random.nextInt(8));
            }
            catch (Exception e)
            {
                errorLog.format("Time: %s, Exeption: %s%n", LocalDateTime.now(), e.getMessage());
            }
        }
        errorLog.close();
    }
    
    public static void generateException(int exceptionNum) throws Exception
    {
        
        if (exceptionNum == 0)
        {
            throw new Exception("Wrong password");
        }
        else if (exceptionNum == 1)
        {
            throw new Exception("Long API response");
        }
        else if (exceptionNum == 2)
        {
            throw new Exception("Invalid input");
        }   
        else if (exceptionNum > 2)
        {
            throw new Exception("Programming on a sunny day is tough");
        }
    }
}
