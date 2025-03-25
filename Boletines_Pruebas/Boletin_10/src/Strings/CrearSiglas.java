package Strings;

public class CrearSiglas {
    //cro una funcion que realice la comprobacion y otra donde se desarrolla el ejercicio
    public static void main(String[] args) {
        String cadena = "Universal    Serial        Bus";

        System.out.println("Las siglas de la cadena son: " + comprobarSiglas(corregirEspacios(cadena)));
    }
    //funcion que realiza la comprobacion
    public static String comprobarSiglas(String cadena){
        String siglas = "";
        String[] palabras = cadena.trim().split(" ");
        for (int i = 0; i < palabras.length; i++) {
            siglas += palabras[i].charAt(0);
        }
        return siglas;
    }
    //crear una funcion que coja mas de un espacio entre palabras y los convierta en uno solo
    public static String corregirEspacios(String cadena){
        String cadenaCorregida = "";
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == ' '){
                cadenaCorregida += cadena.charAt(i);
                while(cadena.charAt(i) == ' '){
                    i++;
                }
            }
            cadenaCorregida += cadena.charAt(i);
        }
        return cadenaCorregida;
    }
}
