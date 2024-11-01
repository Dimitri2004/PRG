/*Te da la tabla de multiplicar de cualquier numero que escribas por consola
*@version 1.0
*@autor Dima Aparicio
*/


import java.util.Scanner;

public class Boletin_5_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1;
        /*Preguntamos el numero por consola para saber su multiplicidad */
        System.out.println("Dame un numero: ");
        n1=sc.nextInt();
        /*La salida de datos de abajo es para que se vea de forma ordenada y clara lo que el programa realiza*/
        System.out.println("La tabla del "+n1+" es: ");
        for(int i=0;i<=10;i++){
            /*Crea una cadena de numeros para su posterior uso*/
            System.out.println(n1+"x"+i+"="+n1*i);
            /*Salida de los numeros con su repectiva tabla de multiplicar*/
        }
    }
}
