import java.util.Date;

public class DetallePrestamo {

    private String hora;
    private byte cantidad;
    private double costo;
    private String nombre;
    private Date fecha;

    public DetallePrestamo(String hora, byte cantidad, double costo, String nombre, Date fecha) {
        this.hora = hora;
        this.cantidad = cantidad;
        this.costo = costo;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public DetallePrestamo(){

    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
