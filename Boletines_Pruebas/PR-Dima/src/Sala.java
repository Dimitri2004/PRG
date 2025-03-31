import java.util.Random;

public abstract class Sala {
    private String nombreMonstruo;
//Procedimientos (Posiblemente sea mejor hacer interfaz de ellos)
//private int recibirDano;

    //Stats de Monstruo //random
    private int ataqueMonstruo;
    private int vidaMonstruo;
    private int escudoMonstruo;
    private int evasionMonstruo;
    private int criticoMontruo;
    //Objetos Monstruo
    private String armaduraMonstruo;
    private String armasMonstruo;

    //Recompensas Sala1
    private int ganarOro;//random
    private String ganarAbilidad;
    private int ganarExp;//random

    public Sala(String nombreMonstruo,int ataqueMonstruo,int vidaMonstruo,int escudoMonstruo,int evasionMonstruo,int criticoMontruo,String armaduraMonstruo,String armasMonstruo,int ganarOro,int ganarExp,String ganarAbilidad){
        setNombreM(nombreMonstruo);
        setAtaque(ataqueMonstruo);
        setLife(vidaMonstruo);
        setShield(escudoMonstruo);
        setMiss(evasionMonstruo);
        setCritical(criticoMontruo);
        setArmaduraM(armaduraMonstruo);
        setArmaM(armasMonstruo);
        setOro(ganarOro);
        setExp(ganarExp);
        setSkill();
    }

    public String getNombreMonstruo() {
        return nombreMonstruo;
    }

    public String setNombreM(String nombreMonstruo) {
        if (nombreMonstruo.length()>4) {
            this.nombreMonstruo = nombreMonstruo;
        }else{
            this.nombreMonstruo=setNombreM(nombreMonstruo);
        }
        return nombreMonstruo;
    }

    public int getGanarExp() {
        return ganarExp;
    }

    public void setExp(int ganarExp) {
        this.ganarExp =Math.abs(ganarExp);
    }

    public String getGanarAbilidad() {
        return ganarAbilidad;
    }

    public void setSkill() {
        Random r=new Random();
        int p=r.nextInt(1,3);
        String[] ganarskill= new String[]{"Evasion Veloz","Ataque potenciado","Escudo Real"};
        this.ganarAbilidad = ganarskill[p];
    }

    public int getGanarOro() {
        return ganarOro;
    }

    public void setOro(int ganarOro) {
        if (ganarOro >0) {
            this.ganarOro = ganarOro;
        }else{
            this.ganarOro= Math.abs(ganarOro);
        }

    }

    public String getArmasMonstruo() {
        return armasMonstruo;
    }

    public void setArmaM(String armasMonstruo) {
        Random r=new Random();
        int p=r.nextInt(1,3);
        String[] ganarskill= new String[]{"Espada Larga","Garras",""};
        this.ganarAbilidad = ganarskill[p];
    }

    public String getArmaduraMonstruo() {
        return armaduraMonstruo;
    }

    public void setArmaduraM(String armaduraMonstruo) {
        this.armaduraMonstruo = armaduraMonstruo;
    }

    public int getCriticoMontruo() {
        return criticoMontruo;
    }

    public void setCritical(int criticoMontruo) {
        Random c = new Random();
        criticoMontruo=c.nextInt(25,100);
        this.criticoMontruo = criticoMontruo;
    }

    public int getEvasionMonstruo() {
        return evasionMonstruo;
    }

    public void setMiss(int evasionMonstruo) {
        Random c = new Random();
        evasionMonstruo=c.nextInt(25,100);

        this.evasionMonstruo = evasionMonstruo;
    }

    public int getEscudoMonstruo() {
        return escudoMonstruo;
    }

    public void setShield(int escudoMonstruo) {
        Random c = new Random();
        escudoMonstruo=c.nextInt(25,40);
        this.escudoMonstruo = escudoMonstruo;
    }

    public int getVidaMonstruo() {
        return vidaMonstruo;
    }

    public void setLife(int vidaMonstruo) {
        Random c = new Random();
        vidaMonstruo=c.nextInt(95,110);
        this.vidaMonstruo = vidaMonstruo;
    }

    public int getAtaqueMonstruo() {
        return ataqueMonstruo;
    }

    public void setAtaque(int ataqueMonstruo) {
        Random c = new Random();
        ataqueMonstruo=c.nextInt(25,100);
        this.criticoMontruo = ataqueMonstruo;
    }
    public  String aCadea(){
        return getArmaduraMonstruo()+"\n"+getArmasMonstruo()+"\n"+getAtaqueMonstruo()+"\n"+getCriticoMontruo()+"\n"+getEvasionMonstruo()+"\n"+getEscudoMonstruo()+"\n"+getGanarAbilidad()+"\n"+getGanarExp()+"\n"+getGanarOro()+"\n"+getNombreMonstruo()+"\n"+getVidaMonstruo();
    }
}
