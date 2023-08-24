/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracionDeClases;

/**
 *
 * @author USRVI-LC3
 */
public class Auto {
    
    private String marca,color,modelo;
    private int año;

    public Auto() {
    }

    public Auto(String marca, String color, String modelo, int año) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.año = año;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", a\u00f1o=" + año + '}';
    }

    public void desplazar()
    {
        System.out.println("Desplazandose,...");
    }
}
