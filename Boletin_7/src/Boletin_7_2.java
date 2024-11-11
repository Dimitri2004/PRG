
import java.util.Random;

import static java.lang.Long.sum;

public class Boletin_7_2 {
    public static void main(String[] args) {
        notas();
    }

    static void notas() {
        int[] nota = new int[30];/**Damos a una variable arrays el valor que la delimita**/
        for (int i = 1; i < nota.length; i++) {
            nota[i] = (int) Math.floor(Math.random() * 10) + 1;

            if (nota[i] < 5) {
                System.out.println("Suspenso =" + nota[i]);
            } else if (nota[i] == 10) {
                System.out.println("La maxima nota = " + nota[i]);
            } else {
                System.out.println("Aprobado = " + nota[i]);
            }
        }
            int ciclo = 0, num = 0, res = 0;
            Random aleatorio = new Random();
            String imprimir = "Suma de N numeros aleatorios: \n";

            for (int i = 0; i < nota.length; i++) {
                nota[i] = (int) Math.floor(Math.random() * 10) + 1;
                num = nota[i];
                imprimir = imprimir + num + "\n";
                res = res + num;
            }

            System.out.println(res);
        }

    }

