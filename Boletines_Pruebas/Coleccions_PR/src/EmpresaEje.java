import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmpresaEje {
    public static void  main(String[] args){
        Scanner sc= new Scanner(System.in);
        //Crear un mapa que recoge productos con sus respectivas cantidades
        Map<String, Integer> productos = new HashMap<>();
        //Añadir productos al mapa
        productos.put("Manzanas", 10);
        productos.put("Peras", 20);
        productos.put("Platanos", 30);



        //Realizar la acción según la opción elegida
        if (menu() == 1) {
            System.out.println("Introduce el nombre del producto:");
            String nombre = sc.nextLine();
            System.out.println("Introduce la cantidad del producto:");
            int cantidad = sc.nextInt();
            añadirProducto(nombre, cantidad, productos);
        } else if (menu() == 2) {
            System.out.println("Introduce el nombre del producto a eliminar:");
            String nombre = sc.nextLine();
            eliminarProducto(productos, nombre);
        } else if (menu() == 3) {
            System.out.println("Introduce el nombre del producto a actualizar:");
            String nombre = sc.nextLine();
            System.out.println("Introduce la nueva cantidad del producto:");
            int nuevaCantidad = sc.nextInt();
            actualizarProducto(productos, nombre, nuevaCantidad);
        } else if (menu() == 4) {
            mostrarProductos(productos);
        } else if (menu() == 5) {
            System.out.println("Saliendo...");
        } else {
            System.out.println("Opción no válida.");
        }
    }
    public static  int menu( ) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Seleccione una opción:");
        System.out.println("1. Añadir producto");
        System.out.println("2. Eliminar producto");
        System.out.println("3. Actualizar producto");
        System.out.println("4. Mostrar productos");
        System.out.println("5. Salir");
        int opcion = sc.nextInt();
        //Limpiar el buffer
        sc.nextLine();
        return opcion;
    }
    public static void añadirProducto( String nombre, int cantidad, Map<String, Integer> productos) {
        productos.put(nombre, cantidad);
        System.out.println("Producto añadido.");
      menu();
    }

    public static void eliminarProducto(Map<String, Integer> productos, String nombre) {
        if (productos.remove(nombre) != null) {
            System.out.println("Producto eliminado.");
        } else {
            System.out.println("El producto no existe.");
        }
        menu();
    }

    public static void actualizarProducto(Map<String, Integer> productos, String nombre, int nuevaCantidad) {
        if (productos.containsKey(nombre)) {
            productos.put(nombre, nuevaCantidad);
            System.out.println("Producto actualizado.");
        } else {
            System.out.println("El producto no existe.");
        }
        menu();
    }
    //Mostrar productos
    public static void mostrarProductos(Map<String, Integer> productos) {
        System.out.println("Productos disponibles:");
        for (Map.Entry<String, Integer> entry : productos.entrySet()) {
            String nombre = entry.getKey();
            int cantidad = entry.getValue();
            System.out.println("Producto: " + nombre + ", Cantidad: " + cantidad);


        }

    }


}
