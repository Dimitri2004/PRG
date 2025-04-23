public class Main {
    public static void main(String[] args) {
        Contedor<Integer> num = new Contedor<Integer>();
        num.guardar(5);
        Integer n=num.extraer();
        System.out.println(n);
        Contedor<String> cod=new Contedor<String>();
        cod.guardar("Hola");
        String c= cod.extraer();
        System.out.println(c);
    }
}