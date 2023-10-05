
package Unidad2.Herencia.Ejercicio233;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Coleccion {
    
    private ArrayList<Producto>listaProductos;

    public Coleccion() {
        listaProductos = new ArrayList<>();
    }
    
    public boolean agregarProductos(Producto prod)
    {
        return listaProductos.add(prod);
    }
    
    public void listarProductos()
    {
        int suma = 0;
        System.out.println("Codigo\t Descripcion\t Cantidad\t Precio");
        for (Producto prod : listaProductos) {
            System.out.println(prod.getCodigo()+"\t"+prod.getDescripcion()+"\t\t" + prod.getCantidad()+"\t"+prod.getPrecio());
             suma = suma + prod.getPrecio()*prod.getCantidad();
            
        }
        System.out.println("                             ------------------");
        System.out.println("                                Total: $"+ suma);
    }
    
    public void calcularTotalOferta()
    {
        int suma = 0;
        String clase = "";
        for (Producto prod : listaProductos) {
//            clase = prod.getClass().getName();
//            System.out.println(clase);
//            
            if (prod.getClass().getName().equalsIgnoreCase("Unidad2.Herencia.Ejercicio233.Oferta")) {
                suma = suma + prod.getPrecio()*prod.getCantidad();
            }
        }
        System.out.println("El total de la suma de ofertas es: " + suma);
    }
    
    
}
