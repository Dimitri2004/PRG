/*Te da la tabla de multiplicar de cualquier numero que escribas por consola
*@version 1.0
*@autor Dima Aparicio
*/


import java.util.Scanner;

public class Boletin_5_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n1;
        System.out.println("Dame un numero: ");
        n1=sc.nextInt();
        System.out.println("La tabla del "+n1+" es: ");
        for(int i=0;i<=10;i++){
            System.out.println(n1+"x"+i+"="+n1*i);

        }




    }
}
