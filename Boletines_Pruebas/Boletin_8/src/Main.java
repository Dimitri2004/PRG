

public class Main {
    public static void main(String[] args) {
        //creamos el string del que vamos a trabajar
        String texto="Isoo e Java!";
        //damos el valor numerico a la longitud de la frase
        System.out.println(texto.length());
        String textoJava="Java";
        String[] letras=textoJava.split("");
        for(String letra:letras) {
            System.out.println(letra);
        }
        String[] textoJava1="www. java,dende0 .com".split(",");
        //funcion que divide nuestra frase que tenemos en el array de  string de arriba
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

        //Darle a letras1,numeros,espacios la cantidad que haya en textoJ3 comentando
        String textoJ3="Ola, son alumno de DAM1, e son programador desde 2024";

        int letras1=0; //valor del espacio que ocupa

        int numeros=0; //valores de la posicion de los numeros

        int espacios=0; //valor de los espacions que tiene la frase

        //Usando un bucle para contar las letras, numeros y espacios en el textoJ3
        for (int i = 0; i < textoJ3.length(); i++) {
            //Obtener el carácter en la posición i de texto J3
            char c = textoJ3.charAt(i);
            if (Character.isLetter(c)) {
                //Contar letras
                letras1++;

            } else if (Character.isDigit(c)) {
                //Contar dígitos numericos
                numeros++;
            } else if (Character.isWhitespace(c)) {
                //Contar espacios en blanco
                espacios++;
            }
        }
        System.out.println("Letras: "+letras1);//sacalas letras que tiene la frase
        System.out.println("Numeros: "+numeros);//saca los numeros 
        System.out.println("Espacios: "+espacios);

    }
}
