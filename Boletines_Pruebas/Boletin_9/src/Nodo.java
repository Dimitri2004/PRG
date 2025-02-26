public class Nodo {
    private int valor;
    private Nodo punteiroSeguinte;

    public Nodo(int valor, Nodo nSeguinte){
        setvalor(valor);
        setNodoSeguinte(nSeguinte);
    }
    public void setvalor(int valor){
        this.valor = valor;

    }
    public int getvalor(){
        return valor;
    }

    public void setNodoSeguinte(Nodo punteiro){
        this.punteiroSeguinte = punteiro;
    }
    public Nodo getNodoSeguinte(){
        return punteiroSeguinte;
    }


}
