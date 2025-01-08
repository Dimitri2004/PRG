public class Main {
    public static void main(String[] args) {
        String texto="Isoo e Java!";
        System.out.println(texto.length());
        String textoJava="Java";
        String[] letras=textoJava.split("");
        for(String letra:letras) {
            System.out.println(letra);
        }
        String textoJava1="www. java\0dende0 .com";
        System.out.println(textoJava1);

    }
}