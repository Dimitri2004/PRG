import java.util.*;

public class ExemploMapa {
    public static void main(String [] args){
        Map<String,Integer> mapa =new HashMap<>(); //Creamos un mapa de tipo HashMap
        mapa.put("Ana",19);
        mapa.put("Jose",22);
        mapa.put("Manuel",30);
        mapa.put("Jaime",42); //Añadimos un elemento al mapa


        System.out.println(mapa); //Imprimimos el mapa
        System.out.println(mapa.get( "Jose")); //Imprimimos el valor de la clave Jose
        mapa.remove( "Jose"); //Eliminamos el elemento con clave Jose
        //mapa.clear();
        System.out.println(mapa); //Imprimimos el mapa
        /*
        if (mapa.containsKey( "Jose") )System.out.println("La clave existe en el mapa");
        else System.out.println("La clave no existe en el mapa");
        if (mapa.containsValue( 42) )System.out.println("Existe");
        else System.out.println(" No existe");
        */

        Set <String> claves=mapa.keySet(); //Obtenemos las claves del mapa

            System.out.println(claves); //Imprimimos la clave
        Iterator<String> itClaves=claves.iterator(); //Creamos un iterador para recorrer las claves del mapa
        for ( itClaves = claves.iterator();itClaves.hasNext();){ //Recorremos las claves del mapa
            String clave=itClaves.next(); //Obtenemos la clave
            System.out.println(clave); //Imprimimos la clave
        }
        Collection<Integer> valores=mapa.values(); //Obtenemos los valores del mapa
            System.out.println(valores); //Imprimimos el valor
        Iterator<Integer> itValores=valores.iterator(); //Creamos un iterador para recorrer los valores del mapa
        for ( itValores = valores.iterator();itValores.hasNext();){ //Recorremos los valores del mapa
            Integer valor=itValores.next(); //Obtenemos el valor
            System.out.println(valor); //Imprimimos el valor
        }

        Set <Map.Entry<String,Integer>> entradas=mapa.entrySet(); //Obtenemos las entradas del mapa
            System.out.println(entradas); //Imprimimos las entradas
        Iterator<Map.Entry<String,Integer>> it=entradas.iterator(); //Creamos un iterador para recorrer las entradas del mapa
        for ( it = entradas.iterator();it.hasNext();){ //Recorremos las entradas del mapa


            Map.Entry<String,Integer> elemento=it.next(); //Obtenemos la entrada
            System.out.println(elemento.getKey()+ " : "+ elemento.getValue()); //Imprimimos la clave y el valor
            if ( elemento.getValue()<20) it.remove(); //Si el valor es menor que 20 lo eliminamos
        }
        System.out.println(mapa); //Imprimimos el mapa
    }
}
