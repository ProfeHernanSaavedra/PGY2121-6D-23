
package Unidad2.Herencia.Ejercicio232;

/**
 *
 * @author 
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Musica ms = new Musica("ROCK", "admin", "admin", 120, 10);
        Television tv = new Television("SUSPENSO", "jperez", "123", 200, 20000);
        RedSocial rs = new RedSocial("Instagram","mporta", "654", 500,10000);
        
        Coleccion col = new Coleccion();
        
        col.agregarInteres(ms);
        col.agregarInteres(tv);
        col.agregarInteres(rs);
        
        col.masLikes();
        
        System.out.println("*****VISUALIZAR****");
        ms.visualizar();
        tv.visualizar();
        rs.visualizar();
        System.out.println("");
        System.out.println("****INTERFACE*****");
        ms.contarLikeMinuto();
        tv.contarLikeMinuto();
        rs.contarLikeMinuto();
        
        System.out.println("Likes: "+col.contarLike());
        
        
    }
            
    
}
