/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploPizza;

/**
 *
 * @author vina
 */
public class Principal {
    
    public static void  main(String[] args) {
        
        Pizza objPizza1 = new Pizza();
        
//        objPizza1.nombre = "Pepperoni";
        objPizza1.setNombre("Pepperoni");
        objPizza1.setMasa("gruesa");
        objPizza1.setTamano("grande");
        
        Pizza objPizza2 = new Pizza();
        
        //objPizza2.nombre = "Veggie";
        objPizza2.setNombre("vegetariana");
        objPizza2.setMasa("delgada");
        objPizza2.setTamano("mediana");
        
        Pizza objPizza3 = new Pizza("Napolitana", "Kids", "chica");
        objPizza3.preparar();
        objPizza3.calentar();
        //inicio comandos print
        
        objPizza1.preparar();
        objPizza1.calentar();
        
        System.out.println("********************");
        
        objPizza2.preparar();
        objPizza2.calentar();
        
        System.out.println("********************");
        
        System.out.println("Gracias por preferirnos!");
        
        
        System.out.println("****");
        System.out.println(objPizza3);
        System.out.println(objPizza3.getNombre());
        
       Pizza objPizza4 = new Pizza();
       objPizza4.preparar();
       objPizza4.setNombre("Maria");
       objPizza4.preparar();
        System.out.println("Masa: " + objPizza4.getMasa());
       
    }
    
}
