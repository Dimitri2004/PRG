package Asociacion;

import static com.sun.tools.sjavac.Util.set;

public abstract class Asociacion {
    private String Nombre;
    private String Dni;
    public Asociacion(String Nombre, String Dni) {
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
        if (Dni.length()<9){
            this.Dni = Dni;
        } else {
            System.out.println("DNI incorrecto");
        }
    }
    public abstract String toString();
}
