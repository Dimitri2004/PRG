import java.util.Scanner;

public class Boletin_5_1 {
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
      int p;
        for(int s=1; s<=10;s++) {
            System.out.println("Dame numeros enteros: ");
            p = sc.nextInt();
            if (p<0){
                System.out.println(p+" Es negativo");
            }else if( p>0) {
                System.out.println(p+" Es positivo");
            }else if(p==0){
                System.out.println("Es cero");
            }
        }
    }
}
