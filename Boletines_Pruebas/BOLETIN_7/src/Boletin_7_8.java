public class Boletin_7_8 {
    public static void main(String[] args) {
        //Creamos el array de numeros que decidira si es par el array de la funcion igualada
        int[] numero=Numeros();
        System.out.println("Son pares: ")
            // Creamos la condicion de entrada al array de numeros
       for(int numeros:numero) {
           if (numeros % 2 == 0) {
               System.out.print(numeros);
           }
       }
    }
    //Funcion donde crearemos el array de numeros aleatorios
    static int[] Numeros() {
        int[] numero=new int[9];
        for (int i = 0; i <numero.length; i++) {
            numero[i] = (int) (Math.random() * 51);
            System.out.print(numero[i]+"|");
        }
        return numero;
    }
}
