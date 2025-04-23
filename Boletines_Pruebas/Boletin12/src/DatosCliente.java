import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DatosCliente {
    public DatosCliente( Cliente[] clientes,String ruta) {
        ObjectOutputStream salida=null;
        try{
            salida = new ObjectOutputStream(new FileOutputStream(ruta));
           for (Cliente cl: clientes){
               salida.writeObject(cl);
           }
        }
        catch (IOException e) {
            System.out.println("Error entrada/salida: " + e.getMessage());
        }
        finally{
            try{
                if(salida != null){
                    salida.close();
                }
            }
            catch (IOException e){
                System.out.println("Error e/s: " + e.getMessage());
            }
        }


    }



}
