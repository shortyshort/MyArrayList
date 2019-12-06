import java.util.ArrayList;
import java.util.ListIterator;

public class MyArrayList
{
    public static void main (String[] args)
    {
        ArrayList<String> minecraftEquip = new ArrayList<String>();


        minecraftEquip.add("sword");
        minecraftEquip.add("pickax");
        minecraftEquip.add("shovel");
        minecraftEquip.add("diamond hoe");
        minecraftEquip.add("crafting table");

        ListIterator it = minecraftEquip.listIterator();

        System.out.println (minecraftEquip);

        while(it.hasNext())
        {
            System.out.println("I have a " + it.next());
        }//end while loop

        minecraftEquip.remove("pickax");
        it = minecraftEquip.listIterator();
        System.out.println("_______Next Output______");
        while(it.hasNext())
        {
            System.out.println("I have a " + it.next());
        }//end while loop

        minecraftEquip.remove(3);

        it = minecraftEquip.listIterator();
        System.out.println ("*********** Next Output*************");
        while (it.hasNext())
        {
            System.out.println("Now I have a " + it.next());
        }//end loop

        System.out.println ("\n I have " + minecraftEquip.size());
        for (int i = 0; i < minecraftEquip.size(); i++)
        {
            System.out.println ("The " + i + " the item is " + minecraftEquip.get(i));
        }

        minecraftEquip.set(0, "shirt");
        for (int i = 0; i < minecraftEquip.size(); i++)
        {
            System.out.println ("The " + i + " the item is " + minecraftEquip.get(i));
        }

    }//end main method

}//end class
