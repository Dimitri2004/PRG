import java.util.ArrayList;
import java.util.List;

public class ListaNumeros {
    public static void main(String[] args) {
        List<Integer> listaEnteros= new ArrayList<>();
        listaEnteros.add(3);
        listaEnteros.add(5);
        listaEnteros.add(7);
        listaEnteros.add(7);
        listaEnteros.add(11);
        listaEnteros.add(13);

        System.out.println(listaEnteros);
        listaEnteros.add(3,7);
        listaEnteros.set(3,44);
        System.out.println(listaEnteros.get(3));
        listaEnteros.addAll(5,listaEnteros);
        System.out.println(listaEnteros);
        System.out.println(listaEnteros.remove(1));
        System.out.println(listaEnteros.indexOf(9));

    }
}
