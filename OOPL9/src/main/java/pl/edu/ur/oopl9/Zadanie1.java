package pl.edu.ur.oopl9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {

    public static void zad1()
    {
        int w;
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        Integer[] randTab = new Integer[100];
        for(int i=0;i<randTab.length;i++)
        {
            randTab[i] = rand.nextInt(100);
        }
        System.out.println("Utworzono tablice 100 losowych liczb");
        do {
            System.out.println("1.Wyświetl\n2.Sortuj\n3.Powrót do głównego menu");
            System.out.print("Wybierz:" );
            w = s.nextInt();
            switch (w) {
                case 1:
                    list(randTab);
                    break;
                case 2:
                    sort(randTab);
                    break;
                case 3:
                    Main.main(new String[0]);
                    break;
                default:
                    System.out.println("Wybrano nieprawidłową opcję!");
                    break;
            }
        }while(w!=3);
    }


    public static Integer[] sort(Integer[] randTab)
    {
        Arrays.sort(randTab);
        System.out.println("Sotrowanie Zakończone pomyślnie!");
        return randTab;
    }
    public static void list(Integer[] randTab)
    {
        for(int i=0;i<randTab.length;i++)
        {
            System.out.println("randTab["+i+"]: "+randTab[i]);
        }
    }



}
