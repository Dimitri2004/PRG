package Asociacion;
import DataHora.Data;
public class Traballadores extends asociacion {
private Data dataIngreso;

public Traballadores(String Nombre, String Dni, Data dataIngreso) {
super(Nombre, Dni);
this.dataIngreso = dataIngreso;
}

    public Data getDataIngreso() {
return dataIngreso;
}
public void setDataIngreso(Data dataIngreso) {
this.dataIngreso = dataIngreso;
}
public String toString() {
return "Traballadores{" + "Nome=" + getNombre() + ", Dni=" + getLetraDni() + ", DataIngreso=" + dataIngreso.toString() + '}';
}

    public double calcularGastosIngresos() {
return -3;

    }
}
