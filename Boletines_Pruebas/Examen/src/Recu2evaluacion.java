public class Recu2evaluacion {
    public static void main(String[] args) {
    }
    //Comprobar que o tipo ttNNNaaaa se cumpla

    //comproobacion de metodo de numero dentro de string
    public static boolean numeroMatricula(int numero){
        if(numero>=1 && numero<999){
            return true;
        }else {
            return false;
        }
    }

    //COMPROBACION DO FORMATO DEMATRICULA *tomando ejemplo del anterio*
    public static String comprobarDixitos(String cadena){
        String a="";
        String b="";
        String[] letras;
        letras = cadena.split("(?=[A-Z])");
        for(int i=0;i<letras.length;++i){
            if (cadena.length()==7){
                a+=letras[i].substring(0,4);
                System.out.println("Los primeros 4 digitos son numeros "+a);
                b+=letras[i].substring(4,7).toUpperCase();
                System.out.println("Los siguientes 3 caracteres son letras " +b);
            }else{
                System.out.println("La cadena tiene que ser de 7 variables, repitela");
            }
        }
        return a;
    }

}
