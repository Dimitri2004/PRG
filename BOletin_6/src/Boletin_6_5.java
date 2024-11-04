public class Boletin_6_5 {
    public static void main(String[] args){
        int hora1=1;
        int hora2=2;
        int minuto1=45;
        int minuto2=50;

        int diferencia=diferenciaMin(hora1,hora2,minuto1,minuto2);
        System.out.println("La diferencia son: "+ diferencia);
    }
    static int diferenciaMin(int hora1,int hora2,int minuto1,int minuto2){
        int total_minutos1=hora1*60+ minuto1;
        int total_minutos2=hora2*60+ minuto2;
        int oper= total_minutos2-total_minutos1;
        return oper;




    }
}
