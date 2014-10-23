import java.util.Scanner;

public class Spectrum
{
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a wavelength: ");
        final double RADIO_WAVE = 1E-1;
        final double MICROWAVE = 1E-3;
        final double INFARED = 7E-7;
        final double VISIBLE_LIGHT = 4E-7;
        final double ULTRAVIOLET = 1E-8;
        final double XRAYS = 1E-11;
        final double GAMMA_RAYS = 1E-11;
        double wave = s.nextDouble();
        String going = "y";
        
        if  ((wave >= RADIO_WAVE ) && ( wave >= MICROWAVE))
        {
            System.out.println("Type: Radio Wave");
        }
        else if ((wave < RADIO_WAVE) && (wave >= MICROWAVE))
        {
            System.out.println("Type: Microwaves");
        }
        else if ((wave < MICROWAVE) && (wave >= INFARED))
        {
            System.out.println("Type: Infared Rays");
        }
        else if ((wave < INFARED) && (wave >= VISIBLE_LIGHT))
        {
            System.out.println("Type: Visible Light");
        }
        else if ((wave < VISIBLE_LIGHT) && (wave >= ULTRAVIOLET))
        {
            System.out.println("Type: Utraviolet");
        }
        else if ((wave < ULTRAVIOLET) && (wave >= XRAYS))
        {
            System.out.println("Type: X-rays");
        }
        else if ((wave < XRAYS))
        {
            System.out.println("Type: Gamma Rays");
        }
   }
}
