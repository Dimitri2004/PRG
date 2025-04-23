import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EstructuraTablaNumerosBinarios {
EstructuraTablaNumerosBinarios(int[] tabla) {
    ObjectOutputStream fluxosalida = null;
    try{
        fluxosalida = new ObjectOutputStream(new FileOutputStream( "numeros.data"));
        if (tabla != null){
            for (int num: tabla){
                fluxosalida.writeInt(num);
            }
        }

    }  catch (FileNotFoundException e) {
        System.out.println("Error: " + e.getMessage());
    }  catch (IOException e) {
        System.out.println("Error : " + e.getMessage());
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
