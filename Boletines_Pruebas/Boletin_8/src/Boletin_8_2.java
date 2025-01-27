public class Boletin_8_2 {
    public static void main(String[] args) {
        //Separar la frase en palabras
        String frase="Los espacios";
        String[] palabras=frase.split(" ");
        //Recorrer cada palabra y decir el numero de cambios que puedes hacer
        for(String palabra:palabras) {
            System.out.println("La palabra "+palabra+" tiene "+cambios(palabra)+" interseccions para modificar ");
        }
        //Separar la frase en palabras y decir la primera letra de cada palabra


        String frase2="Universal Serial Bus";
        frase(frase2);
    }
    public static int cambios(String palabra) {
        int contador=0;
        for(int i=0;i<palabra.length()-1;i++) {
            if(palabra.charAt(i)!=palabra.charAt(i+1)) {
                contador++;
            }
        }
        return contador;
    }
    static void frase(String frase2){
        String[] primeraletra=frase2.split(" ");
        for(String frase:primeraletra) {
            System.out.print(frase.charAt(0));
        }

    }

}
