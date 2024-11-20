import java.util.Scanner;

public class Examen_PRG {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        double resto;
        double raiz;
        do {
            System.out.println("De que numero natural quieres hacer su raiz?: ");
            n = sc.nextInt();
            if (n!= 0){
                raiz = Math.sqrt(n);
                resto = raiz % 2;
                if (resto == 0) {
                    System.out.println("Resultado " + (int) raiz);
                } else {
                    System.out.println("Resultado " + (int) raiz + " con resto " + ((Math.incrementExact((int) raiz))));
                }
            } else {
                System.out.println("No se ha introducido un numero racional.");
                return;
            }
        }while (true);
    }
}
