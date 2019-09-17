
import java.util.Scanner;


public class Nerb {
    
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter time in seconds:  ");
        int inputSec = in.nextInt();
        
        int Hr = inputSec/3600;
        int Mn = (inputSec%3600)/60;
        int Sc = inputSec%60;
        
        System.out.println(Hr+"Hr' " +Mn+ "Mn' "+Sc+ "Sc' ");
    }
    
}
