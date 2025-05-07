import java.util.HashMap;
import java.util.Map;

public class ExemploMapa {
    public static void main(String [] args){
        Map<String,Integer> mapa =new HashMap<>();
        mapa.put("Ana",19);
        mapa.put("Jose",22);
        mapa.put("Manuel",30);
        mapa.put("Jaime",42);

        //Recorremos el mapa
        System.out.println("Recorremos el mapa" + mapa);

    }
}
