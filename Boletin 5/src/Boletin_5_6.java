/*Calcula el factorial de un numero que des por consola
*@version 1.0
*@autor Dima Aparicio
*/


import java.util.Scanner;

public class Boletin_5_6 {
    public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n1;
System.out.println("Dame un numero: ");
n1=sc.nextInt();
int f=1;
for (int i = 1; i<=n1; i++) {
    f=f*i;

}
System.out.println(f);


















    }
}
