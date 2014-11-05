import java.util.Scanner;

public class Substrings
{   
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = in.next();
        String newString = "";
        int i = 0;
        int k = 0;
        int j = 0;
        
        
        while (true)
        {
            i++;
            k = i;
            j = 0;
            while (k <= word.length())
            {
                newString = word.substring(j,k);
                k++;
                j++;
                System.out.println(newString);
            }
            if (i > word.length())
            {
                break;
            }
        }
    }
}
