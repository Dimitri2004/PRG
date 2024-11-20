import java.util.Arrays;
import java.util.Scanner;

public class BOLETIN_7_4 {
    public static void main(String[] args) {
        alumno_dni();
    }

    static void alumno_dni() {
        Scanner sc = new Scanner(System.in);

        int dni;
        System.out.println("Dame el numero de tu DNI: ");
        dni=sc.nextInt();
        int [] num =new int[9];
        int res;
        res = dni% 23;
        String[] letra = {"T", "R", "W", "A", "G ", "M ", "Y", "F", "P", "D", "X",
                "B", "N", "J", "Z ", "S ", "Q", "V", " H ", "L ", "C ", "K", "E"};
        for (int i = 0; i < 1; i++) {
            if (num.length != 8) {
                System.out.println("Al "+dni+" le corresonde la "+letra[(res)]);
            } else {
                System.out.println("Error: El número de DNI introducido no es válido");
                alumno_dni();
            }
            sc.close();
        }
    }
}
