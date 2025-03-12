package Asociacion;

public class Voluntarios extends Traballadores implements GastosIngresos {
    private int edade;
    private int horas;
    private String profesision;
    private String Trabajo;

    public Voluntarios(String Nombre, String Dni, int dataIngreso, int edade, int horas, String profesision, String Trabajo) {
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
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = Math.abs(horas);
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
        return "Asociacion.Voluntarios{" + "Nombre=" + getNombre() + ", Dni=" + getDni() + ", DataIngreso=" + getDataIngreso() + ", Edade=" + edade + ", Horas=" + horas + ", Profesision=" + profesision + ", Trabajo=" + Trabajo + '}';
    }
    public double calcularGastosIngresos(){
       return horas;
    }
}
