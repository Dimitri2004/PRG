import java.io.*;

public class LectorDeParesImpares {
    ObjectInputStream flujoentradaPares = null;
    ObjectInputStream flujoentradaImpares = null;

    public LectorDeParesImpares(String rutaFichero) {
        //Distribuir los numeros del fichero para separar en dos ficheros uno de pares y otro de impares

        try {
            flujoentradaPares = new ObjectInputStream(new FileInputStream(rutaFichero));
            flujoentradaImpares = new ObjectInputStream(new FileInputStream(rutaFichero));
            while (true) {
                System.out.println(flujoentradaImpares.readInt());
            }

        }catch (FileNotFoundException e){
            System.out.println("Error archivo no encontrado " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("Error : sin datos " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (flujoentradaPares != null) {
                    flujoentradaPares.close();
                }
                if (flujoentradaImpares != null) {
                    flujoentradaImpares.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }
}
