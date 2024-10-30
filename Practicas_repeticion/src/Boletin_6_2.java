import java.util.Scanner;

public class Boletin_6_2 {
    public static void main(String[] args){
    numero();
    eco(6,"rep");
    }

    static void numero(){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Dame un numero: ");
        n=sc.nextInt();


    }
    static void eco(int veces,String sonido){
        for (int i=0;i<veces-1;i++){
            if (sonido.equals("rep")) System.out.println("eco");
        }


    }



























}
