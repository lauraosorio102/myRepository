public class Bibliotecario {


    private String nombre;
    private String Cedula;
    private String telefono;
    private String correo;
    private double salario;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario) {
        this.nombre = nombre;
        Cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.salario = salario;
    }

    public Bibliotecario(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
