public class Fila extends Lista2 implements Cola {

    public Fila( Nodo nodoInicial) {
        super( nodoInicial);
    }
    @Override
    public void encolar(int valor) {
        engadirUltimo(valor);
    }

    @Override
    public void desencolar() {
        quitarPrimeiro();
    }


}
