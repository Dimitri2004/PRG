import java.util.Scanner;

public class Formateo_Nombre_Boletin_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre completo");
        String nombre=sc.nextLine();
        String[] nombre_completo=nombre.split(" ");

        nuevonombre(nombre_completo);


    }
    public static String nuevonombre(String[] nombre){
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame el numero, si quieres cambiar a mayuscula el nombre: 1.Si  2.No");
        int opcion=sc.nextInt();
        switch(opcion) {
            case 1:
                //crear nombre en mayusculas
                for(int i=0;i<nombre.length;i++){
                    String nombre_cambiado=nombre[i].toUpperCase();
                    System.out.print(nombre_cambiado + " " );
                }
                break;
            case 2:
                System.out.println("Nombre sin cambiar");
                for(int i=0;i<nombre.length;i++) {
                    System.out.print(nombre[i] + " ");
                }
        }
        return "Nombre modificado";

    }
}
