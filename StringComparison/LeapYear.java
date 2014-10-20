import java.util.Scanner;

public class LeapYear
{
    public static boolean isLeapYear(int year)
    {
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = s.nextInt();
        if(LeapYear.isLeapYear(year))
        {
           System.out.print("This is a Leap year.");
        } 
        else 
        {
            System.out.print("This is not a Leap year.");
        }
    }
}
    