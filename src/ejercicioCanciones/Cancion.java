/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioCanciones;

/**
 *
 * @author Profe Hernán
 * @version 23-08-2023
 * 
 */
public class Cancion {
    
    
    private String titulo,artista;
    private int tiempoDuracion; //en segundos
    private boolean favorita;//true: favorita, false: no favorita
    private char descargada;//'S': si, 'N':no
    
    //constructores

    public Cancion() {
    }

    public Cancion(String titulo, String artista, int tiempoDuracion, boolean favorita, char descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDuracion = tiempoDuracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }
    //accesadores y mutadores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public char getDescargada() {
        return descargada;
    }

    public void setDescargada(char descargada) {
        this.descargada = descargada;
    }

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", tiempoDuracion=" + tiempoDuracion + ", favorita=" + favorita + ", descargada=" + descargada + '}';
    }
    
    //customer
    public int adelantarCancion(int segundosAdd,int segundosActuales)
    {
        segundosActuales = segundosActuales + segundosAdd;
        //segundosActuales += segundosAdd;
        return segundosActuales;
    }
    
    public void imprimirCancion()
    {
        int minutos = 0,segundos=0;
        
        minutos = this.tiempoDuracion / 60;
        segundos = this.tiempoDuracion - minutos * 60;
        
        System.out.println("Cancion: " + this.getTitulo());
        System.out.println("Artista: " + this.getArtista());
        System.out.println("Duracion: " + minutos+":"+segundos);
        System.out.println("**********************");
    }
    
    public String obtenerTipoCancion()
    {
        //5 minutos * 60 --> 300 segundos
        //if + tab
        if (this.tiempoDuracion >= 300) 
        {
            return "larga";
        }
        else
        { 
            return "normal";
        }
    }
    
}
