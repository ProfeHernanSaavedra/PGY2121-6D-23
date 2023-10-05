
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author USRVI-LC3
 */
public class Congelado extends Producto{
    
    private double gradosCongelado;

    public Congelado() {
        super();
    }

    public Congelado(double gradosCongelado, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.gradosCongelado = gradosCongelado;
    }

    public double getGradosCongelado() {
        return gradosCongelado;
    }

    public void setGradosCongelado(double gradosCongelado) {
        this.gradosCongelado = gradosCongelado;
    }

    @Override
    public String toString() {
        return "Congelado{" + "gradosCongelado=" + gradosCongelado + '}' + super.toString();
    }

    @Override
    public void listar() {
       System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: " + super.getCantidad());
        System.out.println("Temperatura: " + this.getGradosCongelado());
    }
    
     @Override
    public void comentarios(String comentario) {
        double precioConIva = IComentario.IVA * super.getPrecio();
         System.out.println("Precio del IVA de " + super.getPrecio()+" es: $" + precioConIva);
        System.out.println("COmentario para Congelado : " + comentario);
    }
    
    
}
