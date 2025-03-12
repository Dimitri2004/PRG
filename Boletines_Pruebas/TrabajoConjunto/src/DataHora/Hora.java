package DataHora;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        setHora(horas, minutos, segundos);
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }
    public int getSegundos() {
        return segundos;
    }
    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public String getHora() {
        return horas + ":" + minutos + ":" + segundos;
    }
    public void setHora(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }
    public String toString() {
        return "Hora{" + "horas=" + horas + ", minutos=" + minutos + ", segundos=" + segundos + '}';
    }
}
