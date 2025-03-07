public class Vivenda extends Inmuebles{
    private int numeroHabitacions;
    private PrazaGaraxeconTrastero garaxe;
    private String observacions;
    private String piso;
    private String portal;
    public Vivenda(boolean aVenta, String localidade, int prezo, String rua, int numero, int numeroHabitacions, PrazaGaraxeconTrastero garaxe, String observacions, String piso, String portal) {
        super(aVenta, localidade, prezo, rua, numero);
        setNumeroHabitacions(numeroHabitacions);
        this.garaxe = garaxe;
        this.observacions = observacions;
        this.piso = piso;
        this.portal = portal;
    }
    public int getNumeroHabitacions() {
        return numeroHabitacions;
    }
    public void setNumeroHabitacions(int numeroHabitacions) {
        this.numeroHabitacions = Math.abs(numeroHabitacions);
    }
    public PrazaGaraxeconTrastero getGaraxe() {
        return garaxe;
    }
    public void setGaraxe(PrazaGaraxeconTrastero garaxe) {
        this.garaxe = garaxe;
    }
    public String getObservacions() {
        return observacions;
    }
    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }
    public String getPiso() {
        return piso;
    }
    public void setPiso(String piso) {
        this.piso = piso;
    }
    public String getPortal() {
        return portal;
    }
    public void setPortal(String portal) {
        this.portal = portal;
    }
    public String toString() {
        String texto=super.toString()+"Vivenda =" + numeroHabitacions + ", garaxe=" + garaxe + ", observacions=" + observacions + ", piso=" + piso + ", portal=" + portal + "]";
        texto=texto+garaxe.toString();
        return texto;
    }
    public double calcularGanancia() {
        if (isaVenta()) return getPrezo();
        else return getPrezo() * 0.02;
    }




}
