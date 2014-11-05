import java.util.Scanner;
import java.util.Random;

public class SwapLetters
{
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter a word: ");
        String word = in.next();
        for ( int i = 0; i < word.length(); i++)
        {
            int a = rand.nextInt(word.length()-1);
            int j = rand.nextInt(word.length());
            if ( j <= a )
            {
                while ( j<= a )
                {
                    j = rand.nextInt(word.length());
                }
            }
            char b = word.charAt(a);
            char c = word.charAt(j);
            String first = word.substring(0,a);
            String middle = word.substring(a+1,j);
            String last = word.substring(j+1);
            word = (first+c+middle+b+last);
        }
        System.out.println(word);
    }
}
