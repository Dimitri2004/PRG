public class TransporteFluidos extends Transporte implements calcularFacturacion{
    private String fluido;
    private String tipoCasco;

    public TransporteFluidos(String orixe, String nome, int anoBoutanza, String matricula, int eslora, double volumen, int ntripulantes,int millas,int nlicencia,String datainspeccion,int nsalvavidas,String fluido,String tipoCasco){
        super(orixe,nome,anoBoutanza,matricula,eslora,volumen,ntripulantes,nlicencia,millas,datainspeccion,nsalvavidas);
        setFluido(fluido);
        setTipoCasco(tipoCasco);
    }

    public String getFluido() {
        return fluido;
    }

    public void setFluido(String fluido) {
        this.fluido = fluido;
    }

    public String getTipoCasco() {
        return tipoCasco;
    }

    public void setTipoCasco(String tipoCasco) {
        if(tipoCasco.equals("dobre")){
            this.tipoCasco=getTipoCasco();
        }else if (tipoCasco.equals("simple")){
                this.tipoCasco=getTipoCasco();
            }
    }
    public  String aCadea(){
       return super.aCadea()+" Fluido: "+getFluido()+" Tipo de casco: "+getTipoCasco();
    }
    public double calcularFactura(){
        return getMillas()*20*getVolumen();
    }
}
