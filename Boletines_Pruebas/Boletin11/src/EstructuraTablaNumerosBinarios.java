import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class EstructuraTablaNumerosBinarios {
EstructuraTablaNumerosBinarios (int[] tabla) {
    ObjectOutputStream fluxosalida = null;
    try{
        fluxosalida = new ObjectOutputStream(new FileOutputStream( "numeros.bin"));

    }
    catch (Exception e){
        System.out.println("Error: " + e.getMessage());
    }
    finally{
        try{
            if(fluxosalida != null){
                fluxosalida.close();
            }
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }


}



}
