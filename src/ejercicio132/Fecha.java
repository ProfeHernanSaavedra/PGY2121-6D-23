package ejercicio132;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author USRVI-LC3
 */
public class Fecha {
    
    public static void main(String[] args) {
        
        Date fecha = new Date();
        System.out.println(fecha);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formato.format(fecha));
        
    }
    
}
