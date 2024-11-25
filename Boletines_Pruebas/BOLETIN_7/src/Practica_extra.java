import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
public class Practica_extra {
    public static void main(String[] args) {
        int j=0;
        int[] tabla = new int[11];
            tabla[0] = (int) Math.floor(Math.random() * 10);
            tabla[1] = (int) Math.floor(Math.random() * 10);
            tabla[2] = (int) Math.floor(Math.random() * 10);
            tabla[3] = (int) Math.floor(Math.random() * 10);
            tabla[4] = (int) Math.floor(Math.random() * 10);
            tabla[5] = (int) Math.floor(Math.random() * 10);
            tabla[6] = (int) Math.floor(Math.random() * 10);
            tabla[7] = (int) Math.floor(Math.random() * 10);
            tabla[8] = (int) Math.floor(Math.random() * 10);
            tabla[9] = (int) Math.floor(Math.random() * 10);
            tabla[10] = (int) Math.floor(Math.random() * 10);
            System.out.println("La tabla generada es: " + Arrays.toString(tabla));
            ;
//        for (int i = 0; i < tabla.length; i++) {}
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime que numero quieres que compruebe en la tabla:");
            int n = sc.nextInt();

            int position = -1;


            for (j = 0; j < tabla.length+1; j++) {
                if (tabla[j] == n) {
                    position = j;
                    break;
                }
            }

            if (position != -1) {
                System.out.println("El número " + n + " está en la posición " + (position + 1));
            } else {
                int posicionMenor = -1;
                int posicionMayor = -1;
                for (int k = 0; k < tabla.length -1; k++) {
                    if (tabla[k] < n && n < tabla[k + 1]) {
                        posicionMenor = k;
                        posicionMayor = k + 1;
                        break;
                    }
                }
                if (posicionMenor != -1) {
                    System.out.println("El número " + n + " no está en la tabla, pero está entre las posiciones "
                            + (posicionMenor + 1) + " y " + (posicionMayor + 1));
                } else {
                    System.out.println("El número " + n + " no está en la tabla");
                }
            }
        }
        }


