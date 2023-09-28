
package Unidad2.EjemploColeccion.Revisando231;

import java.util.Date;

/**
 *
 * @author 
 */
public class Evento {
    
    private int codigo;
    private Date fecha;
    private Date horaInicio;
    private Date horaFin;
    private String ubicacion;
    private int precio;
    private int cantidadPersonas;
    private String tipoEvento;//cumpleaños, matrimonio,cena o fiesta
    private boolean incluyeEntretencion;

    public Evento() {
    }

    public Evento(int codigo, Date fecha, Date horaInicio, Date horaFin, String ubicacion, int precio, int cantidadPersonas, String tipoEvento, boolean incluyeEntretencion) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.ubicacion = ubicacion;
        this.precio = precio;
        this.cantidadPersonas = cantidadPersonas;
        this.tipoEvento = tipoEvento;
        this.incluyeEntretencion = incluyeEntretencion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public boolean isIncluyeEntretencion() {
        return incluyeEntretencion;
    }

    public void setIncluyeEntretencion(boolean incluyeEntretencion) {
        this.incluyeEntretencion = incluyeEntretencion;
    }

    @Override
    public String toString() {
        return "Evento{" + "codigo=" + codigo + ", fecha=" + fecha + ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + ", ubicacion=" + ubicacion + ", precio=" + precio + ", cantidadPersonas=" + cantidadPersonas + ", tipoEvento=" + tipoEvento + ", incluyeEntretencion=" + incluyeEntretencion + '}';
    }
    
    
    
    
    
    
    
    
    
}
