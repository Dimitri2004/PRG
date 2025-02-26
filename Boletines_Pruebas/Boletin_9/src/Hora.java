public class Hora {
    enum FormatoHora{DOCE,VENTICUATRO};
    private FormatoHora formato;
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos,String formato) {
        setFormato(formato);
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setFormato(String formato) {
        if(formato.toUpperCase().equals("DOCE")|| formato.toUpperCase().equals("VENTIC")){
            this.formato=FormatoHora.valueOf(formato);
        }
        else {
            if (formato.equals("12")) {
                this.formato = FormatoHora.DOCE;
            }
            else {
                this.formato = FormatoHora.VENTICUATRO;
            }
        }
    }
    public String getFormato() {
        return formato.name();
    }
    public void setHoras(int horas) {
        this.horas = this.horas+horas;
        if(this.horas>24){
            this.horas = 0;
            System.out.println("Horas no válidas. Se ha establecido en 0.");
        }else{
            this.horas = horas;
        }
    }
    public void setMinutos(int minutos) {
        if(this.minutos<0){
            this.minutos = 0;
            System.out.println("Minutos no válidos. Se ha establecido en 0.");
        } else if(minutos>59){
            this.minutos = 59;
            System.out.println("Minutos no válidos. Se añadira una hora");

        } else {
            this.minutos = minutos;
        }
    }
    public void setSegundos(int segundos) {
        if(this.segundos<0){
            this.segundos = 0;
            System.out.println("Segundos no válidos. Se ha establecido en 0.");
        } else {
            this.segundos = segundos;
        }
    }
    public int getHoras() {

        return horas;
    }
    public int getMinutos() {
        return minutos;
    }
    public int getSegundos() {
        return segundos;
    }

}
