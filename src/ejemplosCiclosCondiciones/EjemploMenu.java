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
public class EjemploMenu {
    
    public static void main(String[] args) {
        
        Ciclo opciones = new Ciclo();
        System.out.println("*****MIENTRAS******");
        opciones.mientras();
        System.out.println("******AHORA REPETIR");
        opciones.repetir();
        System.out.println("********PARA*****");
        opciones.para();
        
    }
    
}
