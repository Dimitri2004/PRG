import java.util.Scanner;

public class Boletin_5_2 {
    public static void main(String[] args){
Scanner sc=new Scanner(System.in);


int n;
    n=1;
int suma;
        suma=0;
            double mult;
            mult=1.0;
    for(int i=10;i<=90;i++) {
        suma = suma + i;
        mult = mult * i;
    }
           System.out.println("SUMA: "+ suma);
           System.out.println("Producto: "+mult);

    }
}
