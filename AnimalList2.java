
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
            case 0: aList.add(new Cow()); break;
            case 1: aList.add(new Dog()); break;
            case 2: aList.add(new Fish()); break;
            case 3: aList.add(new Koala()); break;
            case 4: aList.add(new Lizard()); break;
            case 5: aList.add(new Snake()); break;
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
