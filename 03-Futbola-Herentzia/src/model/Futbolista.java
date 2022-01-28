/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alberdi.jon
 */
public class Futbolista  extends IntegranteSeleccion {
    
    private int dorsal;
    private Demarkazioa demarcación;

    public Futbolista(int dorsal, Demarkazioa demarcación, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal= dorsal;
        this.demarcación= demarcación;
    }

    @Override
    public String toString() {
        return "Futbolista{ id = " + id + ", nombre = " + nombre + ", apellido = " + apellidos + ", edad= " + edad + ", dorsal= " + dorsal + ", demarcación= " + demarcación;
    }

    
    

   

    public int getDorsal() {
        return dorsal;
    }

    public Demarkazioa getDemarcación() {
        return demarcación;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcación(Demarkazioa demarcación) {
        this.demarcación = demarcación;
    }
    
    public void entrenar(){
        System.out.println("Estoy entrenando");
    }
    
    public void jugarPartido(){
        System.out.println("Estoy jugando un partido");
    }
    
}
