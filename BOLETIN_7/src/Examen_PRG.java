import java.util.Scanner;

public class Examen_PRG {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        double resto;
        double raiz;
        System.out.println("De que numero natural quieres hacer su raiz?: ");
        n=sc.nextInt();
        raiz = Math.sqrt(n);
        resto= raiz%2;
        if (resto==0) {
            System.out.println("Resultado "+(int)raiz);
        }else {
            System.out.println("Resultado "+(int)raiz+" con resto "+((Math.incrementExact((int) raiz))));
        }
    }
}
