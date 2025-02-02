import java.util.Scanner;

public class Contraseña {
    public static void main(String[] args){
        //Dar opcion para crear contraseña y validarla tenieno 8 restricciones como mayuscula,minuscula y numero minimo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña: ");
        String password = sc.nextLine();
        boolean b=false;
        //queremos saber si contraseña es invalida
        if (restricciones(password).equals(b)){
            System.out.println(restricciones(password));
        }else{
            System.out.println("No es válido");
        }

    }
    static String restricciones(String password) {
        //salida de datos string para el main
        String restricciones = "";
        if (password.length() < 8) {
            restricciones += "La contraseña debe tener al menos 8 caracteres.\n";
        }
        for(int i = 0; i < password.length(); i++){
            //creamos charcter para la serie de Strings
            char c=password.charAt(i);
            if(Character.isUpperCase(c)){
                restricciones += "La contraseña debe tener al menos una mayúscula.\n";
            }
            if(Character.isLowerCase(c)){
                restricciones += "La contraseña debe tener al menos una minúscula.\n";
            }
            if(Character.isDigit(c)){
                restricciones += "La contraseña debe tener al menos un número.\n";
            }
            if (!Character.isLetterOrDigit(c)) {
                restricciones += "La contraseña solo puede contener letras y números.\n";
            }
            if(restricciones.length() > 0){
                return restricciones;
            }
        }
        return "La contraseña es válida.";

    }
}
