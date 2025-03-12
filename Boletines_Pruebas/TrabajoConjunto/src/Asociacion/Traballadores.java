package Asociacion;

public abstract class Traballadores extends Asociacion {
private int dataIngreso;

public Traballadores(String Nombre, String Dni, int dataIngreso) {
super(Nombre, Dni);
setDataIngreso(dataIngreso);

}
public int getDataIngreso() {
return dataIngreso;
}
public void setDataIngreso(int dataIngreso) {
this.dataIngreso = Math.abs(dataIngreso);
}

}
