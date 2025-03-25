package Strings;

public class CorregirFrase {
    //una frase toda junta con  palabras mayusculas entre medias para corregirla en una funcion
    public static void main(String[] args) {
        String frase = "alfabetoConLetrasMayusculas";
        System.out.println("La frase corregida es: " + corregirFrase(frase));
    }

    //funcion que realiza la comprobacion del cambio de la primera letra de cada palabra a mayuscula
    public static String corregirFrase(String frase){
        String fraseCorregida = "";
        String[] palabras = frase.split("(?=[A-Z])");
        for (int i = 0; i < palabras.length; i++) {
            fraseCorregida += palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1).toLowerCase();
            if(i < palabras.length - 1){
                fraseCorregida += " ";
            }
        }
        return fraseCorregida;
    }

}
