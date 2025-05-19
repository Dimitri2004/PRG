
import java.io.*;

import java.util.Iterator;

import java.util.Map;

import java.util.Set;
import java.util.TreeMap;

/*
*Creamos productos en un formato y les aplicamos lectura de fichero
* @author Dima Aparicio
*/
public class Boletin13_ex5_6 {
    Map<String,Integer> existencias=new TreeMap<>();//Creamos el controller del tipo map
    String fichero;

    public Map<String,Integer> cargarColeccion(){
        Map<String,Integer> ex= new TreeMap<>();
        ObjectInputStream fEntrada=null;
        try{
           fEntrada = new ObjectInputStream(new FileInputStream(fichero)); //Queremos convertirlo en una serie de bits para leerlos
            while(true){
              Peza  peza  = (Peza) fEntrada.readObject(); //recoge los datos de tipo Pieza y los lee hasta que se quede sin datos
                if (peza == null) break;
                ex.put(peza.referencia, peza.cantidad);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no creado "+e);
        }catch (IOException | ClassNotFoundException e){
            System.out.println("Error objeto/class no encontrado "+e);
        }
        finally {
            try {
                if (fEntrada != null) {
                    fEntrada.close();//cerramos el lector
                }
            }catch (IOException e){
                System.out.println("Error "+e);
            }
        }
        return ex;
    }//fin cargar Mapa

    public void guardarColeccion(Map<String,Integer> existencias){
        ObjectOutputStream fSalida=null;
        try {
            fSalida = new ObjectOutputStream(new FileOutputStream(fichero)); //Queremos convertirlo en una serie de bits para escribirlos
            fSalida.writeObject(existencias); //recoge los datos de tipo Pieza y los escribimos
        }catch (FileNotFoundException e){
            System.out.println("No encontrado el archivo "+e);
        } catch (IOException e) {
            System.out.println("Error salida/entrada "+e);
        }
        finally {
            try {
                if (fSalida != null) {
                    fSalida.close();//cerramos el escritor
                }
            }catch (IOException e){
                System.out.println("Error "+e);
            }
        }
    }//fin guardar Mapa
    public void guardarCollection(){
        ObjectOutputStream fSalida=null;
        try{
            fSalida = new ObjectOutputStream(new FileOutputStream(fichero)); //Queremos convertirlo en una serie de bits para leerlos

            Set<String> referencias = existencias.keySet();

            for (String s: referencias){
                Peza p=new Peza(s,existencias.get(s));
                fSalida.writeObject(p);
            }
           /*
           for(Iterator<String> it = referencias.iterator(); it.hasNext();){
               String r=it.next();
              Peza p=new Peza(r,existencias.get(r));
                fSalida.writeObject(p); //recoge los datos de tipo Pieza y los escribe los objetos hacia el fichero
            }
            */
        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no creado "+e);
        }catch (IOException e){
            System.out.println("Error objeto/class no encontrado "+e);
        }
        finally {
            try {
                if (fSalida != null) {
                    fSalida.close();
                }
            }catch (IOException e){
                System.out.println("Error "+e);
            }
        }



    }//fin guardarCollection()

    private class Peza implements Serializable{

        String referencia;
        Integer cantidad;

        public Peza(String referencia, Integer cantidad) {

            this.referencia = referencia;
            this.cantidad = cantidad;

        }
    }


    public static void main(String[] args){



    }
}
