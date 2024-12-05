import java.util.Scanner;

public class Boletin_7_2_practica {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[] pila;
        int cabeza=-1;
        pila=new int[5];
        //apilamos varios valores
        cabeza=apilar(pila,cabeza,3);
        cabeza=apilar(pila,cabeza,5);
        cabeza=apilar(pila,cabeza,10);
        cabeza=apilar(pila,cabeza,15);
        cabeza=apilar(pila,cabeza,20);
        //lee la pila
        leerpila(pila,cabeza);
        //desapila los elementos de la pila
        cabeza=desapilar(pila,cabeza);
        cabeza=desapilar(pila,cabeza);
        cabeza=desapilar(pila,cabeza);
        cabeza=desapilar(pila,cabeza);
        cabeza=desapilar(pila,cabeza);
        //lectura de pila
        leerpila(pila,cabeza);
        //apilacion de nuevos elementos de pila
        cabeza=apilar(pila,cabeza,9);
        cabeza=apilar(pila,cabeza,13);
        cabeza=apilar(pila,cabeza,34);
        cabeza=apilar(pila,cabeza,8);
        cabeza=apilar(pila,cabeza,6);
        //lectura de pila
        leerpila(pila,cabeza);

    }
    //crear un apilador que dice si esta llena o no el hueco de la pila
    public static int apilar(int[] pila,int cab,int num){
        //condicion de la longitud de nuestra pila
        if(cab<pila.length-1){
            pila[cab+1]=num;
            cab++;
            System.out.println("Elemento "+num+" añadido a la pila");
        }else{
            System.out.println("La pila está llena");
        }
        return cab;
    }
    //crear un desapilador de nuestra pila que diga si esta vacio o no el hueco de la pila
    public static int desapilar(int[] pila,int cab){
        //condicion de lectura de numero que queremos quitar de la pila
        if(cab>=0){
            System.out.println("El elemento "+pila[cab]+" ha sido desapilado");
            cab--;
        } else{
            System.out.println("La pila "+ cab +" está vacía");
        }
        return cab;
    }
    //lector de pila
    public static void leerpila(int[] pila, int cab){
        //condicion para crear lista con elementos nuevos o vacios
        if (cab>0) {
            for (int i=0;i<=pila.length-1;i++){
                System.out.println("El numero de la pila es: "+pila[i]);
            }
        }
        else if (cab==0){
            System.out.println("La pila está vacía");
        }
    }
}