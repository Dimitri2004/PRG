import java.util.Arrays;

public class ContedorElementos<T> implements Pila<T>, Cola<T>{
    private T[] objetos;

    public ContedorElementos(T[] objetos){
        this.objetos=objetos;
    }

    public void apilar (T novo){
        objetos= Arrays.copyOf(objetos,objetos.length+1);
        objetos [objetos.length-1]=novo;

    }
    public T desapilar(){
        T res=null;
        if (objetos.length>0){
            res=objetos[objetos.length-1];
            objetos=Arrays.copyOf(objetos,objetos.length-1);
        }
        return res;
    }
    public void encolar(T novo){
        apilar(novo);
    }
   public  T desencolar(){
        T res=null;
       if (objetos.length>0){
           res=objetos[0];
           objetos=Arrays.copyOfRange(objetos,1,objetos.length-1);
       }
       return res;
    }

}
