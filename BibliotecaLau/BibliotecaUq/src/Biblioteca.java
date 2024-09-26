import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Biblioteca {


    private String nombre;

    private List<Libro> libros;

    public Biblioteca(String nombre, List<Libro> libros) {
        this.nombre = nombre;
        this.libros = libros;
    }

    public Biblioteca(){
        libros = new ArrayList<>();

        libros.add(new Libro("001", "978-3-16-148410-0", "Cervantes", "El Quijote", "Editorial 1", new Date(1605 - 1900, 9, 1), 5));
        libros.add(new Libro("002", "978-3-16-148410-1", "Gabriel García Márquez", "Cien años de soledad", "Editorial 2", new Date(1967 - 1900, 5, 30), 3));
        libros.add(new Libro("003", "978-3-16-148410-2", "George Orwell", "1984", "Editorial 3", new Date(1949 - 1900, 5, 8), 2));

    }

    public Libro consultarLibroPorCodigo(String codigo) {
        for (Libro libro : libros) {
            if (libro.getCodigo().equals(codigo)) {
                return libro;
            }
        }
        return null;
    }
}
