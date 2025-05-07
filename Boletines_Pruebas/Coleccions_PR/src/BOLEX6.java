import java.util.*;
import java.util.stream.Collectors;

public class BOLEX6 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random() * 10) + 1); //Añadimos un número aleatorio entre 1 y 10
        }
        System.out.println("Lista original: " + lista);

        Comparator<Integer> c = Comparator.naturalOrder();
        lista.sort(c);
        System.out.println("Lista ordenada: " + lista);

  //utilizndo el Set crear listas de numeros repetidos y no repetidos
        Set<Integer> repetidos = new HashSet<>();
        Set<Integer> noRepetidos = new HashSet<>();

        for (Integer num : lista) {
            if (!noRepetidos.add(num)) {
                repetidos.add(num);
            }
        }
        // Eliminar los números repetidos de la lista original
        lista.removeAll(repetidos);
        // Convertir el Set de no repetidos a una lista
        noRepetidos = new HashSet<>(lista);
        // Convertir el Set de repetidos a una lista
        repetidos = new HashSet<>(repetidos);


        System.out.println("Números repetidos: " + repetidos);
        System.out.println("Números no repetidos: " + noRepetidos);

        //numeros del 1-7
        List<Integer> numerosDel1Al7 = noRepetidos.stream()
                .filter(num -> num >= 1 && num <= 7)
                .collect(Collectors.toList());
        System.out.println("Números del 1 al 7: " + numerosDel1Al7);













    }

}
