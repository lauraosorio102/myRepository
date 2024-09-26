public class Prestamo {

    private String libro ;
    private String string;

    public Prestamo(String libro, String string) {
        this.libro = libro;
        this.string = string;
    }

    public Prestamo(){

    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
