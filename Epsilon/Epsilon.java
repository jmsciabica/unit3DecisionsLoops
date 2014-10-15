import java.util.Scanner;

public class Epsilon
{
    public static void main( String [] args)
    {
       final double EPSILON = 1e-14;
       Scanner in = new Scanner(System.in);
       
       System.out.print("Enter a floating- point number: ");
       double value = in.nextDouble();
       
       String magnitude = "";
       if (Math.abs(value) < 1.0)
       { main(_args_)
           magnitude = "small"; 
       }
       else if (Math.abs(value) > 1000000.0)
       {
           magnitude = "big"; 
       }
       
       if (Math.abs(value - 0)< EPSILON)
       {
           System.out.println("Valuie is zero.");
       }
       else if(value > 0)
       {
           System.out.println("Value is a " + magnitude + " postitive number.");
       }
       else
       {
          System.out.println("Value is a " + magnitude + " negative number.");
       }
       }
}

