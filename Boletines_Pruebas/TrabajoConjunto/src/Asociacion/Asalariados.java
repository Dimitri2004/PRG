package Asociacion;

public class Asalariados extends Traballadores implements GastosIngresos{
    private double soldo;
    private String cargo;

    public Asalariados(String Nome, String Dni, int dataIngreso, double soldo, String cargo) {
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
    public double calcularGastosIngresos(){
        return soldo;
    }

    public String toString() {
        return "Asociacion.Asalariados{" + "Nome=" + getNombre() + ", Dni=" + getDni() + ", DataIngreso=" + getDataIngreso() + ", Soldo=" + soldo + ", Cargo=" + cargo + '}';
    }


}
