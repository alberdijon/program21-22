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
public class Masajsita extends IntegranteSeleccion  {
    
    private String titulación;
    private int añosExperiencia;

    public Masajsita(String titulación, int añosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulación = titulación;
        this.añosExperiencia = añosExperiencia;
    }

 

    public String getTitulación() {
        return titulación;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setTitulación(String titulación) {
        this.titulación = titulación;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    
    public void darmasaje(){
        System.out.println("Estoy dando un masaje");
    }
}
