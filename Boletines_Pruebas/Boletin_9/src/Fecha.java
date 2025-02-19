public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    public String getFecha() {
        return dia + "/" + mes + "/" + año;
    }

    public int getDiasEnMes(int mes) {
        return switch (mes) {
            case 2 -> (año % 4 == 0 && año % 100 != 0) || año % 400 == 0 ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    public String getDiaDeLaSemana() {
        String[] dias = {"Domingo", "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado"};
        return dias[(dia - 1 + getDiasEnMes(mes) + 1) % 7];
    }
    //Salida de main de fecha
    public static void main(String[] args){
       Fecha data=new Fecha(5,4,2011);
       System.out.println("Fecha: "+data.getFecha()+" "+data.getDiaDeLaSemana());
       Fecha nuevaFecha=new Fecha(15,7,2022);
       System.out.println("NuevaFecha: "+nuevaFecha.getFecha());
       System.out.println("Pasaron: "+data.diferenciadeAños(nuevaFecha)+" años "+data.diferenciadeMeses(nuevaFecha)+" meses "+data.diferenciadeDias(nuevaFecha)+" dias");
        System.out.println("Día de la semana: "+nuevaFecha.getDiaDeLaSemana());


    }
    //difrencia de fechas
    public int diferenciadeAños(Fecha nuevaFecha){
        int diferenciaDias=Math.abs(this.dia-nuevaFecha.getDia());
        int diferenciaMeses=Math.abs(this.mes-nuevaFecha.getMes());
        int diferenciaAños=Math.abs(this.año-nuevaFecha.getAño());
        while(diferenciaMeses>12){
            diferenciaMeses-=12;
            diferenciaAños++;
        }
        while(diferenciaDias>this.getDiasEnMes(this.mes)){
            diferenciaDias-=this.getDiasEnMes(this.mes);
            diferenciaMeses++;
        }
        return diferenciaAños;
    }
    public int diferenciadeMeses(Fecha nuevaFecha){
        int diferenciaDias=Math.abs(this.dia-nuevaFecha.getDia());
        int diferenciaMeses=Math.abs(this.mes-nuevaFecha.getMes());
        return diferenciaMeses;
    }
    public int diferenciadeDias(Fecha nuevaFecha){
        int diferenciaDias=Math.abs(this.dia-nuevaFecha.getDia());
        return diferenciaDias;
    }
}

