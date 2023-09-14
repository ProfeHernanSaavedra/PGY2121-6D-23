
package Unidad2.EjemploScooting;

/**
 *
 * @author Profe Hernan
 */
public class TestEmpresa {
    
    public static void main(String[] args) {
        
        Puesto puesto1 = new Puesto(1, "Programador Junior");
        Puesto puesto2 = new Puesto(2, "Programador Senior");
        
        Empleado empleado1 = new Empleado("1-1", "Juan", 'M',5, 26, puesto1);
        Empleado empleado2 = new Empleado("2-2", "Maria", 'F',10, 36, puesto2);
        
        Empresa empresa = new Empresa();//invoque o instanciar la clase Empresa y construi el arreglo en la memoria
        
        if (empresa.buscarEmpleado(empleado1.getRut())==false) {
            empresa.agregar(empleado1);
            System.out.println(empleado1.getNombre()+" ha sido agregado!");
        }
        else{
            System.out.println("Empleado existe");
        }
        
         if (empresa.buscarEmpleado(empleado1.getRut())==false) {
            empresa.agregar(empleado1);
            System.out.println(empleado1.getNombre()+" ha sido agregado!");
        }
        else{
            System.out.println("Empleado existe");
        }
         
         
         if (empresa.buscarEmpleado(empleado2.getRut())==false) {
            empresa.agregar(empleado2);
            System.out.println(empleado2.getNombre()+" ha sido agregado!");
        }
        else{
            System.out.println("Empleado existe");
        }
         
         empresa.listarEmpleados();
         
         empresa.eliminarEmpleado(empleado1.getRut());
         
         empresa.listarEmpleados();
                 
    }
    
}
