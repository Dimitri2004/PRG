/*Calcula la suma y producto de numeros entre 10-90
*@version 1.0
*@autor Dima Aparicio
*/

public class Boletin_5_2 {
    public static void main(String[] args){
int n;
        
    n=1;
int suma;
        suma=0;
            double mult;
            mult=1.0;
    for(int i=10;i<=90;i++) {/*Funcion de salida de numeros entre el 10 y el 90*/
        suma = suma + i;/*Operacion suma del total*/
        mult = mult * i;/*Operacion producto del total*/
    }
           System.out.println("SUMA: "+ suma);/*Salida de operacion suma*/
           System.out.println("Producto: "+ mult);/*Salida de opercaion multiplicacion*/

    }
}
