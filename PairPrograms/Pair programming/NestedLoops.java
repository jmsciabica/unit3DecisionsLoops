public class NestedLoops
{
   public static void main(String[] args)
   {
       /**
       for (int i = 1; i <= 2; i++)
       {
           for (int j = 1; j <= 4; j++)
           {
               System.out.println(i + "" + j);
           }
       }
       */
      
       /**
       int i = 1;
       int j = 1;
       
       while (i <= 2)
       {
           while (j <=4)
           {
               System.out.println(i + "" + j);
               j++;
           }
           i++;
           j = 1;
       }
       */
      
       int i = 1;
       int j = 1;
       
       do
       {
           do
           {
               System.out.println(i + "" + j);
               j++;
           }
           while(j<=4);
           i++;
           j = 1;
       }
       while(i<=2);
   }
}
