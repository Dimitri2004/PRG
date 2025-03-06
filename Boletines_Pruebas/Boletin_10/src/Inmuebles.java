public class Inmuebles {
    private boolean tipoCompra;
    private int numeroPlazas;
    private float prezo;
    private String direccion;
    private int numero;
    private int dimensions;

    public Inmuebles(boolean tipoCompra, int numeroPlazas, float prezo, String direccion, int numero, int dimensions) {
        setTipoCompra (tipoCompra);
        setNumeroPlazas(numeroPlazas);
        setPrezo(prezo);
        setDireccion(direccion);
        setNumero(numero);
        setDimensions(dimensions);
    }

    public boolean isTipoCompra() {
        return tipoCompra;
    }

    public void setTipoCompra(boolean tipoCompra) {
        this.tipoCompra = tipoCompra;
    }

    public int getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(int numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDimensions() {
        return dimensions;
    }


    public void setDimensions(int dimensions) {
        this.dimensions = dimensions;
    }
}
