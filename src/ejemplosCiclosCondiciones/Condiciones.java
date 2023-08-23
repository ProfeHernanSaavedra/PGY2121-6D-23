/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplosCiclosCondiciones;

/**
 *
 * @author USRVI-LC3
 */
public class Condiciones {
    
    
    public static void main(String[] args) {
        int edad = 16;
        
        //if + tab
        if (edad > 18) {
            System.out.println("Es mayor de edad");
        }
        else{
            System.out.println("Es menor de edad");
        }
        System.out.println("*****SWITCH***");
        
        int dia = 3; 
        String palabra = "hola";
        //sw + tab sirve para todo timpo de datos.
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dato no coincide");;
        }
        
    }
    
}
