
import java.util.*;

class Demo
{
    public void Division() throws ArithmeticException
{
       Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int iNo1 = sobj.nextInt();

        System.out.println("Enter Second number: ");
        int iNo2 = sobj.nextInt();

        int iAns =0;

        System.out.println("Inside try block");  
          iAns = iNo1/iNo2;
       
    }
}
class ExceptionDemo3
{

    public static void main(String Arg[])
    {
        
       Demo dobj = new Demo();
       dobj.Division();

    }
}