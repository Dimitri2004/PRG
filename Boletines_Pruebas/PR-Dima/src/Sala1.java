import java.util.Random;

public class Sala1 extends Sala{


    public Sala1(String nombreMonstruo,int ataqueMonstruo,int vidaMonstruo,int escudoMonstruo,int evasionMonstruo,int criticoMontruo,String armaduraMonstruo,String armasMonstruo,int ganarOro,int ganarExp,String ganarAbilidad){
        super(nombreMonstruo,ataqueMonstruo,vidaMonstruo,escudoMonstruo,evasionMonstruo,criticoMontruo,armaduraMonstruo,armasMonstruo,ganarOro,ganarExp,ganarAbilidad);

    }

    public String aCadea(){
        return super.aCadea()+"\n";
    }
}
