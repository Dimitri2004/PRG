public class Main {
    public static void main(String[] args) {
        Contedor<Integer> num = new Contedor<Integer>();
        num.guardar(5);
        System.out.println(num.extraer());
        Contedor<String> cod=new Contedor<String>();
        cod.guardar("Hola");
        System.out.println(cod.extraer());
    }
}