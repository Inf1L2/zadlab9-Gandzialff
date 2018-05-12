package pl.edu.ur.oopl9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Zadanie3 {
    public static void zad3()
    {
        int w;
        Scanner s = new Scanner(System.in);
        List<Samochod> auta = new ArrayList<Samochod>();

        auta.add(new Samochod("Audi","A4",2.0,250,50000));
        do{
            System.out.println("1.Wyświetl liste aut\n2.Dodaj auto\n3.Powrót do głównego menu");
            w = s.nextInt();

            switch (w)
            {
                case 1:
                    carlist(auta);
                    break;
                case 2:
                    addCar(auta);
                    break;
                case 3:
                    Main.main(new String[0]);
                    break;
                    default:
                        System.out.println("ybrano nieprawidłową opcję!");
                        break;
            }

        }while(w!=3);

    }
    public static List<Samochod> addCar(List<Samochod> auta)
    {
        Scanner s = new Scanner(System.in);
        String marka;
        String nazwa;
        double pojemnosc;
        int maxpr;
        double cena;

        System.out.println("===DODAJ AUTO===");
        System.out.print("Marka: ");
        marka = s.next();
        System.out.print("Nazwa: ");
        nazwa = s.next();
        System.out.print("Pojemnosc: ");
        pojemnosc = s.nextDouble();
        System.out.print("Prędkość maksymalna: ");
        maxpr = s.nextInt();
        System.out.print("Cena: ");
        cena = s.nextDouble();

        auta.add(new Samochod(marka,nazwa,pojemnosc,maxpr,cena));
        System.out.println("Pomyślnie dodano pojazd do listy!");
    return auta;
    }
    private static void carlist(List<Samochod> auta)
    {
        Iterator carIt = auta.iterator();
        while (carIt.hasNext())
        {
        Samochod auto = (Samochod)carIt.next();
            System.out.println(auto.toString());
        }
    }
}
