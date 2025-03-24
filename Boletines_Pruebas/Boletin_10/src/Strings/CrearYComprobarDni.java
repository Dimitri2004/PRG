package Strings;

public class CrearYComprobarDni {
    //creo una funcion que realice la comprobacion y otra donde se desarrolla el ejercicio
    public static void main(String[] args) {
        String dni = "12345678Z";
        System.out.println("El DNI '" + dni + "' es: " + comprobarDni(dni));
    }

    //funcion que realiza la comprobacion
    public static String comprobarDni(String dni){
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        String resultado = "";
        if(dni.length() == 9){
            int numero = Integer.parseInt(dni.substring(0, 8));
            int resto = numero % 23;
            if(dni.charAt(8) == letras.charAt(resto)){
                resultado = "correcto";
            }else{
                resultado = "incorrecto";
            }
        }else{
            resultado = "incorrecto";
        }
        return resultado;
    }
}
