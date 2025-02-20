public class RunerDePrivates {
    public static void main(String[] args){
        //Hora
        Hora h1 = new Hora(12,30,45, "24");
        h1.setHoras(2);
        h1.setMinutos(50);
        h1.setSegundos(10);
        System.out.println("Formato: " + h1.getFormato());
        System.out.println("Hora: " + h1.getHoras() + ":" + h1.getMinutos() + ":" + h1.getSegundos());


    }
}
