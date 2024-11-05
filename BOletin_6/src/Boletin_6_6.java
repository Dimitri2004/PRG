import java.util.Scanner;

public class Boletin_6_6 {
    public static void main(String[] args){
       if ( numero1(220)==numero2(248));
       System.out.println("Son amigos");


    }




    static int numero1(int num1){
        int suma1=0;

        for (int i = 1; i < num1; i++) {
            int resto = num1 % i;
            if (resto == 0) {
                suma1 = suma1 + i;

            }

        }
        System.out.println(suma1);
return num1;
    }
    static int numero2(int num2){
        int suma2=0;

        for (int i = 1; i < num2; i++) {
            int resto = num2 % i;
            if (resto == 0) {
                suma2 = suma2 + i;

            }

        }
        System.out.println(suma2);
return num2;
    }





























}
