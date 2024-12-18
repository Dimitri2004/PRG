import java.util.Arrays;
import java.util.Scanner;

public class Examen_Recuperacion_Prog_2_Dima {
    public static void main(String[] args) {
        int[] votos=new int[5];
        String[] menus ={
                "Pizza", "Hamburguesa", "Pasta", "Sushi", "Ensalada"
        };
        System.out.println("Dame una opción:  0.Sair 1.Votacion 3.Reiniciar Enquisa");
       Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        switch (opcion) {
            case 0:
                System.out.println("Saliendo...");
                break;
            case 1,2:
                mostrarMasVotado(menus,votos);
                break;
            case 3:
                System.out.println("Borrando");
        }
    }
   static void mostrarMasVotado(String[] menus,int [] votos) {
       Scanner sc = new Scanner(System.in);
       String[] tabla = {"Pizza", "Hamburguesa", "Pasta", "Sushi", "Ensalada"};
       for (int i = 0; i < 5; i++) {
           System.out.println("Que puntuacion le das a " + tabla[i]);
           int v = sc.nextInt();
           int voto = 0;
           tabla[i] = String.valueOf(voto);
           votos[i]=voto+1;
           System.out.println(Arrays.toString(votos));
       }
       main(menus);

   }

   }











