import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String texto="";
        FileReader entrada = null;

        try {
            entrada = new FileReader("texto");
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
    }
}