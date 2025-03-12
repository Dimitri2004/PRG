package Asociacion;

import DataHora.Data;
import DataHora.Hora;

public class Voluntarios extends Traballadores implements GastosIngresos {
    private int edade;
    private Hora horas;
    private String profesision;
    private String Trabajo;

    public Voluntarios(String Nombre, String Dni, Data dataIngreso, int edade, Hora horas, String profesision, String Trabajo) {
        super(Nombre, Dni, dataIngreso);
        setEdade(edade);
        setHoras(horas);
        setProfesision(profesision);
        setTrabajo(Trabajo);
    }
    public int getEdade() {
        return edade;
    }
    public void setEdade(int edade) {
        this.edade = Math.abs(edade);
    }
    public Hora getHoras() {
        return horas;
    }
    public void setHoras(Hora horas) {
        this.horas = horas;
    }
    public String getProfesision() {
        return profesision;
    }
    public void setProfesision(String profesision) {
        this.profesision = profesision;
    }
    public String getTrabajo() {
        return Trabajo;
    }
    public void setTrabajo(String Trabajo) {
        this.Trabajo = Trabajo;
    }
    public String toString() {
        String v= "Voluntarios{" + "Nome=" + getNombre() + ", Dni=" + getLetraDni() + ", DataIngreso=" + getDataIngreso().toString()+ ", Edade=" + edade + ", Horas=" + horas + ", Profesision=" + profesision + ", Trabajo=" + Trabajo + '}';
        return super.toString() + v;
    }
    public double calcularGastosIngresos(){
       return -3;
    }
}
