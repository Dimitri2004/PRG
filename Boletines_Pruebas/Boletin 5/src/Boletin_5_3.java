/*Calcula el area del rectangulo escribiendo la base y la altura por teclado
*@version 1.0
*@autor Dima Aparicio
*/


import java.util.Scanner;

public class Boletin_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*Creamos las variables que utilizaremos para el calculo del area */
        int lado;
        int base;
            do {
                /*Preguntamos el valor de la primera variable, en este caso es la base del rectangulo*/
                System.out.println("Dame la base del recatangulo: ");
                base = sc.nextInt();
                if (base <= 0) {
                    /*Condicion para que el el dato no sea negarivo a la hora de ponerlo en la ecuacion*/
                    System.out.println("Dame la base positiva,del rectangulo: ");
                    base = sc.nextInt();
                } else { }
            } while (base <= 0);/*Repetir el proceso de pregunta de dato y condicion de este mismo hasta que sea el que queramos*/
            do {
                /*Bucle para el segundo dato del cual necesitamos su repuesta en consola, en este caso el lado*/
                System.out.println("Dame el lado del rectangulo: ");
                lado = sc.nextInt();

                   if (lado <= 0) {
                       /*Creamos la condicion para que nos de la variable positiva del lado*/
                        System.out.println("Dame el lado positivo del recatangulo: ");
                        lado = sc.nextInt();
                    } else {}
                int area=base*lado;/*Sacamos por consola la respectiva operracion al area*/
                System.out.println("El area es  " + area);
          } while (lado <= 0);/*Repetir proceso hasta q el area sea positiva*/
    }
}
