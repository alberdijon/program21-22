/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import model.Demarkazioa;
import model.Entrenador;
import model.Futbolista;
import model.IntegranteSeleccion;
import model.Masajista;
import model.Partida;

/**
 *
 * @author alberdi.jon
 */
public class PartidakKudeatu {
    
    public static ArrayList<IntegranteSeleccion> selekzioa = new ArrayList<IntegranteSeleccion>();
    public static Partida[] partidak;
    private static int sortutakoPartidak = 0;
    private static Scanner in = new Scanner(System.in);

    public static void selekzioOsoaSortu() {
        selekzioa.add(new Futbolista(1, "Aitor", "Fernandez", 30, 1, Demarkazioa.POR));
        selekzioa.add(new Futbolista(2, "Unai", "Bustinza", 29, 2, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(3, "Mikel", "Balenziaga", 33, 3, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(4, "Asier", "Illarramendi", 31, 4, Demarkazioa.MED));
        selekzioa.add(new Futbolista(5, "Iñigo", "Martinez", 30, 5, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(6, "Mikel", "San Jose", 32, 6, Demarkazioa.MED));
        selekzioa.add(new Futbolista(7, "Gaizka", "Larrazabal", 24, 7, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(8, "Manu", "Garcia", 35, 8, Demarkazioa.MED));
        selekzioa.add(new Futbolista(9, "Aritz", "Aduriz", 40, 9, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(10, "Javier", "Eraso", 31, 10, Demarkazioa.MED));
        selekzioa.add(new Futbolista(11, "Asier", "Villalibre", 24, 11, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(12, "Aihen", "Muñoz", 24, 12, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(13, "Iago", "Herrerin", 34, 13, Demarkazioa.POR));
        selekzioa.add(new Futbolista(14, "Aritz", "Elustondo", 27, 14, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(15, "Jesus", "Areso", 22, 15, Demarkazioa.DEF));
        selekzioa.add(new Futbolista(16, "Iñigo", "Vicente", 24, 16, Demarkazioa.DEL));
        selekzioa.add(new Futbolista(17, "Daniel", "Vivian", 22, 17, Demarkazioa.DEF));

        selekzioa.add(new Entrenador(18, "Francisco", "Paladino", 57, "67555"));
        selekzioa.add(new Entrenador(19, "Joseba", "Nuñez", 60, "54202"));
        selekzioa.add(new Entrenador(20, "Markel", "Lautadahandi", 62, "10002"));

        selekzioa.add(new Masajista(21, "Iñaki", "Sertxiberrieta", 37, "Fisioterapeuta", 15));

        selekzioa.add(new IntegranteSeleccion(22, "Ander", "Etxeburu", 42));
    }

    public static void partidakAsmatu() {
        partidak = new Partida[20];
       
        partidak[sortutakoPartidak] = new Partida(LocalDate.of(2016, 05, 27), "Corcega");
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(5, "Iñigo", "Martinez", 30, 5, Demarkazioa.DEF));
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(12, "Aihen", "Muñoz", 24, 12, Demarkazioa.DEF));
        sortutakoPartidak++;

        partidak[sortutakoPartidak] = new Partida(LocalDate.of(2016, 12, 20), "Tunez");
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(14, "Aritz", "Elustondo", 27, 14, Demarkazioa.DEF));
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(12, "Aihen", "Muñoz", 24, 12, Demarkazioa.DEF));
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(11, "Asier", "Villalibre", 24, 11, Demarkazioa.DEL));
        sortutakoPartidak++;

        partidak[sortutakoPartidak] = new Partida(LocalDate.of(2018, 10, 12), "Venezuela");
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(10, "Javier", "Eraso", 31, 10, Demarkazioa.MED));
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(6, "Mikel", "San Jose", 32, 6, Demarkazioa.MED));
        sortutakoPartidak++;


        partidak[sortutakoPartidak] = new Partida(LocalDate.of(2019, 05, 19), "Panama");
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(5, "Iñigo", "Martinez", 30, 5, Demarkazioa.DEF));
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(12, "Aihen", "Muñoz", 24, 12, Demarkazioa.DEF));
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(9, "Aritz", "Aduriz", 40, 9, Demarkazioa.DEL));
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(11, "Asier", "Villalibre", 24, 11, Demarkazioa.DEL));
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(1, "Aitor", "Fernandez", 30, 1, Demarkazioa.POR));
        sortutakoPartidak++;


        partidak[sortutakoPartidak] = new Partida(LocalDate.of(2020, 11, 16), "Costa Rica");
        partidak[sortutakoPartidak].txartelaJarri(new Futbolista(10, "Javier", "Eraso", 31, 10, Demarkazioa.MED));
        sortutakoPartidak++;
    }

    public static void partidaBatenDatuakEskatu() {
        System.out.print("Sartu partiduaren data(Urtea Hilabetea Eguna): ");
        String urteaStr = in.next();
        String hilabeteaStr = in.next();
        String egunaStr = in.next();

        System.out.print("Sartu aurkariaren izena: ");
        String aurkaria = in.next();

        partidak[sortutakoPartidak] = new Partida(LocalDate.of(Integer.parseInt(urteaStr), Integer.parseInt(hilabeteaStr), Integer.parseInt(egunaStr)), aurkaria);
        char aukera;
        do {
            System.out.print("Txartel bat jarri nahi duzu(B/E)? ");
            aukera = in.next().toUpperCase().charAt(0);
            if (aukera == 'B') {
                System.out.print("Sartu futbolariari buruzko informazioa(ID izena abizena adina dortsala): ");
                String id = in.next();
                String izena = in.next();
                String abizena = in.next();
                String adina = in.next();
                String dortsala = in.next();

                partidak[sortutakoPartidak].txartelaJarri(new Futbolista(Integer.parseInt(id), izena, abizena, Integer.parseInt(adina), Integer.parseInt(dortsala), null));
            }
        } while (aukera != 'E');
        System.out.println(partidak[sortutakoPartidak]);
        sortutakoPartidak++;
    }

    public static void jokalarienTxartelak() {
        
        IntegranteSeleccion partaidea;
        IntegranteSeleccion txartelGehienekoJokalaria = null;
        int ateratakoTxartelak;
        int txartelMaximoa = 0;
        for (int i = 0; i < selekzioa.size(); i++) {
            ateratakoTxartelak = 0;
            partaidea = selekzioa.get(i);
            if (partaidea instanceof Futbolista) {
                for (int j = 0; j < partidak.length; j++) {
                    if (partidak[j] != null) {
                        for (int k = 0; k < partidak[j].getTxarterlak().size(); k++) {
                            if (partaidea.getId() == partidak[j].getTxarterlak().get(k).getId()) {
                                ateratakoTxartelak++;
                            }
                        }
                    }
                }
                if (ateratakoTxartelak > txartelMaximoa) {
                    txartelGehienekoJokalaria = partaidea;
                    txartelMaximoa = ateratakoTxartelak;
                }
                System.out.println(partaidea.getNombre() + ": " + ateratakoTxartelak);
            }
        }
        System.out.println("Txartel gehien dituen jokalaria: " + txartelGehienekoJokalaria.getNombre() + "," + txartelMaximoa + " txartel");
    }

    public static String txartelakIkusiFrame(int jokalariarenID) {
        IntegranteSeleccion partaidea;
        int ateratakoTxartelak = 0;
        partaidea = selekzioa.get(jokalariarenID);

        if (partaidea instanceof Futbolista) {
            for (int j = 0; j < partidak.length; j++) {
                if (partidak[j] != null) {
                    for (int k = 0; k < partidak[j].getTxarterlak().size(); k++) {
                        if (partaidea.getId() == partidak[j].getTxarterlak().get(k).getId()) {
                            ateratakoTxartelak++;
                        }
                    }
                }
            }
            if(ateratakoTxartelak > 0){
                return partaidea.getNombre() + ", " + ateratakoTxartelak;
            }
        }
        return null;
    }
    
    public static void partidaJokatu(String urteaStr,String hilabeteaStr,String egunaStr,String aurkaria){
        int urtea = Integer.parseInt(urteaStr);
        int hilabetea = Integer.parseInt(hilabeteaStr);
        int eguna = Integer.parseInt(egunaStr);
        
        partidak[sortutakoPartidak] = new Partida(LocalDate.of(urtea, hilabetea, eguna), aurkaria);
        sortutakoPartidak++;
    }

    public static int jokatutakoPartidaKopurua() {
        int partidaKopurua = 0;
        for (int i = 0; i < partidak.length; i++) {
            if (partidak[i] != null) {
                partidaKopurua++;
            }
        }
        return partidaKopurua;
    }

    public static void partidakBatazBeste() {
        long egunakGuztira = 0;
        int partidaBatazBeste = 0;
        int jokatutakoPartidak = 0;
        LocalDate partida1;
        LocalDate partida2;
        for (int i = 0; i < partidak.length; i++) {
            if (partidak[i] != null && partidak[i + 1] != null) {
                partida1 = partidak[i].getData();
                partida2 = partidak[i + 1].getData();
                egunakGuztira += ChronoUnit.DAYS.between(partida1, partida2);
            }
        }
        jokatutakoPartidak = jokatutakoPartidaKopurua();
        partidaBatazBeste = (int) egunakGuztira / (jokatutakoPartidak - 1);
        System.out.println("Egunak: " + egunakGuztira);
        System.out.println("Partido bat jokatzen da " + partidaBatazBeste + " egunero");
    }

    public static void main(String[] args) {
        selekzioOsoaSortu();
        partidakAsmatu();
        partidaBatenDatuakEskatu();
        System.out.println("Jokatutako partida kopurua: " + jokatutakoPartidaKopurua());
        partidakBatazBeste();
        jokalarienTxartelak();
    }
}
