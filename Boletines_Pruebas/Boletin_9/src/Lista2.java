public class Lista2 {
    //Partimos de la class creada que llamamos node
    private Nodo nodoInicial;
    private int size;

    public Lista2() {
        this.nodoInicial = null;
        size = 0;
    }

    public Lista2(Nodo nodoInicial) {
        this.nodoInicial = nodoInicial;
        size = 1;
    }

    public boolean estaVacia() {

        if (nodoInicial == null) {
            return true;
        } else {
            return false;
        }
    }

    public int getTamaño() {
        return size;
    }

    public void engadirUltimo(int valor) {
        Nodo nuevoNodo = new Nodo(valor, null);
        if (estaVacia()) {
            nodoInicial = nuevoNodo;
            size = 1;
        } else {
            Nodo nodoActual = nodoInicial;
            while (nodoActual.getNodoSeguinte() != null) {
                nodoActual = nodoActual.getNodoSeguinte();
            }
            nodoActual.setNodoSeguinte(nuevoNodo);
            size++;
        }
    }
    //quitar el ultimo
    public void quitarUltimo() {
        if (estaVacia()) {
            System.out.println("La lista está vacía");
        } else {
            Nodo nodoAnterior = null;
            if (size != 1) {
                Nodo nodoActual = nodoInicial;
                while (nodoActual.getNodoSeguinte() != null) {
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.getNodoSeguinte();
                }
                nodoAnterior.setNodoSeguinte(null);
            } else {
                nodoInicial = null;
            }
            size--;
        }
    }
    //añadir primero
    public void engadirPrimeiro(int valor) {
        Nodo novoNodo = new Nodo(valor, nodoInicial);//creas un nuevo nodo apuntando al nodo inicial
        nodoInicial = novoNodo;
        size++;
    }
    //quitarle el primero
    public void  quitarPrimeiro() {

        if (estaVacia()) {
            System.out.println("La lista está vacía");
        }else {
            nodoInicial = nodoInicial.getNodoSeguinte();
            size--;
        }
    }
    public void quitarAnterior() {

        if (estaVacia()) {
            Nodo nodoAnterior = null;
            if (size != 1) {
                Nodo nodoActual = nodoInicial;
                while (nodoActual.getNodoSeguinte() != null) {
                    nodoAnterior = nodoActual;
                    nodoActual = nodoActual.getNodoSeguinte();
                }
                nodoAnterior.setNodoSeguinte(null);

            } else {
                nodoInicial = null;
            }
        }else{
            size--;
        }
    }
    //mostrar valores
    public void mostrarValores() {
        if (!estaVacia()) {
            if (size != 1) {
                Nodo nodoActual = nodoInicial;
            do{
                System.out.println(nodoActual.getvalor());
                nodoActual = nodoActual.getNodoSeguinte();
            } while (nodoActual != null);

            }
            else System.out.println(nodoInicial.getvalor());
        }
    }
}
