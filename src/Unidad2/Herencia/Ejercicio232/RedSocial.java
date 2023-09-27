
package Unidad2.Herencia.Ejercicio232;

/**
 *
 * @author 
 */
public class RedSocial extends Interes implements IVerLike{
    
    private String nombreRedSocial;

    public RedSocial() {
        super();
    }

    public RedSocial(String nombreRedSocial, String usuario, String password, int tiempoConectado, int like) {
        super(usuario, password, tiempoConectado, like);
        this.nombreRedSocial = nombreRedSocial;
    }

    public String getNombreRedSocial() {
        return nombreRedSocial;
    }

    public void setNombreRedSocial(String nombreRedSocial) {
        this.nombreRedSocial = nombreRedSocial;
    }

    @Override
    public String toString() {
        return "RedSocial{" + "nombreRedSocial=" + nombreRedSocial + '}' + " " + super.toString();
    }

    @Override
    public void visualizar() {
        System.out.println("Usuario: " + super.getUsuario());
        System.out.println("Nombre Red Social: " + this.getNombreRedSocial());
    }

     @Override
    public void contarLikeMinuto() {
        
        System.out.println("Likes: " + super.getLike());
        System.out.println("Tiempo Conectado : " + super.getTiempoConectado());
    }
    
    
    
}
