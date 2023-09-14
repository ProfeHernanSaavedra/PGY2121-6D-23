package Unidad2.EjemploScooting;

/**
 *
 * @author Profe Hernan
 */
public class Empleado {
    
    private String rut,nombre;
    private char genero; //'M':masculino, 'F':femenino, 'O':otros
    private int annoServicio,edad;
    private Puesto puesto;

    public Empleado() {
    }

    public Empleado(String rut, String nombre, char genero, int annoServicio, int edad, Puesto puesto) {
        this.rut = rut;
        this.nombre = nombre;
        this.genero = genero;
        this.annoServicio = annoServicio;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getAnnoServicio() {
        return annoServicio;
    }

    public void setAnnoServicio(int annoServicio) {
        this.annoServicio = annoServicio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return puesto;
    }

    public void setPuesto(Puesto puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "rut=" + rut + ", nombre=" + nombre + ", genero=" + genero + ", annoServicio=" + annoServicio + ", edad=" + edad + ", puesto=" + puesto + '}';
    }
    
    
    
}
