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




           for(int i=1;i<10;i++) {

               do {
                   System.out.println("Dame un numero: ");
                   n1 = sc.nextInt();
                   sum=sum+n1;
                   if (n1>=999){
                       System.out.println(sum);
                       break;
                   }else{
                       break;
                   }
               }while (i++<10);


           }



    }
}