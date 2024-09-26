import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce el código del libro: ");
        String codigoConsulta = scanner.nextLine();

        Libro libroEncontrado = biblioteca.consultarLibroPorCodigo(codigoConsulta);

        if (libroEncontrado != null) {
            System.out.println("Libro encontrado: " + libroEncontrado);
        } else {
            System.out.println("Libro no encontrado.");
        }
    }
}