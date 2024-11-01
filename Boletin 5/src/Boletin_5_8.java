/*Calcula la suma de numeros menores de 999 que le des en maquina
*@version 1.0
*@autor Dima Aparicio
*/
import java.util.Scanner;

public class Boletin_5_8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        int sum=0;
        /*Damos valores int a nuestras nuevas variables  */
           for(int i=1;i<10;i++) {
/*Creamos una fuuncion de repeticion que nos de numeros para su futuro uso*/
               do {
                   /*Creamos un bucle en el que repita los procesos de pedir numeros por cansola y crear operacion de suma en pantalla*/
                   System.out.println("Dame un numero: ");
                   n1 = sc.nextInt();
                   sum=sum+n1;
                   if (n1>=999){
                       /*Limitamos los numeros escritos por consola ya q solo nos sirven los que sean menores de 999*/
                       System.out.println(sum);
                       break;
                   }else{
                       break;
                   }
                   /*hacer q el bucle se repita las diez primeras veces*/
               }while (i++<10);
           }
    }
}
