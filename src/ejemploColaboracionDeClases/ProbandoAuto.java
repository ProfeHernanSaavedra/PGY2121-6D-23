/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploColaboracionDeClases;

/**
 *
 * @author USRVI-LC3
 */
public class ProbandoAuto {
    
    public static void main(String[] args) {
        
        Auto autito = new Auto("AUDI", "GRIS", "A4", 2005);
        Conductor conductor1 = new Conductor("JUAN",123456, 25, true, autito);
        
        System.out.println(conductor1.getNombre()+" conduce un " + conductor1.getAutito().getMarca());
        
        
    }
    
}
