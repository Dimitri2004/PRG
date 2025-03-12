package Asociacion;

import java.util.Scanner;

import static com.sun.tools.sjavac.Util.set;

public abstract class asociacion {
    private String Nombre;
    private String Dni;
    public asociacion(String Nombre, String Dni) {
        this.Nombre = Nombre;
        set(Dni);
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getDni() {
        return Dni;
    }
    public void setDni(String Dni) {
        Scanner sc = new Scanner(System.in);
//Creamos y preguntamos las variables que va a necesitar
        int dni;
        System.out.println("Dame el numero de tu DNI: ");
        dni=sc.nextInt();
        int [] num =new int[9];
        int res;
        res = dni% 23;
        //Creamos el array correspondiente a las letras que utilizan los DNIs
        String[] letra = {"T", "R", "W", "A", "G ", "M ", "Y", "F", "P", "D", "X",
                "B", "N", "J", "Z ", "S ", "Q", "V", " H ", "L ", "C ", "K", "E"};
        for (int i = 0; i < 1; i++) {//Entramos dentro del array generando una unica salida de letra
            if (num.length != 8) {
                System.out.println("Al "+dni+" le corresonde la "+letra[(res)]);//Saca el dni con su numero
            } else {
                System.out.println("Error: El número de DNI introducido no es válido");//Salida de la condicion en caso de no cumplir con la primera
                setDni(Dni);
            }
            sc.close();
        }
    }
    public abstract String toString();
}
