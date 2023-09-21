
package Unidad2.EjemploHerencia;

import java.util.Date;

/**
 *
 * @author USRVI-LC3
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Date fecha = new Date();
        Instagram insta = new Instagram(100, "dando clases", true, "admin", "admin");
        Twitter twit = new Twitter(200, "2024 feriado 3 dias sept", fecha, "admin", "admin");
        // o tambien asi ---> Twitter twit = new Twitter(200, "2024 feriado 3 dias sept", new Date(), "admin", "admin");
        
        System.out.println("**************");
        System.out.println(insta);
        System.out.println(twit);
        System.out.println("**************");
        System.out.println(insta.visualizar());
        System.out.println(twit.visualizar());
        
        
    }
    
}
