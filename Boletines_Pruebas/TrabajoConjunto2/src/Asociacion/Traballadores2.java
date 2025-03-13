package Asociacion;
import DataHora.Data;
public  class Traballadores2 extends asociacion2 {
private Data dataIngreso;

public Traballadores2(String Nombre, String Dni, Data dataIngreso) {
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

public double calculargastosIngresos(){
return 0.0;
}
}
