/*
-Construcotr con taboa con 0 elementos
-obter numero de elementos
-insertar numero o final da lista
-insertar numero o principio da lista
-insertar numero en lugar da lista  especificado por un indice
-obter un elemento especificado por un indice
buscar un numero na lista devoltando o indice do primeiro luganr onde se encontre
-devvoltara -1 si non o encontra
-mostra elementos da lista por consola
 */

import java.util.Arrays;

public class Lista {
    private int[] lista;
    public Lista(){
        this.lista=new int[0];
    }
    public int numeroElementos(){
        return lista.length;
    }
    public void insertarFinal(int novo){
        int[] novaLista=new int[numeroElementos()+1];
        System.arraycopy(lista,0,novaLista,0,lista.length);
            lista[lista.length-1]=novo;

    }
    //Para borrar el ultimo elemento
    public int borrarUltimo( ){
           if(numeroElementos()==0){
               System.out.println("La lista está vacía");
               return -1;
           }
           else{
               int valorElemento=lista [numeroElementos()-1];
               lista= Arrays.copyOf(lista,numeroElementos()-1);
               return valorElemento;

           }
    }
}
