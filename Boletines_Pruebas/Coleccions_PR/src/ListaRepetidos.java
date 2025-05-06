import java.util.ArrayList;
import java.util.List;

public class ListaRepetidos {
    /**
     * #Crear una lista del 1-10 numeros
     * #recoger en una lista los que se repitan
     * #recoger en una lista los que no se repitan
     * #recoger en una lista los que solo aparezan 1 vez
     **/

    public static void main (String [] args){
        List<Integer> numeros = new ArrayList<>();
        List<Integer> repetidos = new ArrayList<>();
        List<Integer> noRepetidos = new ArrayList<>();
        List<Integer> soloUnaVez = new ArrayList<>();

        for (int i=0; i<10; i++){
            numeros.add((int) (Math.random()*10+1)); //Añadimos un número aleatorio entre 0 y 10
        }
        System.out.println(numeros);

        for (int i=0; i<numeros.size(); i++){
            if (repetidos.contains(numeros.get(i))){
                continue;
            }else if (numeros.indexOf(numeros.get(i)) != numeros.lastIndexOf(numeros.get(i))){
                repetidos.add(numeros.get(i));
            }else{
                noRepetidos.add(numeros.get(i));
            }
        }

        for (int i=0; i<repetidos.size(); i++){
            if (noRepetidos.contains(repetidos.get(i))){
                noRepetidos.remove(repetidos.get(i));
            }
        }

        System.out.println("Los números repetidos son: " + repetidos);
        System.out.println("Los números no repetidos son: " + noRepetidos);

    //queremos guardar en la ultima lista solo los numero del 1-7
        for (int i=0; i<noRepetidos.size(); i++){
            if (noRepetidos.get(i) > 7){
                noRepetidos.remove(noRepetidos.get(i));
            }
        }

        System.out.println("Los números que solo aparecen una vez son: " + noRepetidos);
    }

}
