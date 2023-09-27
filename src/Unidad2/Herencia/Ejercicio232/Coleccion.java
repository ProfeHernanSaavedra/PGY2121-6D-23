
package Unidad2.Herencia.Ejercicio232;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList <Interes> listaIntereses;

    public Coleccion() {
        
        listaIntereses = new ArrayList<>();
    }
    
    public boolean agregarInteres(Interes interes)
    {
        return listaIntereses.add(interes);
    }
    
    public void listarIntereses()
    {
        for (Interes interes : listaIntereses) {
            System.out.println(interes);
        }
    }
    
    public void masLikes()
    {
        int mayor = 0;
        
        String nombreClase="";
        for (Interes interes : listaIntereses) {
            if (interes.getLike()>mayor ) {
                mayor = interes.getLike();
                nombreClase = interes.getClass().getName();
            }
        }
        
        switch (nombreClase) {
            case "Unidad2.Herencia.Ejercicio232.Television":
                System.out.println("El interes que tiene mas likes es: Television");
                break;
            case "Unidad2.Herencia.Ejercicio232.Musica":
                System.out.println("El interes que tiene mas likes es: Musica");
                break;
            case "Unidad2.Herencia.Ejercicio232.RedSocial":
                System.out.println("El interes que tiene mas likes es: Red Social");
                break;
            
        }
        
       // System.out.println("El interes que tiene mas likes es: " + nombreClase);
    }
    
    public int contarLike()
    {
        int suma = 0;
        for (Interes interes : listaIntereses) {
            suma = suma + interes.getLike();
            //suma += interes.getLike();
        }
        return suma;
    }
    
    
}
