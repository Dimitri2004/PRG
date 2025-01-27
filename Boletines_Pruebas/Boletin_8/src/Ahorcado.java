import java.util.Arrays;
import java.util.Scanner;
public class Ahorcado {
    //Recrear un sistema de juego parecido al ahorcado con solo 7 turnos con dos jugadores
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] palabraSecreta = {'s', 'e', 'c', 'r', 'e', 't', 'a'};
        char[] letrasJugadas = new char[7];
        Arrays.fill(letrasJugadas, '_');
        int intentos = 7;
        boolean gano = false;
        boolean perdio = false;
        boolean acierto = false;
        int jugadorActual = 0;
        while (!gano &&!perdio && intentos > 0) {
            System.out.println("Turno del jugador " + (jugadorActual + 1));
            System.out.println("Letras jugadas: " + Arrays.toString(letrasJugadas));
            System.out.print("Ingrese una letra: ");
            char letraJugada = sc.next().charAt(0);

            acierto = false;
            for (int i = 0; i < palabraSecreta.length; i++) {
                if (palabraSecreta[i] == letraJugada) {
                    letrasJugadas[i] = letraJugada;
                    acierto = true;
                }

            }
            if (!acierto) {
                intentos--;
            }
            gano = Arrays.equals(letrasJugadas, palabraSecreta);
            perdio = intentos == 0;
            jugadorActual = (jugadorActual + 1) % 2;
            muñeco(intentos);
        }


        if (gano) {
            System.out.println("Felicitaciones, ganaste!");
        }




    }
    //Representar el muñequo correspondinete en caso de fallos
    public static void muñeco(int intentos) {
        switch (intentos) {
            case 6:
                System.out.println("  -----");
                System.out.println(" |     |");
                System.out.println(" |     O");
                System.out.println(" |");
                System.out.println(" |");
                System.out.println(" |");
                break;
            case 5:
                System.out.println("  -----");
                System.out.println(" |     |");
                System.out.println(" |     O");
                System.out.println(" |     |");
                System.out.println(" |    /");
                System.out.println(" |");
                break;
            case 4:
                System.out.println("  -----");
                System.out.println(" |     |");
                System.out.println(" |     O");
                System.out.println(" |    /|");
                System.out.println(" |    /");
                System.out.println(" |");
                break;
                case 3:
                    System.out.println("  -----");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |    /|\\");
                    System.out.println(" |    /");
                    System.out.println(" |");
                    break;
                case 2:
                    System.out.println("  -----");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |    /|\\");
                    System.out.println(" |    / ");
                    System.out.println(" |");
                    break;
                case 1:
                    System.out.println("  -----");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |    /|\\");
                    System.out.println(" |    / \\");
                    System.out.println(" |");
                    break;
                case 0:
                    System.out.println("  -----");
                    System.out.println(" |     |");
                    System.out.println(" |     O");
                    System.out.println(" |    /|\\");
                    System.out.println(" |    / \\");
                    System.out.println(" |    X");
                    System.out.println("Perdiste!");
                    break;
        }
    }
    //funcion que alague o acorte la palabrasecreta
    public static void acerto(char letra, char[] palabraSecreta, char[] letrasJugadas) {
        for (int i = 0; i < palabraSecreta.length; i++) {
            if (palabraSecreta[i] == letra) {
                letrasJugadas[i] = letra;
            }
        }
        System.out.println("Letras jugadas: " + Arrays.toString(letrasJugadas));

    }








}
