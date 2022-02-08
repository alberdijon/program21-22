package model;

/**
 *
 * @author alberdi.jon
 */
public class Futbolista extends IntegranteSeleccion{
    private int dorsal;
    private Demarkazioa Demarkazioa;
    
    public Futbolista(int dorsal, Demarkazioa Demarkazioa){
        super();
        this.dorsal = dorsal;
        this.Demarkazioa = Demarkazioa;
    }
    
    public Futbolista(int id,String nombre, String apellido, int edad, int dorsal, Demarkazioa Demarkazioa){
        super(id,nombre,apellido,edad);
        this.dorsal = dorsal;
        this.Demarkazioa = Demarkazioa;
    }

    public int getDorsal() {
        return dorsal;
    }

    public Demarkazioa Demarkazioa() {
        return Demarkazioa;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarkazioa(Demarkazioa Demarkazioa) {
        this.Demarkazioa = Demarkazioa;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void entrenar(){
        System.out.println("Entrenando");
    }
    
    public void jugarPartido(){
        System.out.println("Jugando partido");
    }

    @Override
    public String toString() {
        return "Futbolista{id = " + super.getId() + ",nombre = " + super.getNombre() + ",apellido = " + super.getApellido() + ",edad = " + super.getEdad() +",dorsal = " + dorsal + ", Demarkazioa=" + Demarkazioa + '}';
    }  
}