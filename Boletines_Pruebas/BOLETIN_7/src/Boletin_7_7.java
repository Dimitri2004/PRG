public class Boletin_7_7 {
    public static void main(String[] args) {
        //Creamos el array 
        int[] lista = new int[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = i*2;
        }
        //Creamos nuestra lista de valoras a copiar
        int [] nova_lista=copia_lista(lista);
        for (int elemento:nova_lista) {
            System.out.print(elemento+ " ");
        }
    }
    //Creamos la funcion que realizara la copia del array anterior
    public static int[] copia_lista(int[] lista_a_copiar) {
        int[] nova_lista;
        nova_lista = new int[lista_a_copiar.length];
        for (int i = 0; i < lista_a_copiar.length; i++) {
            nova_lista[i] = lista_a_copiar[i];

        }
        return nova_lista;
    }
}
