import java.util.Scanner;

public class Formateo_Nombre_Boletin_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime tu nombre completo");
        String nombre=sc.nextLine(); //string nombre que utilizaremos 
        String[] nombre_completo=nombre.split(" "); //string de nombre dividido en array

        nuevonombre(nombre_completo);


    }
    public static String nuevonombre(String[] nombre){ 
        //nueva class en la que utilizaremos el nuevo nombre que cambiaremos
        Scanner sc=new Scanner(System.in);
        System.out.println("Dame el numero, si quieres cambiar a mayuscula el nombre: 1.Si  2.No");
        int opcion=sc.nextInt();
        //sistem de opciones switch para preguntar el cambio o no del nombre
        switch(opcion) {
            case 1:
                //crear nombre en mayusculas
                for(int i=0;i<nombre.length;i++){
                    String nombre_cambiado=nombre[i].toUpperCase();
                    System.out.print(nombre_cambiado + " " );
                }
                break;
            case 2:
                //string nombre sin cambios
                System.out.println("Nombre sin cambiar");
                for(int i=0;i<nombre.length;i++) {
                    System.out.print(nombre[i] + " ");
                }
        }
        return "Nombre modificado";

    }
}
