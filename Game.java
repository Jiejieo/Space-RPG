import java.lang.reflect.Array;
import java.util.Scanner;
import java.lang.Math;
/**
 * This program simulates the SPACE RPG game. 
 *
 * @author Andrea Lan
 * @version 5-30-2023
 */
public class Game
{
    public static void main(String[] args)
    {
        int lightYearsLeft = 1500;
        int selection = 0;
        String currentLocation = "UNKNOWN LOCATION";
        String locationDescription = "Vast emptiness and darkness" + 
                                     "\nNothing but a few stars blink lightyears away";
        //Scanner 
        //create the player object
        //System.out
        Player traveler = new Player();
        
  
        //story (part 1)
        System.out.println("-SPACE RPG-");
        System.out.println("In a galaxy, far, far away... a lone space traveler");
        System.out.println("wanders through time, on an adventure to traverse into");
        System.out.println("the unknown. It is your mission to archive and record");
        System.out.println("data to bring back to Earth. You plan your pathway and ");
        System.out.println("calculate this journey will be 1500 lightyears long.");
        
        while(lightYearsLeft > 0 && (int)Array.get(traveler.getAttributes(), 0) > 0) 
        {
            System.out.println("\n-CURRENT LOCATION: " + currentLocation + "-");
            System.out.println("DESCRIPTION: " + locationDescription);
            System.out.println("LIGHT YEARS LEFT: " + lightYearsLeft);
            System.out.println("0 : MOVE FORWARD");
            System.out.println("1 : CHECK STATUS");
            System.out.println("2 : CHECK INVENTORY");
            selection = userInput(0,2);
            if(selection == 0)
            {
                //can travel between 20-50 light years per turn
                lightYearsLeft -= (int)(Math.random()*31 + 20);
                
                //check for special events
            }
            else if(selection == 1)
            {
                System.out.println(traveler);
            }
            else
            {
                System.out.println("pass2");
            }
        }
    }
  
    //input validation, checks that int is within specified boundary
    public static int userInput(int min, int max)
    {
        boolean valid = false;
        Scanner check = new Scanner(System.in);
        int input = 0;
        while(!valid)
        {
            System.out.println("\nSelect a number between " + min + "-" + max + ": ");
            input = check.nextInt();
            if(input <= max && input >= min)
              valid = true;
            else
              System.out.println("Invalid number.");
        }
        return input;
    }
}