import java.util.Arrays;
import java.util.Scanner;

public class BOLETIN_7_4 {
    public static void main(String[] args) {
        alumno_dni();//Salida del resultado en forma de funcion en el main
    }

    static void alumno_dni() {//Creamos la funcion que va a realizar el proceso de selecccion de letra
        Scanner sc = new Scanner(System.in);
//Creamos y preguntamos las variables que va a necesitar
        int dni;
        System.out.println("Dame el numero de tu DNI: ");
        dni=sc.nextInt();
        int [] num =new int[9];
        int res;
        res = dni% 23;
        //Creamos el array correspondiente a las letras que utilizan los DNIs
        String[] letra = {"T", "R", "W", "A", "G ", "M ", "Y", "F", "P", "D", "X",
                "B", "N", "J", "Z ", "S ", "Q", "V", " H ", "L ", "C ", "K", "E"};
        for (int i = 0; i < 1; i++) {//Entramos dentro del array generando una unica salida de letra
            if (num.length != 8) {
                System.out.println("Al "+dni+" le corresonde la "+letra[(res)]);//Saca el dni con su numero 
            } else {
                System.out.println("Error: El número de DNI introducido no es válido");//Salida de la condicion en caso de no cumplir con la primera
                alumno_dni();
            }
            sc.close();
        }
    }
}
