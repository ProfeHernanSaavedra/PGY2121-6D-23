
package ejercicioCanciones;

import java.util.ArrayList;

/**
 *
 * @author profe Hernán
 */
public class Coleccion {
    
    private ArrayList<Cancion>listaCanciones;

    public Coleccion() {
        listaCanciones = new ArrayList<>();
    }
    
    public boolean agregarCancion(Cancion cancion)
    {
        return listaCanciones.add(cancion);
    }
    
    public void listarCanciones()
    {
        for (Cancion cancion : listaCanciones) {
           cancion.imprimirCancion();
        }
    }
    
    
    
}
