public class Boletin_7_8 {
    public static void main(String[] args) {
        int[] numero=Numeros();
       for(int numeros:numero) {
           if (numeros % 2 == 0) {
               System.out.println("\nSon pares "+numeros);
           }
       }
    }
    static int[] Numeros() {
        int[] numero=new int[9];
        for (int i = 0; i <numero.length; i++) {
            numero[i] = (int) (Math.random() * 51);
            System.out.print(numero[i]+"|");
        }
        return numero;
    }
}
