package pl.edu.ur.oopl9;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class Zadanie2 {
    public static void zad2()
    {
        Random rand = new Random();
        TreeSet<Integer> Treerand = new TreeSet<>();
        for(int i=0;i<100;i++)
        {
            Treerand.add(rand.nextInt(10));
        }

        Iterator tree = Treerand.iterator();

        while(tree.hasNext())
        {
            Integer value = (Integer)tree.next();
            System.out.println("Wartośc: "+value);
        }
        Main.main(new String[0]);
        /**
         * Otrzymujemy jedną wartość tylko raz(duplikaty są ignorowane)
         */

    }
}
