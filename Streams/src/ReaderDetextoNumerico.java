import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderDetextoNumerico {
    //Entrar en el fichero y cambiar sus caracteres a numeros


    public static void main(String[] args) {
        String texto = "";
        FileReader entrada = null;

        try {
            entrada = new FileReader("/home/dam/Documentos/PRG/Streams/src/textoPruebaNumerica");
            int caracter;
            caracter = entrada.read();
            while (caracter !=-1) {
                // Convertir el caracter a su valor numerico
                int numero = Character.getNumericValue((char) caracter);
                texto = texto + numero;
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
        //Calcular su media y suma

        int suma = 0;
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            suma += Character.getNumericValue(texto.charAt(i));
            contador++;
        }
        double media = (double) suma / contador;
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);

    }
}
