
/**
 * This class creates the Weapon object and stores data on a weapon.
 */
public class Weapon
{
    private String type;
    private int durability;
    private int strength;
    
    //default contructor
    public Weapon()
    {
        type = "Unidentied object";
        durability = 0;
        strength = 0;
    }
    
    public Weapon(String t, int d, int s)
    {
        type = t;
        durability = d;
        strength = s;
    }
}
