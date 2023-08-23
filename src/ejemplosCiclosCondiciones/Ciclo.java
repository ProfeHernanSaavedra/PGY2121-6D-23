/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosCiclosCondiciones;

import java.util.Scanner;

/**
 *
 * @author USRVI-LC3
 */
public class Ciclo {
    private Scanner leer;

    public Ciclo() {
        leer = new Scanner(System.in);
    }
    
    public void mientras()
    {
        
        int opcion = 0;
        //wh + tab
        
        while (opcion != 4) {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Haga algo de la opcion 1");
                    break;
                case 2:
                    System.out.println("Haga algo de la opcion 2");
                    break;
                case 3:
                    System.out.println("Haga algo de la opcion 3");
                    break;
                default:
                    System.out.println("Sin informacion");;
            }
            
        }
        System.out.println("Fin");
    }
    
    public void repetir()
    {
        int opcion=0;
        //do + tab
        
        do {
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("Haga algo de la opcion 1");
                    break;
                case 2:
                    System.out.println("Haga algo de la opcion 2");
                    break;
                case 3:
                    System.out.println("Haga algo de la opcion 3");
                    break;
                default:
                    System.out.println("Sin informacion");;
            }
        } while (opcion != 4);
        System.out.println("Fin");
    }
    
    public void para()
    {
        System.out.println("Cual es el numero final?");
        int fin = leer.nextInt();
        //for + tab
        for (int i = 0; i < fin; i++) {
            System.out.println("Hola");
        }
    }
}
