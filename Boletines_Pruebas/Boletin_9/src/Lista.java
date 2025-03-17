import java.util.Arrays;

public class Lista {
    private int[] lista;
    public Lista(){
        this.lista=new int[5];
    }
    public int numeroElementos(){
        return lista.length;
    }
    public void insertarFinal(int novo){
        int[] novaLista=new int[numeroElementos()+1];
        System.arraycopy(lista,0,novaLista,0,lista.length);
            lista[lista.length-1]=novo;

    }
    //Insertar el primero
    public void insertarPrimero(int novo){
        int[] novaLista=new int[numeroElementos()+1];
        System.arraycopy(lista,0,novaLista,1,lista.length);
        lista[0]=novo;
    }
    //Borrar el primer elemento
    public int borrarPrimero(){
        if(numeroElementos()==0){
            System.out.println("La lista está vacía");
            return -1;
        }
        else{
            int valorElemento=lista[0];
            lista=Arrays.copyOfRange(lista,1,numeroElementos());
            return valorElemento;
        }
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
