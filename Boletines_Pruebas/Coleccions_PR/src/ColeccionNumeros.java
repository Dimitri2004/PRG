import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColeccionNumeros {
    public static void main( String[] args){
        Collection<Integer> coleccionNumeros= new ArrayList<>();
        for (int i=0; i<100; i++){
            coleccionNumeros.add((int) (Math.random()*10+1)); //Añadimos un número aleatorio entre 0 y 100
        }
        System.out.println(coleccionNumeros);
        Collection<Integer>  numerosBorrables=new ArrayList<>();
        numerosBorrables.add(5);
        numerosBorrables.add(7);
        coleccionNumeros.removeAll(numerosBorrables);
        System.out.println(coleccionNumeros);

        Integer n;
        Iterator<Integer> it=coleccionNumeros.iterator();
        for (; (it.hasNext());) {
            n = it.next();
            if (n == 3 || n == 8) it.remove();
        }
            System.out.println(coleccionNumeros);

    }
}
