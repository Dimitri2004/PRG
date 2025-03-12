package Asociacion;
import DataHora.Data;
public class Traballadores extends asociacion {
private int dataIngreso;

public Traballadores(String Nombre, String Dni) {
super(Nombre, Dni);

}

public Data setDataIngreso(){
    return new Data();
}

public int getDataIngreso(){
    return dataIngreso;
}
public String toString() {
    return "Asociacion.Traballadores{" + "Nome=" + getNombre() + ", Dni=" + getDni() + ", DataIngreso=" + dataIngreso + '}';
}

}
