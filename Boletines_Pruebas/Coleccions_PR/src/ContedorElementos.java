import java.util.Arrays;

public class ContedorElementos<T> implements Pila<T>{
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

}
