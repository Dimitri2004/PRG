import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String texto="";
        FileReader entrada = null;
        try {
            entrada = new FileReader("/home/dam/Documentos/PRG/Streams/src/textoPrueba");
            int caracter;
            caracter = entrada.read();
            while (caracter != -1) {
                texto = texto + (char) caracter;
                caracter = entrada.read();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
        System.out.println("Texto leido: \n" + texto);
    }

    // int[] tabla = {1, 2, 3, 4, 5};

}