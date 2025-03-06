public class PrazaGaraxeconTrastero extends Garaxe {
    private double superficie;
    public PrazaGaraxeconTrastero(boolean aVenta, String localidade, int prezo, String rua, int numero, double ancho, double largo, int numeroP, double superficie) {
        super(  aVenta,  localidade,  prezo,  rua,  numero,  ancho,  largo,  numeroP);
        this.superficie = superficie;
    }
    public double getSuperficie() {
        return this.superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = Math.abs(superficie);
    }

}
