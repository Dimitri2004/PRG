import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class NumerosEnterosPositivos {
    public static void main(String[] args){
        List<Integer> numeros=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        for (int i=0; i<10000; i++){
            System.out.println("Introduce un número entero positivo:");
            int n=sc.nextInt();
            if (n>0 && n%2==0){
                numeros.add(n);
            }
        }
        //añadimos a la lista los numeros enteros positivos de indice par
        System.out.println("Los números enteros positivos de índice par son:");
        Iterator<Integer> it=numeros.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //mostramos los numeros enteros positivos de indice par


    }
}
