/*Calcula el factorial de un numero que des por consola
*@version 1.0
*@autor Dima Aparicio
*/


import java.util.Scanner;

public class Boletin_5_6 {
    public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    int n1;   
        /*Pedimos un valor numerico para que lo esrciba en consola*/
        
        System.out.println("Dame un numero: ");
        n1=sc.nextInt();
        int f=1;
        
        for (int i = 1; i<=n1; i++) {
            /*Creamos una funcion de repeticion para que nos de numeros para su posterior uso*/
            f=f*i;
            /*operacion del calculo factorial*/

            }
System.out.println(f);
        /*Salida del resultado*/
       
    } 
    sc.close;
}
