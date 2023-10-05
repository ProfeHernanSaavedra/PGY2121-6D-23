/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad2.Herencia.Ejercicio233;

/**
 *
 * @author USRVI-LC3
 */
public class Principal {
    
    public static void main(String[] args) {
        
        Abarrote arroz = new Abarrote(2, 1, 2500, 2, "Arroz G2");
        Aseo poett = new Aseo("liquido", 2, 3000, 2, "Poett lavanda");
        Congelado helado = new Congelado(-18, 3, 5000, 5,"helado centella");
        Liquido cocaCola = new Liquido(0, 4, 1500,3, "Coca Cola Zero");
        Oferta pan = new Oferta(10, 5, 1200, 2,"pan corriente");
        Oferta fideo = new Oferta(15, 6, 2500, 2,"fideo n 5");
        
        Coleccion col = new Coleccion();
        col.agregarProductos(arroz);
        col.agregarProductos(poett);
        col.agregarProductos(helado);
        col.agregarProductos(cocaCola);
        col.agregarProductos(pan);
        col.agregarProductos(fideo);
        
        col.calcularTotalOferta();
        System.out.println("*****");
        col.listarProductos();
        
        System.out.println("**COMENTARIOS**");
        arroz.comentarios("BUEEENNAA");
        helado.comentarios("rico!!! ");
        
        arroz.listar();
    }
    
}
