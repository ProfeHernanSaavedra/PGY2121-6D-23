
package Unidad2.EjemploScooting;

import java.util.ArrayList;

/**
 *
 * @author Profe Hernan
 */
public class Empresa {
    
    private ArrayList<Empleado>listaEmpleados;

    public Empresa() {
        listaEmpleados = new ArrayList<>();
    }
    
    //agregar
    public boolean agregar(Empleado emp)
    {
        return listaEmpleados.add(emp);
    }
    
    //buscar
    public boolean buscarEmpleado(String rut)
    {
        for (Empleado emple : listaEmpleados) {
            if (emple.getRut().equals(rut)) {
                return true;
            }
            
        }
        return false;
    }
    
    //eliminar
    
    public void eliminarEmpleado(String rut)
    {
        for (Empleado emple : listaEmpleados) {
            if (buscarEmpleado(rut)) {
                listaEmpleados.remove(emple);
                System.out.println("Empleado eliminado!");
            }
            else{
                System.out.println("No existe Empleado!");
            }
        }
    }
    
    //listar
    public void listarEmpleados()
    {
       
        for (Empleado empl : listaEmpleados) {
            
            System.out.println(empl);
        }
    }
    
    
    
    
    
}
