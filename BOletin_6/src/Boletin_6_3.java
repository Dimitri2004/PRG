import java.util.Scanner;

public class Boletin_6_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        eleccion();

    }

    static void eleccion(){
        Scanner sc=new Scanner(System.in);

        int n;
        int l;
        int a;
        System.out.println("Si quieres area escribe 1,\n"+
                "Si quieres volumen escribe 2 ");
        n=sc.nextInt();
        switch (n) {
            case 1:
                if (n==1) {
                    System.out.println("Escogiste calcular el area");
                    System.out.println("Dame el lado de la base del cubo :");
                    l = sc.nextInt();

                    int area=l*l;
                    System.out.println("El area es:"+6*area);

                }break;
            case 2:
                if (n==2) {
                    System.out.println("Escogiste calcular el volumen");
                    System.out.println("Dame la altura del cubo :");
                    a = sc.nextInt();
                    int volumen=a*a*a;
                    System.out.println("El volumen es:"+volumen);

                }break;
        }


    }
















}
