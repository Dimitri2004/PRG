import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDeBufferNumerico {

    //Entrar en el fichero y cambiar sus caracteres a numeros
    public ReaderDeBufferNumerico(String rutaArchivo) {
        BufferedReader entrada = null;

        try {

            entrada = new BufferedReader(new FileReader(rutaArchivo));

            String linea = entrada.readLine();
            while (linea != null) {
                for (int i = 0; i < linea.length(); i++) {
                    // Convertir el caracter a su valor numerico
                    int numero = Character.getNumericValue(linea.charAt(i));
                    rutaArchivo = rutaArchivo + numero;
                }
                linea = entrada.readLine();
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
        //Calcular su media y suma
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < rutaArchivo.length(); i++) {
            suma += Character.getNumericValue(rutaArchivo.charAt(i));
            contador++;
        }
        double media = (double) suma / contador;
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
    }

    public String leerTexto(String rutaArchivo) {
        return rutaArchivo;
    }
}
