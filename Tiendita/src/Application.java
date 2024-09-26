import Models.Producto;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();

        //mostrar los mensajes de preguntas
        while (true) {
            System.out.println("Registro de productos en la tienda");
            System.out.print("Ingrese el nombre del producto: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio de compra: ");
            double precio = Double.parseDouble(scanner.nextLine());

            System.out.print("Ingrese el tipo de producto (refrigerado, perecedero, no perecedero): ");
            String tipo = scanner.nextLine();

            int precioFinal= (int) Producto.calcularPrecioventa(tipo, precio);
            System.out.println("Precio de venta del producto es: " + precioFinal);

            // Crear y agregar producto a la lista
            Producto producto = new Producto(nombre, precio, tipo);
            productos.add(producto);

            System.out.println("Models.Producto registrado con éxito.");
        }
    }
}

