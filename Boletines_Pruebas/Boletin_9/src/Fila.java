public class Fila extends Lista2 implements Cola {

    public Fila( ) {
        super( );
    }
    @Override
    public void encolar(int nuevovalor) {
       super.engadirUltimo(nuevovalor);
    }

    @Override
    public void desencolar() {
        super.quitarPrimeiro();
    }


}
