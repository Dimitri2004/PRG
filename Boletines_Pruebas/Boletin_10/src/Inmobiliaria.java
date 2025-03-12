public class Inmobiliaria {
    public static void main(String[] args){
        //Queremos los datod de todas nuestros datos
        Vivenda vivenda1 = new Vivenda(true, "Ourense", 100000, "Rúa 1", 1, 3, new PrazaGaraxeconTrastero(true, "Ourense", 10000, "Rúa 2", 2, 2, 2, 10,5), "Observación", "1º", "A");

        System.out.println(vivenda1);


        Can can1 = new Can("OliverNautilus", 5);
        can1.ronroneo();
        can1.voz();
    }
}

