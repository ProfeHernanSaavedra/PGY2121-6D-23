package ejercicio132;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Profe Hernán
 * @version 31-08-2023
 */
public class Principal {
    
    public static void main(String[] args) {
        
        int opcion;
        boolean flag; //validaciones
        //cliente
        int rut,telefono;
        String nombre,mail,direccion;
        char dv;
        //producto
        int codigo,precio,cantidad,totalProductos;
        String subcategoria,descripcion;
        char medida;
        //solicitud
        int numero;
        String fecha;
        int porcentaje;
        int descuento;
        
        Scanner leer = new Scanner(System.in);
        
        Valida valida = new Valida();
        Cliente cliente = new Cliente();
        Solicitud sol = new Solicitud();
        
        do {
            System.out.println("******MENU******");
            System.out.println("1. Ingresar Cliente");
            System.out.println("2. Ingresar Solicitud y Productos");
            System.out.println("3. Aplicar descuento");
            System.out.println("4. Salir (ver solicitud)");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1:
                    do {
                        
                        System.out.println("Ingrese su rut: ");
                        rut = leer.nextInt();
                        System.out.println("Ingrese dv: ");
                        dv = leer.next().charAt(0);
                        flag = valida.validarRut(rut, dv);
                        if (flag == false) {
                            System.out.println("Rut mal ingresado, intente nuevamente");
                        }
                        
                    } while (flag == false);
                    
                    System.out.println("Ingrese Nombre: ");
                    nombre = leer.next();
                    
                    do {
                        
                        System.out.println("Ingrese telefono: ");
                        telefono = leer.nextInt();
                        flag = valida.validarLargo8(telefono);
                        if (flag == false) {
                            System.out.println("Telefono debe tener largo 8");
                        }
                        
                    } while (flag == false);
                    
                    do {
                        System.out.println("Ingrese correo: ");
                        mail = leer.next();
                        flag = valida.validarCorreo(mail);
                        if (flag == false) {
                            System.out.println("Correo mal ingresado(largo 6)");
                        }
                    } while (flag == false);
                    
                    System.out.println("Ingrese direccion:");
                    direccion = leer.next();
                    
                    //guardar los datos del client en el objeto
                    cliente.setRut(rut);
                    cliente.setNombre(nombre);
                    cliente.setDv(dv);
                    cliente.setDireccion(direccion);
                    cliente.setTelefono(telefono);
                    cliente.setMail(mail);
                    //Cliente cliente = new Cliente(rut, telefono, dv, nombre, mail, direccion);
                    
                    
                    System.out.println("******CLIENTE GUARDADO******");
                    System.out.println(cliente);
                    
                    break;
                    
                case 2:
                    //solicitud
                    numero = sol.obtenerNumeroSolicitud();
                    sol.setNumero(numero);
                    sol.setCliente(cliente);
                    Date fechaDate  = null;
                    do {
                        System.out.println("Ingrese fecha solicitud (dd-mm-aaaa)");
                        fecha = leer.next();
                        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
                        
                        //trycatch+tab
                        try {
                            fechaDate = formato.parse(fecha);
                            flag = valida.validarFecha(fechaDate);
                            
                        } catch (ParseException e) {
                            flag = false;
                            System.out.println("Fecha invalida (dd-mm-yyyy)");
                        }
                    } while (flag == false);
                    sol.setFecha(fechaDate);
                    
                    //Productos
                    System.out.println("Cuantos productos va a ingresar?");
                    totalProductos = leer.nextInt();
                    for (int i = 1; i <= totalProductos; i++) {
                        
                        Producto prod = new Producto();
                        codigo = 0;
                        precio = 0;
                        cantidad = 0;
                        subcategoria = "";
                        descripcion = "";
                        medida = ' ';
                        
                        do {
                            
                            System.out.println("Ingrese codigo producto: ");
                            codigo = leer.nextInt();
                            flag = valida.validarLargo4(codigo);
                            if (flag == false) {
                                System.out.println("Codigo debe tener largo 4");
                            }
                            
                        } while (flag == false);
                        
                        
                        do {
                            System.out.println("Ingrese Precio: ");
                            precio = leer.nextInt();
                            flag = valida.validarNumeroPositivo(precio);
                            if (flag == false) {
                                System.out.println("El precio debe ser positivo");
                            }
                            
                        } while (flag == false);
                        
                        do {
                            
                            System.out.println("Ingrese subcategoria(Fruta o Verdura)");
                            subcategoria = leer.next();
                            flag = valida.validarSubcategoria(subcategoria);
                            if (flag == false) {
                                System.out.println("debe ser fruta o verdura");
                            }
                            
                        } while (flag == false);
                        
                        System.out.println("Ingrese descripcion:");
                        descripcion = leer.next();
                        
                        System.out.println("Ingrese medida: (U:unidades o G: gramos)");
                        medida = leer.next().toUpperCase().charAt(0);
                        
                        if (medida == 'U') {
                            System.out.println("Ingrese unidades");
                        } else {
                            System.out.println("Ingrese gramos");
                        }
                        
                        cantidad = leer.nextInt();
                        
                        
                        //guardar los datos de productos
                        prod.setCodigo(codigo);
                        prod.setPrecio(precio);
                        prod.setSubcategoria(subcategoria);
                        prod.setDescripcion(descripcion);
                        prod.setMedida(medida);
                        prod.setCantidad(cantidad);
                        
                        sol.agregarProductos(prod);
                        System.out.println("****GUARDANDO SOLICITUD****");
                        System.out.println(sol);
                        
                    }
                    
                    break;
                    
                case 3:
                    System.out.println("Ingrese porcentaje 1-100%");
                    porcentaje = leer.nextInt();
                    descuento = sol.descontar(porcentaje);
                    System.out.println("Total: $ "+sol.getTotal());
                    System.out.println("Descuento: $ " + descuento);
                    System.out.println("------------------------");
                    System.out.println("A pagar: $ "+(sol.getTotal()-descuento));
                    break;
                    
                case 4:
                    System.out.println("");
                    System.out.println("Solicitud terminada");
                    sol.verSolicitud();
                    break;
            }
        } while (opcion != 4);
        
        
    }
    
    
}
