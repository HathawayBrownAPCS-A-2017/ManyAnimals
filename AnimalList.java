
/**
 * Implements a list of Animals as an ArrayList
 *
 * @author Michael Buescher for APCS
 * @version Unit 2
 */

import java.util.ArrayList;

public class AnimalList
{

    /**
     * Makes a list of Animals!
     */
    public static void main (String[] args)
    {
        ArrayList<Animal> myList = new ArrayList<Animal>();
        
        myList.add(new Animal());
        myList.add(new Animal());
        myList.add(new Animal());
        
        for (Animal a : myList)
        {
            a.speak();
            a.eat();
            System.out.println();
        }
    }
}
