package Asociacion;

import DataHora.Data;

public class Asalariados2 extends Traballadores2 {
    private double soldo;
    private String cargo;

    public Asalariados2(String Nome, String Dni, Data dataIngreso, double soldo, String cargo) {
        super(Nome, Dni, dataIngreso);
        setSoldo(soldo);
        setCargo(cargo);
    }
    public double getSoldo() {
        return soldo;
    }
    public void setSoldo(double soldo) {
        this.soldo = Math.abs(soldo);
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String toString() {
        String a= "Asalariados{" + "Nome=" + getNombre() + ", Dni=" + getLetraDni() + ", DataIngreso=" + getDataIngreso().toString()+ ", Soldo=" + soldo + ", Cargo=" + cargo + '}';
        return super.toString() + a;
    }
    public double calculargastosIngresos(){
        return -soldo -soldo*15/100;
    }


}
