import javax.imageio.IIOException;
import java.io.*;

public class LecturaTablaNumerosBinarios {
    public LecturaTablaNumerosBinarios (String rutaFichero){
        ObjectInputStream flujoentrada = null;
        try {
            flujoentrada = new ObjectInputStream(new FileInputStream(rutaFichero));
            while (true){
                System.out.println(flujoentrada.readInt());
           }
        } catch (FileNotFoundException e) {
            System.out.println("Error no encontrado " + e.getMessage());
        } catch (EOFException e) {
            System.out.println("Error sin datos " + e.getMessage());
        } catch (IOException e){
            System.out.println("Error  " + e.getMessage());
        }finally {
            try {
                if (flujoentrada != null) {
                    flujoentrada.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }

}
