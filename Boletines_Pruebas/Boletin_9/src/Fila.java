public class Fila extends Lista2 implements Cola {

    public Fila(Nodo nodo) {
        super(nodo);
    }
    @Override
    public void encolar(int nuevovalor) {
       super.engadirPrimeiro(nuevovalor);
       super.engadirUltimo(nuevovalor);
    }

    @Override
    public void desencolar() {
        super.quitarPrimeiro();
        super.quitarUltimo();
    }


}
