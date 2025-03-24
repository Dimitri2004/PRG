public class TransporteViaxeiros extends Transporte implements calcularFacturacion{
    private boolean tipo;

    public TransporteViaxeiros(String orixe, String nome, int anoBoutanza, String matricula, int eslora, double volumen, int ntripulantes,int millas,int nlicencia,String datainspeccion,int nsalvavidas,boolean tipo){
        super(orixe,nome,anoBoutanza,matricula,eslora,volumen,ntripulantes,millas,nlicencia,datainspeccion,nsalvavidas);
        setTipo(tipo);
    }

    public boolean getTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        if (tipo){
            this.tipo=true;
            System.out.println("Clase turista");
        }else {
            this.tipo=false;
            System.out.println("Primera clase");
        }
    }
    public String aCadea(){
        return super.aCadea()+" Salvavidas: "+getNsalvavidas()+" Tipo de pasaxeiro: "+getTipo();
    }
     public double calcularFactura(){
        //en caso de ser false calcura factura de primera clase
         //en caso de ser true calcula factura de  clase turista
            if (getTipo()){
                return getMillas()*5*getNtripulantes();
            }else{
                return getMillas()*7*getNtripulantes();
            }

    }
}
