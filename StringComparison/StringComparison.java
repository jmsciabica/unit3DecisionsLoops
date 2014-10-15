
public class StringComparison
{
    public static void main(String [] args)
    { 
        String word1 = "catalog";
        String word2 = "cat";
        int result = word1.compareTo("aaa");
        System.out.println("Result 1: "+ result);
        
        boolean result2 = word1.equals(word2);
        System.out.println("Result 2: "+ result2);
        
        String substring = word1.substring(0,3);
        int result3 = word1.compareTo(word2);
        System.out.println("Result 3: "+ result3);
        
        boolean result4 = substring.equals(word2);
        System.out.println("Result 4: "+  result4);
        
        
    }
}