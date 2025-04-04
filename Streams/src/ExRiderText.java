import java.io.BufferedReader;
import java.io.FileReader;

public class ExRiderText {


    public static void main(String[] args) {
        String texto = "";
        BufferedReader entrada = null;
        try {
            entrada = new BufferedReader(new FileReader("/home/dam/Documentos/PRG/Streams/src/textoPrueba"));
            String linea=entrada.readLine();
            while (linea  != null) {
                texto = texto + linea;
                linea = entrada.readLine();
            }
            System.out.println("Texto leido: \n" + texto);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (Exception e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }

    }
}
