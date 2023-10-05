
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author 
 */
public class Liquido extends Producto{
    
    private double gradoAlcohol;

    public Liquido() {
        super();
    }

    public Liquido(double gradoAlcohol, int codigo, int precio, int cantidad, String descripcion) {
        super(codigo, precio, cantidad, descripcion);
        this.gradoAlcohol = gradoAlcohol;
    }

    public double getGradoAlcohol() {
        return gradoAlcohol;
    }

    public void setGradoAlcohol(double gradoAlcohol) {
        this.gradoAlcohol = gradoAlcohol;
    }

    @Override
    public String toString() {
        return "Liquido{" + "gradoAlcohol=" + gradoAlcohol + '}' + super.toString();
    }

    @Override
    public void listar() {
        
        System.out.println("Codigo: " + super.getCodigo());
        System.out.println("Precio: " + super.getPrecio());
        System.out.println("Cantidad: " + super.getCantidad());
        System.out.println("grado Alcohol: " + this.getGradoAlcohol());
    }
    
     @Override
    public void comentarios(String comentario) {
        System.out.println("COmentario para Liquido : " + comentario);
    }
    
    
}
