import java.util.Scanner;

public class Primosde1_a_n {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Dame el n de primos q quieres: ");
        n = sc.nextInt();
        int j = 9;
        int k = 25;
        for (int i = 1; i <= (n - 1); i++) {

            System.out.println(i * 2 + " No es primo");
            if ((i * 2 + 1) == 9) {
                System.out.println(j + " No es primo");
            } else if ((i * 2 + 1) == k) {
                System.out.println(k + " No es primo");
            } else {
                System.out.println(i * 2 + 1 + " Es primo");
            }
        }
    }
}

