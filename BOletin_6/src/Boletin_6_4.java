import java.util.Scanner;

public class Boletin_6_4 {
    public static void main(String[] args){
       segundos();


    }
        static void segundos(){
        int dias;
        int minutos;
        int hora;
            Scanner sc=new Scanner(System.in);
            System.out.println("Dame el dia: ");
            dias=sc.nextInt();
            System.out.println("Dame una hora: ");
            hora=sc.nextInt();
            System.out.println("Dame los minutos:");
            minutos=sc.nextInt();
        int operacion=dias*24*60+hora*60*60+minutos*60;
        System.out.println("Los segundos totales son: "+ operacion+ " s");

        }



















}
