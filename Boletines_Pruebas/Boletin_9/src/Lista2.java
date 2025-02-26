public class Lista2 {
    //Partimos de la class creada que llamamos node
    private Nodo nodoInicial;
    private int size;

    public Lista2(){
        this.nodoInicial = null;
        size = 0;
    }
    public  Lista2(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
        size = 1;
    }
public boolean estaVacia() {

    if(nodoInicial == null){
        return true;
    }
    else {
        return false;
    }
}
public int getTamaño() {
    return size;
}
public void engadirUltimo(int valor){
        Nodo nuevoNodo = new Nodo(valor, null);
        if(estaVacia()==true){
            nodoInicial = nuevoNodo;
            size = 1;
        }
        else{
            Nodo nodoActual = nodoInicial;
            while(nodoActual.getNodoSeguinte() != null){
                nodoActual = nodoActual.getNodoSeguinte();
            }
            nodoActual.setNodoSeguinte(nuevoNodo);
            size++;

        }

}
//crear una funcion listar y hacrle un printl en una nueva main



}
