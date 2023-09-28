
package Unidad2.EjemploColeccion.Revisando231;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList<Evento> listaEventos;

    public Coleccion() {
        listaEventos = new ArrayList<>();
    }
    
    public boolean agregarEvento(Evento even)
    {
        return listaEventos.add(even);
    }
    
    public void listarEventos()
    {
        for (Evento evento : listaEventos) {
            System.out.println(evento);
            System.out.println(evento.getUbicacion());
        }
    }
    
    public void ordenarFecha()
    {
        listaEventos.sort((e1,e2)-> e1.getFecha().compareTo(e2.getFecha()));
        
        for (Evento evento : listaEventos) {
            System.out.println(evento.getFecha());
        }
        
    }
    
    
    
}
