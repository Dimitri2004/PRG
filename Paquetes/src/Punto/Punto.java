package Punto;
import   escepcion1;

public class Punto {

    public static void escepcion1 () {
        System.out.println("Error: Division por cero");

    }
    private double x;
    private double y;


    public Punto() {
        x = 0;
        y = 0;
    }

    public Punto(double x, double y)  throws escepcion1 {
        if (y < 0) {
            throw new escepcion1( "Error: y no puede ser negativo");
        }
        else{
            setX(x);
            setY(y);
        }
    }

    public Punto(Punto p) {
        x = p.x;
        y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x)  throws Punto.escepcion1{
        if (x < 0) {
            throw new escepcion1("Error: x no puede ser negativo");
        }
        else{
            this.x = x;
        }
    }

    public void setY(double y) throws Punto.escepcion1 {
        if (y < 0) {
            throw new escepcion1("Error: y no puede ser negativo");
        }
        else{
            this.y = y;
        }
    }
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

}