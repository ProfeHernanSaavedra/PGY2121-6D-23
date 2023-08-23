/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPizza;

/**
 *
 * @author vina
 */
public class Pizza {

    private String nombre;
    private String tamano;
    private String masa;

    //métodos
    //constructor sin parámetros
    public Pizza() {
        
        nombre = "Juan";
        masa = "rica";
    }

    //constructuor con parámetros
//    public Pizza(String nombreNuevo, String tamañoNuevo,String masaNueva)
//    {
//        nombre = nombreNuevo;
//        tamano = tamañoNuevo;
//        masa = masaNueva;
//    }
    public Pizza(String nombre, String tamano, String masa) {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
    }

    //mutadores y accesadores

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }
   

    public void sumar(int num1 , int num2)
    {
        int suma = num1 + num2;
        System.out.println("la suma es suma: " + suma);
    }
    
    @Override
    public String toString() {
        return "Pizza{" + "nombre=" + nombre + ", tamano=" + tamano + ", masa=" + masa + '}';
    }

    //customer
    public void preparar() {
        System.out.println("Preparando.." + this.getNombre() + " de masa: " + this.getMasa());
    }

    public void calentar() {
        System.out.println("Calentando pizza tamano..." + this.tamano);
    }
}
