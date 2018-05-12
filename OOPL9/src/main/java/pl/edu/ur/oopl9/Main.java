/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl9;
import java.util.*;
/**
 *
 * @author maarchyl
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int w;
       Scanner s = new Scanner(System.in);
        System.out.println("Wybierz numer zadania(1-4)");
        w = s.nextInt();
       switch (w)
       {
           case 1:
               Zadanie1.zad1();
               break;
           case 2:
               Zadanie2.zad2();
               break;
           case 3:
               Zadanie3.zad3();
               break;
           case 4:
               Zadanie4.zad4();
               break;
               default:
                   System.out.println("Nie ma takiego zadania! Program zakończy pracę!");
                   break;
       }

    }
    
}
