/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracionDeClases;

/**
 *
 * @author USRVI-LC3
 */
public class Conductor {
    
    private String nombre;
    private int rut,edad;
    private boolean conLentes;
    private Auto autito;

    public Conductor() {
    }

    public Conductor(String nombre, int rut, int edad, boolean conLentes, Auto autito) {
        this.nombre = nombre;
        this.rut = rut;
        this.edad = edad;
        this.conLentes = conLentes;
        this.autito = autito;
    }

    

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isConLentes() {
        return conLentes;
    }

    public void setConLentes(boolean conLentes) {
        this.conLentes = conLentes;
    }

    public Auto getAutito() {
        return autito;
    }

    public void setAutito(Auto autito) {
        this.autito = autito;
    }
    
    

    @Override
    public String toString() {
        return "Conductor{" + "nombre=" + nombre + ", rut=" + rut + ", edad=" + edad + ", conLentes=" + conLentes + '}';
    }

    
    
    
   
    
}
