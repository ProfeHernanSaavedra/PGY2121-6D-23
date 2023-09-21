package Unidad2.EjemploHerencia;

/**
 *
 * @author USRVI-LC3
 */
public class Instagram extends RedSocial{
    
    private int id;
    private String historia;
    private boolean estado;

    public Instagram() {
    }

    public Instagram(int id, String historia, boolean estado, String usuario, String password) {
        super(usuario, password);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    @Override
    public String toString() {
        return "Instagram{" + "id=" + id + ", historia=" + historia + ", estado=" + estado + '}' + super.toString();
    }
    
    @Override
    public String visualizar()
    {
        return super.visualizar() + " " + this.getHistoria();
    }

    
}
