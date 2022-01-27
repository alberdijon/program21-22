/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probak;

import java.util.Scanner;
import cylindercircle.herentzia.Circle;
import cylindercircle.herentzia.cylindre;
/**
 *
 * @author alberdi.jon
 */
public class ZirkuluaSortu {
     public static void main(String[] args) {
        String mota, kolorea;
        double erradioa, altuera;
        boolean isValid = false;
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Zirkulu arrunta edo zilindroa sortu nahi duzu? (a/z) ");
            mota = in.next();
            if (mota.equals("a") || mota.equals("z")){
                isValid = true;
            } else {
                System.out.println("Saiatu berriro.");
            }
        } while(!isValid); 
        if (mota.equals("a")) {
            System.out.print("Zein da bere erradioa? ");
            erradioa = in.nextDouble();  
            System.out.print("Zein da bere kolorea? ");
            kolorea = in.next();
            Circle c1 = new Circle (erradioa, kolorea);
            System.out.println("Hauek dira sortutako zirkuluaren ezaugarriak:");
            System.out.println("Erradioa: " + c1.getRadius());
            System.out.println("Kolorea: " + c1.getColor());
            System.out.println("Azalera: " + c1.getArea());
        } else {
            System.out.print("Zein da bere erradioa? ");
            erradioa = in.nextDouble();
            System.out.print("Zein da bere kolorea? ");
            kolorea = in.next();
            System.out.print("Zein da bere altuera? ");
            altuera = in.nextDouble();
            cylindre c2 = new cylindre (altuera, erradioa, kolorea);
            System.out.println("Hauek dira sortutako ZILINDROAren ezaugarriak:");
            System.out.println("Erradioa: " + c2.getRadius());
            System.out.println("Kolorea: " + c2.getColor());
            System.out.println("Altuera: " + c2.getHeight());
            System.out.println("Azalera: " + c2.getArea());
            System.out.println("Bolumena: " + c2.getVolume());
        }
    }
}
