
package Unidad2.EjemploColeccion.Revisando231;

import java.util.Date;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        
        //System.out.println(new Date());
        Evento ev1 = new Evento(1, new Date(2023,9,30), new Date(2023,9, 30, 12,12,12), new Date(2023, 9,30, 15, 30, 0), "Vina", 200000, 50, "Fiesta", true);
        Evento ev2 = new Evento(2, new Date(2023,9,22), new Date(2023,9, 22, 9,0,0), new Date(2023, 9,22, 15, 30, 0), "Valpo", 300000, 50, "matrimonio", false);
        Evento ev3 = new Evento(3, new Date(2023,9,18), new Date(2023,9, 18, 8,0,0), new Date(2023, 9,18, 23, 30, 0), "Quilpue", 500000, 50, "Fiesta", true);
        
        Coleccion col = new Coleccion();
        
        col.agregarEvento(ev1);
        col.agregarEvento(ev2);
        col.agregarEvento(ev3);
        
        col.listarEventos();
        col.ordenarFecha();
        
        
    }
    
}
