public class PrazaGaraxeconTrastero extends Garaxe {
    private double superficie;
    //Chamamos a la superclase de la que procede que es garaxe
    public PrazaGaraxeconTrastero(boolean aVenta, String localidade, int prezo, String rua, int numero, double ancho, double largo, int numeroP, double superficie) {
        super(  aVenta,  localidade,  prezo,  rua,  numero,  ancho,  largo,  numeroP);
        this.superficie = superficie;
    }
    //Pedimos la clase superficie
    public double getSuperficie() {
        return this.superficie;
    }
    //Llamamos la clase superficie 
    public void setSuperficie(double superficie) {
        this.superficie = Math.abs(superficie);
    }

}
