public abstract class Garaxe extends Inmuebles {
    private double ancho;
    private double largo;
    private int numeroP;
    //lamamos a la superclase
    public Garaxe(boolean aVenta, String localidade, int prezo, String rua, int numero, double ancho, double largo, int numeroP) {
        super(aVenta, localidade, prezo, rua, numero);
        //creamos los atributos propios de la clase Garaxe
        setAncho(this.ancho);
        setLargo(this.largo);
        setNumeroP(this.numeroP);
    }
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }


    public int getNumeroP() {
        return numeroP;
    }
    public void setNumeroP(int numeroP) {
        this.numeroP =Math.abs(numeroP);
    }
    public double calcularGanancia() {
        if (isaVenta()) return getPrezo();
        else return getPrezo() * 0.02;
    }
}
