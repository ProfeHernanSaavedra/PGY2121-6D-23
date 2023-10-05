
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Abarrote extends Producto{
    
    private double tamaño ;

    public Abarrote() {
        super();
    }

    public Abarrote(double tamaño, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.tamaño = tamaño;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Abarrote{" + "tama\u00f1o=" + tamaño + '}' + super.toString();
    }

    @Override
    public void listar() {
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: " + super.getCantidad());
        System.out.println("Tamaño: " + this.getTamaño());
    }

    @Override
    public void comentarios(String comentario) {
        System.out.println("COmentario para Abarrote : " + comentario);
    }
    
    
    
}
