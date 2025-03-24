public class TransporteContenedores extends Transporte implements calcularFacturacion{
    private int capacidadeCarga;
    private int nCompartimentos;

    public TransporteContenedores(String orixe, String nome, int anoBoutanza, String matricula, int eslora, double volumen, int ntripulantes,int millas,int nlicencia,String datainspeccion,int nsalvavidas,int capacidadeCarga,int nCompartimentos){
        super(orixe,nome,anoBoutanza,matricula,eslora,volumen,ntripulantes,millas,nlicencia,datainspeccion,nsalvavidas);
        setCapacidadeCarga(capacidadeCarga);
        setnCompartimentos(nCompartimentos);
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga){
        this.capacidadeCarga = Math.abs(capacidadeCarga);
    }

    public int getnCompartimentos(){
        return nCompartimentos;
    }

    public void setnCompartimentos(int nCompartimentos) {
        this.nCompartimentos = Math.abs(nCompartimentos);
    }
    public  String aCadea(){
        return super.aCadea()+" Capacidade de carga: "+getCapacidadeCarga()+" Numero de compartimentos: "+getnCompartimentos();
    }
    public double calcularFactura(){
        return getMillas()*3*getCapacidadeCarga();
    }
}
