


public class ExamenRecu {

    public static boolean comprobarFormato(String cadena){
        String a="";
        String[] matricula=cadena.split("-");
        for (int i=0;i<matricula.length;++i) {
            if (cadena.length() > 11) {
                System.out.println("No esta correcta a matricula");
                return false;

            }
            if (matricula[i].substring(0, 2).equals("FR")) {
                System.out.println("Las dos primeras letras estan correctas");
                return true;
            }
        }
            return  numeroMatricula(234);
        }

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
