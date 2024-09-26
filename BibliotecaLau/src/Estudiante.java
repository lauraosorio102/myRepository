public class Estudiante {


    private String nombre;
    private String Cedula;
    private String telefono;
    private String correo;


    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        this.nombre = nombre;
        Cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
    }

    public Estudiante(){

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
}
