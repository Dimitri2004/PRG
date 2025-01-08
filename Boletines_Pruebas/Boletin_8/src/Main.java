public class Main {
    public static void main(String[] args) {
        String texto="Isoo e Java!";
        System.out.println(texto.length());
        String textoJava="Java";
        String[] letras=textoJava.split("");
        for(String letra:letras) {
            System.out.println(letra);
        }
        String[] textoJava1="www. java,dende0 .com".split(",");
        System.out.println(textoJava1[0]); //www. java
        System.out.println(textoJava1[1]); //dende0.com
//        String[] partes= textoJava1.split("-");
//        String parte1=partes[0];
//        String parte2=partes[1];
//        System.out.println(parte1);
//        System.out.println(parte2);
        String str="javeros";
        System.out.println(str.toUpperCase()); //JAVERO
        System.out.println(str.toLowerCase()); //javeros

        String a="Java";
        String b="JavaScript";
        System.out.println(a.contentEquals(b));

        String textoJ="jeve jeve jeve";
        System.out.println(textoJ.replace("e","a"));
        String textoJ1="ABCD";
        System.out.println(textoJ1.replace("ABCD","ASCII"));

        String textoJ3="Ola, son alumno de DAM1, e son programador desde 2024";
        System.out.println(textoJ3.length());

    }
}