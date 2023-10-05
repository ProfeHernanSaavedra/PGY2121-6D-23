
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Aseo extends Producto{
    
    private String tipo;

    public Aseo() {
        super();
    }

    public Aseo(String tipo, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Aseo{" + "tipo=" + tipo + '}' + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: " + super.getCantidad());
        System.out.println("Tipo de Aseo: " + this.getTipo());
    }
    
    
 @Override
    public void comentarios(String comentario) {
        System.out.println("COmentario para Aseo : " + comentario);
    }
    
    
    
    
}
