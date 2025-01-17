/** Creamos un programa que haga un tablero de crus y raya empleando arrays
 *
 *
 */
import java.util.Scanner;
public class Cruz_Raya {
    public static void main(String[] args) {
        String[][] tablero;
        tablero = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tablero[i][j] = "-";
            }
        }
        imprimirTablero(tablero);
        comprobarGanador(tablero,"X");
        comprobarTableroLleno(tablero);

    }

    static void imprimirTablero(String[][] tablero) {
        //Creamos el tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
    static boolean comprobarGanador(String[][] tablero, String simbolo) {
        for (int i = 0; i < 3; i++) {
            if (tablero[i][0].equals(simbolo) && tablero[i][1].equals(simbolo) && tablero[i][2].equals(simbolo)) {
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (tablero[0][i].equals(simbolo) && tablero[1][i].equals(simbolo) && tablero[2][i].equals(simbolo)) {
                return true;
            }
        }
        if (tablero[0][0].equals(simbolo) && tablero[1][1].equals(simbolo) && tablero[2][2].equals(simbolo)) {
            return true;
        }
        if (tablero[0][2].equals(simbolo) && tablero[1][1].equals(simbolo) && tablero[2][0].equals(simbolo)) {
            return true;
        }
        return false;
    }
    static boolean comprobarTableroLleno(String[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;

    }

}
