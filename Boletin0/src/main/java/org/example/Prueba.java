package org.example;
import java.util.Scanner;
//ES UN PROGRAMA QUE A PARTIR DEL NUMERO QUE LE DES DICE EL DIA,MES Y AÑO EXISTENTES(EN FORMA DE NUMERO)

public class Prueba {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      

/*variable long dia por si nos colocan mas numeros de los que necesitamos*/
        long dia;

        System.out.println("Dime un día: ");
        dia=s.nextLong();
/*Condicion de repeticion y dentro de esta otra condicion de repeticion hasta que se cumplan las condiciones que limitamos*/
        do{
            /*condicion de numero representante de un dia superior a un mes dado*/
            if(dia>31){
                do{
                    /*Salida de datos de dias que hemos limitado */
                    System.out.println("Solo sirven los dias entre 1-30");
                    System.out.println("Dime otro día: ");
                    /*variable dia puesta en datos para salida */
                    dia=s.nextLong();
                }while(dia>31);
            } else {}
            /*repetir condicion hasta que se cumplan las caracteristicas del dia*/
        }while(dia>31);

/*Condicion de repeticion para hacer q el dia puesto sea correcto*/
        do{
            if(dia<=1){
                /*Salida de condiciones para corregir el numero puesto en terminal*/
                System.out.println("No me valen negativos o nulos");
                System.out.println("Dime otro día: ");
                dia=s.nextLong();
            }else{
            }
            do{
                /*Condicion de numeros superiores al de los meses establecidos*/
                if (dia>31){
                    System.out.println("Solo sirven los dias entre 1-30");
                    System.out.println("Dime otro día: ");
                    dia=s.nextLong();
                }
                /*Repetir hasta que se cumpla el mes establecido*/
            }while(dia>31);


        }while(dia<=0);
/*Definimos variable long mes de datos puestos en terminal*/
        long mes;

        System.out.println("Dame un mes: ");
        mes= s.nextLong();
        /*Condicion de repeticion del mes hasta que se*/
        do{
            if(mes<=12){
                /*Condicion de mes*/

            }else{
                System.out.println("Solo existen 12 meses ");
                System.out.println("Dame otro mes: ");
                mes= s.nextLong();
            }
        }while(mes>12);

        do{
            if(mes<=1){
                System.out.println("No me valen negativos o nulos");
                System.out.println("Dime otro mes: ");
                mes=s.nextLong();
            }else{
            }
            do{
                if (mes>12){
                    System.out.println("Solo sirven los meses entre 1-12");
                    System.out.println("Dime otro mes: ");
                    mes=s.nextLong();
                }
            }while(mes>12);


        }while(mes<=0);



        long año;
        do{
            System.out.println("Dame un año: ");
            año=s.nextLong();

            if (año>2024){
                System.out.println("Aún no hemos llegado a este año, dime otro inferior: ");
            }else{}
        }while (año>2024);
        if (año==0){System.out.println("No existe el año 0");
        }else{
        }

        if(año<0){

            System.out.println("La fecha que quieres es: " + dia +"/"+ mes +"/"+ año*-1 + " Ac");
        }else{
            System.out.println("La fecha que quieres es: "+dia +"/"+ mes +"/"+ año + " Dc");
        }
        s.close();
    }
}
