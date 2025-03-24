public class Transporte extends Barcos {
    private int nlicencia;
    private String datainspeccion;
    private int nsalvavidas;

    public Transporte(String orixe, String nome, int anoBoutanza, String matricula, int eslora, double volumen, int ntripulantes, int millas, int nlicencia, String datainspeccion, int nsalvavidas){
        super(orixe,nome,anoBoutanza,matricula,eslora,volumen,ntripulantes,millas);
        this.nlicencia=nlicencia;
        this.datainspeccion=datainspeccion;
        setNsalvavidas(nsalvavidas,ntripulantes);
    }

    public int getNsalvavidas() {
        return nsalvavidas;
    }

    public void setNsalvavidas(int nsalvavidas,int ntripulantes) {
        if(nsalvavidas>=ntripulantes){
            this.nsalvavidas = nsalvavidas;
        }else{
            this.nsalvavidas=ntripulantes;
        }
    }

    public String getDatainspeccion() {
        return datainspeccion;
    }

    public void setDatainspeccion(String datainspeccion) {
        this.datainspeccion = datainspeccion;
    }

    public int getNlicencia() {
        return nlicencia;
    }

    public void setNlicencia(int nlicencia) {
        this.nlicencia =Math.abs(nlicencia);
    }
    public  String aCadea(){
        String T1="Orixe: "+getOrixe()+" Nome: "+getNome()+" AnoBoutanza: "+getAnoBoutanza()+" Matricula: "+getMatricula()+" Eslora: "+getEslora()+" Volumen: "+getVolumen()+" Tripulantes: "+getNtripulantes()+"  Millas: "+getMillas()+" Licencia: "+getNlicencia()+" Datainspeccion: "+getDatainspeccion()+" Salvavidas: "+getNsalvavidas();
        return T1;
    }

}
