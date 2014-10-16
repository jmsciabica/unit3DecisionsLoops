import java.util.Scanner;

public class CircleOverlap
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("Input the radius of the first circle: ");
      double radius1 = in.nextDouble(); 
      double xcenter1 = 0;
      double ycenter1 = 0;
      System.out.print("Input the radius of the second circle: ");
      double radius2 = in.nextDouble(); 
      double xcenter2 = 40;
      double ycenter2 = 0;
      
      double xLeft1 = xcenter1 - radius1;
      double xRight1 = xcenter1 + radius1;
      double yTop1 = ycenter1 - radius1;
      double yBottom1 = ycenter1 + radius1;
      
      double xLeft2 = xcenter2 - radius2;
      double xRight2 = xcenter2 + radius2;
      double yTop2 = ycenter2 - radius2;
      double yBottom2 = ycenter2 + radius2;

      if (!(xLeft2 < xRight1))
      {
          System.out.println("Disjoint");
      }
      
      else if ((xLeft2 < xLeft1)||(xRight1 > xRight2))
      {
          System.out.println("Mutually Contained");
      }
      
      else{System.out.println("Overlapping");}
      
      
      
   }
}