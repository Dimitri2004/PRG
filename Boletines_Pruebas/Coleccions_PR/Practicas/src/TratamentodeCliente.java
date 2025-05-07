import java.util.*;

import static java.util.Collections.sort;

/**
 * Aprendiendo ArrayList
 * @author Oliver Miguez Alonso
 */
public class TratamentodeCliente {
    public static void main(String[] args) {
        //De momento solo lo declaramos como collection y no como list
        Collection<Cliente> coleccionCliente;
        //creamos un arrayList
        coleccionCliente = new ArrayList<>();
        //Añade al array 3 nuevos clientes, ya que la lista solo permite añadir objetos formato "CLIENTE"
        //el add devuelve true si se añadió o se modificó el tamaño del array a la lista y falso si la lista se mantiene igual y no cambia es decir si no se añade
        coleccionCliente.add(new Cliente("00000000T", "Oliver", "03/06/2006"));
        coleccionCliente.add(new Cliente("12345678Y", "Pepe", "02/05/2005"));
        coleccionCliente.add(new Cliente("87654321R", "Arturo", "01/04/2004"));

        //creamos un nuevo cliente
        Cliente unCliente = new Cliente("77777777W", "Jaime", "06/11/2000");
        coleccionCliente.add(unCliente);//lo añadimos al arrayList
        //quitamos un cliente al arrayList
        coleccionCliente.remove(unCliente);
        System.out.println(coleccionCliente.toString());
        //Muestra el total de objetos que tiene la colección
        System.out.println(coleccionCliente.size());
        //Muestra si está o no vacía
        System.out.println(coleccionCliente.isEmpty());
        //Verifica si contiene un determinado elemento
        System.out.println(coleccionCliente.contains(unCliente));

        Object[] Clientes = coleccionCliente.toArray();

        Iterator<Cliente> indice = coleccionCliente.iterator();

        for (; indice.hasNext(); ) {
            Cliente cliente = indice.next();
            System.out.println(cliente.toString());
            //System.out.println(cliente.edade());
            //System.out.println(cliente.compareTo(unCliente));
            //System.out.println(cliente.equals(unCliente));

        }
        //elimina el cliente creado que fue añadido al arrayList
        coleccionCliente.remove(unCliente);

        //Tamaño el array con size
        System.out.println(coleccionCliente.size());
        //elimina cualquier elemento que tenga el ArrayList
        coleccionCliente.clear();
        //Referencia a cada elemento del array
        Object[] clientes = coleccionCliente.toArray();

//        Collection<Cliente> outrosClientes = new ArrayList<>();
//        outrosClientes.add(new Cliente("00000000T","Jaima","09/06/2006"));
//        outrosClientes.add(new Cliente("12345678Y","Pepa","12/05/2005"));
//        outrosClientes.add(new Cliente("87654321R","Susi","07/04/2004"));

        TreeSet<Cliente> conjuntoClientes = new TreeSet<>();
        conjuntoClientes.add(new Cliente("00000000T", "Oliver", "03/06/2006"));
        coleccionCliente.add(new Cliente("12345678Y", "Pepe", "02/05/2005"));
        coleccionCliente.add(new Cliente("87654321R", "Arturo", "01/04/2004"));
        conjuntoClientes.add(unCliente);
        System.out.println(conjuntoClientes);
        System.out.println(conjuntoClientes.add(unCliente));

    //Collections.sort(coleccionCliente, new ComparadorDni());
    // System.out.println(coleccionCliente);
    //int ref = Collections.binarySearch(coleccionCliente, new Cliente( "00000000T", "Oliver", "03/06/2006"),new ComparadorDni());
    //System.out.println(ref);



    }
}//end class
