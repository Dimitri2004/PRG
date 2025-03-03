import java.util.Arrays;
import java.util.Scanner;

/* Programa que divide una palabra con cada letra de la misma un grupo de n letras en caso de se impar crear grupos del numero deseado con  la ultima letra de cada grupo
* @author dima
 */
public class Boletin_8_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
               
        System.out.print("Introduce una palabra: ");
        
        String palabra = sc.nextLine();
        
        int n = 1;
        //Dividimos las palabras en n numeros
        String[] palabrasDividas = dividirPalabra(palabra, n);
        
        System.out.println("Palabras divididas:");
        
        Arrays.stream(palabrasDividas).forEach(System.out::println);

        sc.close();

    }
    public static String[] dividirPalabra(String palabra, int n) {
        
        String[] palabrasDividas = new String[palabra.length()];
        
        for ( int i = 0; i < palabra.length(); i++) {
            
            palabrasDividas[i] = palabra.substring(++1,i, Math.min(i*(n+1), palabra.length()));
            
            i++;
        }
        return palabrasDividas;
    }
}
