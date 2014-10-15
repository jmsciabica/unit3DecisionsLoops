
public class StringComparisonIf
{
    public static void main(String [] args)
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if( word1.compareTo("aaa")> 0)
        {
            System.out.println("condition 1 satisfied!");
        }
        
        if ( word1.equals(word2))
        {
            System.out.println("condition 2 satisfied!");
        }
        
        if (word1.compareTo(word2) < 0)
        {
            System.out.println("conditon 3 satisfied!");
        }
        
        String word1Prefix = word1.substring(0,3);
        
        if ( word1Prefix.equals(word2))
        {
            System.out.println("conditon 4 satisfied!");
        }
    }
}
    