/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioCanciones;

/**
 *
 * @author Profe Hernán
 * @version 23-08-2023
 */
public class Principal {
    
    public static void main(String[] args) {
        
        //crear canciones
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("SUAVE", "Luis Miguel",217, true, 'N');
        
        //dar valores a cancion 1
        cancion1.setTitulo("Creep");
        cancion1.setArtista("Radiohead");
        cancion1.setTiempoDuracion(238);
        cancion1.setDescargada('N');
        //cancion1.setFavorita(true);
        //no se inicializa favorita asume false
        
        //llamar a los metodos.
        System.out.println(cancion1.getTitulo()+" se adelanto "+cancion1.adelantarCancion(10, 0)+" segundos");
        System.out.println("******************");
        System.out.println(cancion1.obtenerTipoCancion());
        cancion1.imprimirCancion();
        System.out.println("*************");
        cancion2.imprimirCancion();
        System.out.println(cancion1.toString());
    }
    
}
