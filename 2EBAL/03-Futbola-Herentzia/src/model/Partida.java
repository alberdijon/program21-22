package model;


import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author alberdi.jon
 */
public class Partida {
    private LocalDate data;
    private String aurkaria;
    private ArrayList<Futbolista> txarterlak;
    
    public Partida(LocalDate data, String aurkaria){
        this.data = data;
        this.aurkaria = aurkaria;
        this.txarterlak = new ArrayList<>();
    }
    
    public Partida(LocalDate data, String aurkaria, ArrayList<Futbolista> txartelak){
        this.data = data;
        this.aurkaria = aurkaria;
        this.txarterlak = txartelak;
    }

    public LocalDate getData() {
        return data;
    }

    public String getAurkaria() {
        return aurkaria;
    }

    public ArrayList<Futbolista> getTxarterlak() {
        return txarterlak;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setAurkaria(String aurkaria) {
        this.aurkaria = aurkaria;
    }

    public void setTxarterlak(ArrayList<Futbolista> txarterlak) {
        this.txarterlak = txarterlak;
    }
    
    public void txartelaJarri(Futbolista f){
        txarterlak.add(f);
        //System.out.println("Txartela duen futbolaria: " + f);
    }

    @Override
    public String toString() {
        return "Partida{" + "data=" + data + ", aurkaria=" + aurkaria + ", txarterlak=" + txarterlak + '}';
    }     
}