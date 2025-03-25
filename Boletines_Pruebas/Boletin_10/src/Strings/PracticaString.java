package Strings;

public class PracticaString {
    public static void main(String[] args){
        String frase= "National Aeroespacial System Administration";
        System.out.println(primerString(frase));//llamada a la primera función
        System.out.println(cadenaInvertida(frase));//llamada a la segunda función
    }
    //Medodo de devolver Siglas de Strings
    public static String primerString(String frase){
        String siglas="";
       String[] frase2=frase.trim().split(" ");
       //for que recorre la cadena para recoger las primeras letras de cada frase
       for(int i=0;i<frase2.length;i++){
           siglas+=frase2[i].charAt(0);
       }
        return siglas;
    }
    //metodo de devolver las siglas de @primerString Invertidas
    public static String cadenaInvertida(String frase){
        String a="";
        String[] invertida=frase.split(" ");
        for(int i=invertida.length-1;i>=0;--i){
            a+=invertida[i].charAt(0);
        }
        return a;
    }
}
