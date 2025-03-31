package exception;

public class escepcion1 {
    public static void main(String args[]) {
        int a,b,c;
        a = 0;
        b = 0;
        try {
            c=a/b;
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division por cero");
            c = 0;
        }
    }
}
