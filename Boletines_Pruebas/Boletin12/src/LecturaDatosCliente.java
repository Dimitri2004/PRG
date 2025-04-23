import java.io.*;

public class LecturaDatosCliente {
    public LecturaDatosCliente(String enlace) {
        ObjectInputStream entrada = null;
        try {
            entrada = new ObjectInputStream(new FileInputStream(enlace));
            Cliente cliente;
            while (true) {
                cliente = (Cliente) entrada.readObject();
                System.out.println(cliente);
            }
        } catch (EOFException e) {
            System.out.println("Fin de fichero");
        } catch (FileNotFoundException e) {
            System.out.println("Error busqueda: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error entrada/Salida: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Error de clase: " + e.getMessage());
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println("Error e/s: " + e.getMessage());
            }
        }

    }
}
