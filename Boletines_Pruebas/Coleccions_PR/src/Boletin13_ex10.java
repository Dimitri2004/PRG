import java.awt.*;
import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/*
*Creamos productos en un formato y les aplicamos lectura de fichero
* @author Dima Aparicio
*/
public class Boletin13_ex10 {
    Map<String, Integer> existencias;//Creamos el controller del tipo map
    String fichero;

    public Boletin13_ex10(String fichero) {
        this.fichero = fichero;//asignamos fichero
        //this.existencias = cargarMapa();//cargamos mapa
        this.existencias = cargarCollection();
    }

    public Map<String, Integer> cargarMapa() {
        Map<String, Integer> ex = new TreeMap<>();
        ObjectInputStream fEntrada = null;
        try {
            fEntrada = new ObjectInputStream(new FileInputStream(fichero)); //Queremos convertirlo en una serie de bits para leerlos
            ex = (Map<String, Integer>) fEntrada.readObject(); //recoge los datos de tipo Pieza y los lee hasta que se quede sin datos

        } catch (FileNotFoundException e) {
            System.out.println("Error archivo no creado " + e);
            ex = new TreeMap<String, Integer>();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error objeto/class no encontrado " + e);
        } finally {
            try {
                if (fEntrada != null) {
                    fEntrada.close();//cerramos el lector
                }
            } catch (IOException e) {
                System.out.println("Error " + e);
            }
        }
        return ex;
    }//fin cargar Mapa

    public Map<String, Integer> cargarCollection() {
        Map<String, Integer> ex = new TreeMap<>();
        ObjectInputStream fEntrada = null;
        try {
            fEntrada = new ObjectInputStream(new FileInputStream(fichero)); //Queremos convertirlo en una serie de bits para escribirlos

            while (true) {
                Peza peza = (Peza) fEntrada.readObject();
                if (peza == null)break;
                ex.put( peza.referencia, peza.cantidad);

            }
        }catch( ClassNotFoundException e ) {
            System.out.println("Error clase erro "+e);
         }catch( FileNotFoundException e){
        System.out.println("No encontrado el archivo " + e);
        } catch(IOException e){
            System.out.println("Error salida/entrada "+e);
        }
        finally {
            try {
                if (fEntrada != null) {
                    fEntrada.close();//cerramos el escritor
                }
            }catch (IOException e){
                System.out.println("Error "+e);
            }
        }
        return ex;
    }//fin guardar Mapa
    public void guardarCollection(Map<String,Integer> existencias){
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


    public boolean altaProducto( String referencia){
        if (existencias.containsKey(referencia)) return false;
        else{
            existencias.put(referencia,0);//Primera posicion
            return true;
        }
    }

    public boolean bajaProducto( String referencia){
        if (!existencias.containsKey(referencia)) return false;
        else{
            existencias.remove(referencia);//Primera posicion
            return true;
        }
    }
    public boolean cambioStock(String referencia,int cantidade){
        if (!existencias.containsKey(referencia)) return false;
        else{
            existencias.replace(referencia,cantidade);
            return true;
        }
    }

    public class Peza implements Serializable{

        String referencia;
        Integer cantidad;

        public Peza(String referencia, Integer cantidad) {

            this.referencia = referencia;
            this.cantidad = cantidad;

        }
    }


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Boletin13_ex10 exemplo= new Boletin13_ex10("recambiosOliver.dot");
        Boletin13_ex10 exemplo2=new Boletin13_ex10("recambiosManuela.odt");
        int opcion;
        do{
            System.out.println("1.Alta Producto");
            System.out.println("2.Baja Producto");
            System.out.println("3.Cambio cantidade Producto");
            System.out.println("4.Lista Productos");
            System.out.println("5.Salir");
            System.out.println("Introduce opcion: ");
            opcion=sc.nextInt();

            switch (opcion){
                case 1 ->{
                    System.out.println("Codigo producto: ");
                    String ref=sc.next();
                    exemplo2.altaProducto(ref);
                }
                case 2 ->{
                    System.out.println("Que producto queremos eliminar");
                    String ref = sc.next();
                    exemplo2.bajaProducto(ref);
                }
                case 3->{
                    System.out.println("Que producto quieres cambiar");
                    String ref= sc.next();
                    System.out.println("Cuanta cantidad");
                    int cantidad=sc.nextInt();
                    exemplo2.cambioStock(ref,cantidad);
                }
                case 4->{
                    System.out.println(exemplo2.existencias);
                }

            }
        }while(opcion != 5);

        exemplo.guardarCollection(exemplo2.existencias);


    }




}
