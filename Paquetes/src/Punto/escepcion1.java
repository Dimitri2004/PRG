package Punto;

public class escepcion1 {
    public static void main(String[] args) {
        int a,b,c;
        a = 0;
        b = 0;
        try {
            c=a/b;
        }
        catch (ArithmeticException erro) {
            System.out.println("Error: Division por cero");
            System.out.println(erro.getMessage());
        } //catch (Exception erro2) {
           // System.out.println("Error: Division por cero");
            //System.out.println(erro2.getMessage());
        finally {
            System.out.println("Finally");

        }
    }
}
