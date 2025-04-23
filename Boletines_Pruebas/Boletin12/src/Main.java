import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        opcion();
    }
    public static void opcion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escrive el numero a la opcion correspondiente: "
                + "\n1. Añadir cliente"
                + "\n2. Modificar cliente"
                + "\n3. Eliminar cliente"
                + "\n4. Listar clientes");
        int opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Añadir cliente");
                Cliente[] cliente =new Cliente[0];
                    cliente[0] = new Cliente();

                new DatosCliente( cliente, "clientes.txt");
                break;
            case 2:
                System.out.println("Modificar cliente");
                // Implementar la lógica para modificar un cliente
                break;
            case 3:
                System.out.println("Eliminar cliente");
                // Implementar la lógica para eliminar un cliente
                break;
            case 4:
                System.out.println("Listar clientes");
                LecturaDatosCliente lecturaDatosCliente = new LecturaDatosCliente("clientes.txt");
                break;
            default:
                System.out.println("Opción no válida");
        }


    }

}