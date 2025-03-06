public abstract class Inmuebles {
    private boolean aVenta;
    private String localidade;
    private int prezo;
    private String rua;
    private int numero;
    public Inmuebles(boolean aVenta, String localidade, int prezo, String rua, int numero) {
        //colocarlos de forma que tengamos que poner condiciones que no admitan

        this.aVenta = aVenta;
        this.localidade = localidade;
        setPrezo(prezo);
        this.rua = rua;
        this.numero = numero;
    }
    public int getPrezo() {
        return prezo;
    }

    public void setPrezo(int prezo) {
        if (prezo < 0) {
            System.out.println("El precio no puede ser negativo");

        } else {
            this.prezo = prezo;
        }
    }
    public boolean isaVenta() {
        return aVenta;
    }
    public void setaVenta(boolean aVenta) {
        this.aVenta = aVenta;
    }
    public String getLocalidade() {
        return localidade;
    }
    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        //queremos su absoluto
       this.numero = Math.abs(numero);
    }

    public String toString() {
        String mensaxe="Inmuebles [aVenta=" + aVenta + ", localidade=" + localidade + ", numero=" + numero + ", prezo=" + prezo
                + ", rua=" + rua + "]";
       String estado;
        if(aVenta)estado="En alquiler";
        else estado="En venta";
        return mensaxe;
    }

    public abstract double calcularGanancia();
}
