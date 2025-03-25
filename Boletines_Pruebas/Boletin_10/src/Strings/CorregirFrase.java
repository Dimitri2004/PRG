package Strings;

public class CorregirFrase {
    //una frase toda junta con  palabras mayusculas entre medias para corregirla en una funcion
    public static void main(String[] args) {
        String frase = "alfabetoConLetrasMayusculas";
        System.out.println("La frase corregida es: " + corregirFrase(frase));
    }

    //funcion que realiza la comprobacion
    public static String corregirFrase(String frase){
        String fraseCorregida = "";
        for (int i = 0; i < frase.length(); i++) {
            if(Character.isUpperCase(frase.charAt(i))){
                fraseCorregida += " " + frase.charAt(i);
            }else{
                fraseCorregida += frase.charAt(i);
            }

        }
        return fraseCorregida;
    }
}
