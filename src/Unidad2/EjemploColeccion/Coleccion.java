
package Unidad2.EjemploColeccion;

import java.util.ArrayList;


/**
 *
 * @author USRVI-LC3
 */
public class Coleccion {
    
    public static void main(String[] args) {
        
        
        ArrayList<String> listaNombres = new ArrayList<>(); //guardo Strings
        listaNombres.add("Juan");
        listaNombres.add("Matias"); 
        listaNombres.add("Armando Casas");
        listaNombres.add("XZEBA");
        
        System.out.println(listaNombres);
        
        //fore + tab
        for (String dato : listaNombres) {
            System.out.println(dato);
        }
        System.out.println("");
        //AHORA AUTOS
        System.out.println("******AUTOS*******");
        
        ArrayList<Auto>listaAutos = new ArrayList<>(); //guardo Autos
        
        Auto auto1 = new Auto("KIA", "MORNING", 2020);
        Auto auto2 = new Auto("FIAT","600",1963);
        
        listaAutos.add(auto1);
        listaAutos.add(auto2);
        
        System.out.println(listaAutos);
        
        for (Auto auto : listaAutos) {
            System.out.println(auto.getMarca());
        }
        
    }
    
}
