package Asociacion;

import DataHora.Data;
//Class que devuelve los datos que trae de la clase abstracta de Trabajadores 
public class Asalariados extends Traballadores {
    private double soldo;
    private String cargo;
//LLamamos a la clase super 
    public Asalariados(String Nome, String Dni, Data dataIngreso, double soldo, String cargo) {
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
    //Saca la cadena de datos que añadimos para ver las propiedades de cada uno
    public String toString() {
        String a= "Asalariados{" + "Nome=" + getNombre() + ", Dni=" + getLetraDni() + ", DataIngreso=" + getDataIngreso().toString()+ ", Soldo=" + soldo + ", Cargo=" + cargo + '}';
        return super.toString() + a;
    }
    //calcula los gastos e ingresos en las variables en las que implementamos la interfaz calcularGastosIngresos
    public double calcularGastosIngresos(){
        return -soldo -soldo*15/100;
    }


}
