import java.util.Scanner;

public class PROG_ahorcado {
    public static void main(String[] args){

        String palabraAdiviñar = solicitaPalabra();
        String cadenaGuiones = cadenaGuions(palabraAdiviñar);
        int rondas=8;
        boolean acerto = false;
        String letrasPalabra;
        Scanner sc = new Scanner(System.in);

        do{

            System.out.println("La palabra a divinar é: " + solicitaPalabra());
            System.out.println("Xogador 2 introduzca la palabra a adiviñar" );
            letrasPalabra=sc.nextLine();
            if(letrasPalabra.length()>1){
                if(letrasPalabra.equals(palabraAdiviñar)) acerto=true;
                else{
                    System.out.println("A palabra non e corrcta");
                }
            }
            else{
                cadenaGuiones=comprobarLetrasdaPalabra(cadenaGuiones,letrasPalabra,palabraAdiviñar);
                if (cadenaGuiones.equals(palabraAdiviñar)) acerto=true;
            }
        }while( rondas<7 || acerto==false);


    }
    public static String solicitaPalabra(){
        Scanner sc = new Scanner(System.in);
        String palabra;
        System.out.println("Introduce una palabra:");
        palabra = sc.next();
        return palabra;
    }



    public static String comprobarLetrasdaPalabra(   String cadenaGuiones, String letraPalabra, String palabraAdiviñar){
        for(int i=0;i<letraPalabra.length();i++){
            if(palabraAdiviñar.charAt(i)==letraPalabra.charAt(0)){
                char[] cadenaGuionesChar=cadenaGuiones.toCharArray();
                cadenaGuionesChar[i*2]=letraPalabra.charAt(0);
                cadenaGuiones=new String(cadenaGuionesChar);
            }
        }
        return letraPalabra;
    }


    public static String cadenaGuions(String palabraAdiviñar) {
        String cadenaGuiones = "";
        for (int i = 0; i < palabraAdiviñar.length(); i++) {
            cadenaGuiones += "_";
        }
        return cadenaGuiones;
    }



}
