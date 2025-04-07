
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.IOException;
import java.io.ObjectOutputStream;

public class EstructuraNumericoParaDistribucion {
    //Distribuir los numeros del fichero para separar en dos ficheros uno de pares y otro de impares
    ObjectOutputStream flujoSalidaPares = null;
    ObjectOutputStream flujoSalidaImpares = null;

    public EstructuraNumericoParaDistribucion(int[] tabla) {
        try {
            flujoSalidaPares = new ObjectOutputStream(new FileOutputStream("numerosPares.data"));
            flujoSalidaImpares = new ObjectOutputStream(new FileOutputStream("numerosImpares.data"));
            if (tabla != null) {
                for (int num : tabla) {
                    if (num % 2 == 0) {
                        flujoSalidaPares.writeInt(num);
                    } else {
                        flujoSalidaImpares.writeInt(num);
                    }
                }
            }

        } catch (FileNotFoundException e) {

            System.out.println("Error archivo no encontrado " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {
                if (flujoSalidaPares != null) {
                    flujoSalidaPares.close();
                }
                if (flujoSalidaImpares != null) {
                    flujoSalidaImpares.close();
                }
            } catch (IOException e) {
                System.out.println("Error cerrando archivo: " + e.getMessage());
            }
        }
    }


}
