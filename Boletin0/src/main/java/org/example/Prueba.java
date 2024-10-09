package org.example;
import java.util.Scanner;
//ES UN PROGRAMA QUE A PARTIR DEL NUMERO QUE LE DES DICE EL DIA,MES Y AÑO EXISTENTES(EN FORMA DE NUMERO)

public class Prueba {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
      


        long dia;

        System.out.println("Dime un día: ");
        dia=s.nextLong();

        do{
            if(dia>31){
                do{
                    System.out.println("Solo sirven los dias entre 1-30");
                    System.out.println("Dime otro día: ");
                    dia=s.nextLong();
                }while(dia>31);
            } else {

            }}while(dia>31);


        do{
            if(dia<=1){
                System.out.println("No me valen negativos o nulos");
                System.out.println("Dime otro día: ");
                dia=s.nextLong();
            }else{
            }
            do{
                if (dia>31){
                    System.out.println("Solo sirven los dias entre 1-30");
                    System.out.println("Dime otro día: ");
                    dia=s.nextLong();
                }
            }while(dia>31);


        }while(dia<=0);

        long mes;

        System.out.println("Dame un mes: ");
        mes= s.nextLong();
        do{
            if(mes<=12){

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
