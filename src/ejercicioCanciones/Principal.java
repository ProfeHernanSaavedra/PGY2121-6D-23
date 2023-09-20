package ejercicioCanciones;

import java.util.Scanner;

/**
 *
 * @author Profe Hernán
 * @version 20-09-2023
 */
public class Principal {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion=0;
        
        //crear canciones
        Cancion cancion1 = new Cancion();
        Cancion cancion2 = new Cancion("SUAVE", "Luis Miguel",217, true, 'N');
        Cancion cancion3 = new Cancion("Primavera","Chayanne",215, false, 'N');
        Cancion cancion4 = new Cancion("One","Metallica",310, false, 'S');
        Cancion cancion5 = new Cancion("Recuerdame","COCO",180, true, 'S');
        Cancion cancion6 = new Cancion("Suavemente","Elvis Crespo",220, true, 'N');
        
        //dar valores a cancion 1
        cancion1.setTitulo("Creep");
        cancion1.setArtista("Radiohead");
        cancion1.setTiempoDuracion(238);
        cancion1.setDescargada('N');
        //cancion1.setFavorita(true);
        //no se inicializa favorita asume false
        
        //llamar a los metodos.
//        System.out.println(cancion1.getTitulo()+" se adelanto "+cancion1.adelantarCancion(10, 0)+" segundos");
//        System.out.println("******************");
//        System.out.println(cancion1.obtenerTipoCancion());
//        cancion1.imprimirCancion();
//        System.out.println("*************");
//        cancion2.imprimirCancion();
//        System.out.println(cancion1.toString());


        Coleccion lista1 = new Coleccion();//instancio o se crea el ArrayList
        Coleccion lista2 = new Coleccion();
        
        lista1.agregarCancion(cancion1);
        lista1.agregarCancion(cancion2);
        lista1.agregarCancion(cancion3);
        
        lista2.agregarCancion(cancion4);
        lista2.agregarCancion(cancion5);
        lista2.agregarCancion(cancion6);
        
        do {
            
            System.out.println("***LISTAS****");
            System.out.println("1. Lista 1");
            System.out.println("2. Lista 2");
            System.out.println("3. Salir");
            System.out.println("Elija una opcion de lista o salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    lista1.listarCanciones();
                    break;
                case 2:
                    lista2.listarCanciones();
                    break;
                case 3:
                    System.out.println("Saliendo.....");
                    break;   
                 
                default:
                    System.out.println("Opcion no valida");
            }
            
        } while (opcion != 3);
        
    }
    
}
