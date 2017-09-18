
/**
 * Implements a list of Animals as an ArrayList
 * This List will add random animals as written by everyone in the class.
 *
 * @author Michael Buescher for APCS
 * @version Unit 2 - with all input
 */

import java.util.ArrayList;

public class AnimalList2
{

    public final int NUM_ANIMALS = 6;
    private ArrayList <Animal> aList;
 
    
    public AnimalList2 ()
    {
        aList = new ArrayList<Animal>();
    }
    
    /** Adds a new random Animal to the list!
     */
    public void addRandomAnimal()
    {
        int n = (int)(Math.random() * NUM_ANIMALS);
        switch (n)
        {
            case 0: aList.add(new Cow());
            case 1: aList.add(new Dog());
            case 2: aList.add(new Fish());
            case 3: aList.add(new Koala());
            case 4: aList.add(new Lizard());
            case 5: aList.add(new Snake());
        }
        
    }
    
    /** Prints the list of Animals  */
    public void printList()
    {
        for (Animal a : aList)
        {
            a.speak();
            a.eat();
            System.out.println();
        }
    }
    
    /**
     * Makes a list of Animals!
     */
    public static void main (String[] args)
    {
        AnimalList2 myList = new AnimalList2();
        
        for (int i = 0; i < 15; i++)
        {
            myList.addRandomAnimal();
        }
        
        myList.printList();
    }
}
