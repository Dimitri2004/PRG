public class Ejercicio_pares {
    /*
    *@version 1.0
    *@autor Dima Aparicio
    */
    public static void main(String[] args){

        int suma=0;
        /*Damos un valor inicial a la suma*/
        for(int i=0;i<10;i++){/*creamos una cadena de condiciones para repetir una secuencia de numeros*/
            if (i%2==0)  suma=suma+i;
            else continue;/*Damos a los valores resultantes eligiendo solo los q nos interesan, en este caso son los pares*/
            System.out.println("El numero es:  "+i);
            }
        System.out.println("La suma de los pares es: "+suma);/*Salida del resultado*/


        }




        }













