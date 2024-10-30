import java.util.Scanner;

public class Boletin_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado;
        int base;
            do {
                System.out.println("Dame la base del recatangulo: ");
                base = sc.nextInt();
                if (base <= 0) {
                    System.out.println("Dame la base positiva,del rectangulo: ");
                    base = sc.nextInt();
                } else { }
            } while (base <= 0);
            do {
                System.out.println("Dame el lado del rectangulo: ");
                lado = sc.nextInt();

                   if (lado <= 0) {
                        System.out.println("Dame el lado positivo del recatangulo: ");
                        lado = sc.nextInt();
                    } else {}
                int area=base*lado;
                System.out.println("El area es  " + area);
          } while (lado <= 0);
    }
}