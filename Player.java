import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class creates the Player object and info on player status.
 */
public class Player
{
    private String name;
    private int age;
    private int lvl;
    private int xp; 
    private int hpCap;
    private String description;
    private int[] attributes;
    private ArrayList<String> moves;
    
    //default constructor
    public Player()
    {
        name = "SPACE TRAVELER";
        age = 999;
        lvl = 1;
        xp = 0;
        hpCap = 20;
        description = "A mysterious traveler wandering through space.";
        attributes = new int[] {20,5,5,5,5}; //hp, mp, strength, speed, defense
        moves = new ArrayList<String>(Arrays.asList("KICK", "FLEE"));
    }
    
    //overloaded constructor
    public Player(String n, int a)
    {
        name = n;
        age = a;
        lvl = 1;
        xp = 0;
        hpCap = 20;
        description = "A mysterious traveler wandering through space.";
        attributes = new int[] {20,5,5,5,5}; //hp, mp, strength, speed, defense
        moves = new ArrayList<String>(Arrays.asList("KICK", "FLEE"));
    }
    
    
    //returns player information 
    public String toString()
    {
        return "\n-PLAYER INFORMATION-\nNAME: " + name + "\nAGE: " + age + "\nLVL: " + lvl + 
            "\nXP: " + xp + "\nHP: " + attributes[0] + "\nMP: " + attributes[1] + "\nSTRENGTH: "
                + attributes[2] + "\nSPEED: " + attributes[3] + "\nDEFENSE: " + 
                    attributes[4] + "\nMOVES: " + moves + 
                        "\nDESCRIPTION: " + description;
    }
    
    //getter - returns attributes
    public int[] getAttributes()
    {
        return attributes;
    }
    
    //checks and updates player level and attributes based on xp
    public void checkLevel()
    {
        //level upgrades every 100 xp
        if(xp >= 100)
        {
            lvl += 1;
            xp = 0;
            hpCap += 10;
            attributes[0] = hpCap;
            attributes[1] += 5;
            attributes[2] += 5;
            attributes[3] += 5;
            attributes[4] += 5;
            System.out.println("\n[PLAYER HAS UPGRADED TO LVL " + lvl + " ]");
        }
    }
}