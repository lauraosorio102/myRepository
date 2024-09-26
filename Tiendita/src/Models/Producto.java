package Models;

public class Producto {

    private String nombre;
    private double precio;
    private String tipo;

    public Producto(String nombre, double precio, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    //calcular precio del producto
    public static double calcularPrecioventa(String tipo, double precioventa) {

        if(tipo.equals("refrigerado")) {
            return (precioventa * 0.10) + precioventa;
        }

        if (tipo.equals("perecedero")) {
            return (precioventa * 0.15) + precioventa;
        }

        return (precioventa * 0.05) + precioventa;
    }
}
