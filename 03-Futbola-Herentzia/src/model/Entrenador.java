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
public class Entrenador extends IntegranteSeleccion {
    
    private String idFederación;

    public Entrenador(String idFederación, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
    }

    public String getIdFederación() {
        return idFederación;
    }

    public void setIdFederación(String idFederación) {
        this.idFederación = idFederación;
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("Estoy dirigiendo un entrenamiento");
    }
    
     public void dirigirPartido(){
        System.out.println("Estoy dirigiendo un partido");
    }
}
