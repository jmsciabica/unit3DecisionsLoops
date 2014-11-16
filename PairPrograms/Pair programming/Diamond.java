import java.util.Scanner;

public class Diamond
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the length of the diamond: ");
        int len = s.nextInt();
        
        int i = 1;
        int k = 1;
        int q = 0;
        int spaces = ((len*2)-1)/2;
        String space = "";
        int numSpaces = 0;
        while(true)
        {
            space = "";
            numSpaces = 0;
            if (q <= spaces)
            {
                numSpaces = (spaces - q) + 1;
            }
            for (int l = 0; l < numSpaces; l++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }      
            if (i<(len+spaces) && k<(len+spaces))
            {
                i += 2;
                k += 2;
                q++;
            }
            
            else if (k>=len && i>0)
            {
                i -= 2;
                q--;
            }
            
            else if (i<0)
            {break;}
            System.out.println("");
        }
    }
}
