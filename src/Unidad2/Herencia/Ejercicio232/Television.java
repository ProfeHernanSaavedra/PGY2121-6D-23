
package Unidad2.Herencia.Ejercicio232;

/**
 *
 * @author 
 */
public class Television extends Interes implements IVerLike{
    
    private String generoTelevision;

    public Television() {
        super();
    }

    public Television(String generoTelevision, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.generoTelevision = generoTelevision;
    }

    public String getGeneroTelevision() {
        return generoTelevision;
    }

    public void setGeneroTelevision(String generoTelevision) {
        this.generoTelevision = generoTelevision;
    }

    @Override
    public String toString() {
        return "Talevision{" + "generoTelevision=" + generoTelevision + '}' + " " + super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: " + super.getUsuario()) ;
        System.out.println("Genero Pelicula: " + this.getGeneroTelevision());
    }

      @Override
    public void contarLikeMinuto() {
        
        System.out.println("Likes: " + super.getLike());
        System.out.println("Tiempo Conectado : " + super.getTiempoConectado());
    }
    
    
    
}
