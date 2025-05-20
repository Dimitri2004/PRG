import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Boletin13_ex11 {

    public static boolean nuevoAcademico (Map<Character, Academico> academia, Academico novo, Character letra) {
        Set<Character> t=academia.keySet();
        if (academia.containsKey(letra))return false;
        else {
            for (Character p: t){
                academia.put(new Academico(novo.academia, novo.ano).academicas,novo);
                System.out.println(p);
            }
            return true;
        }

    }
    public static class Academico{
        Character academicas;
        String academia;
        int ano;

        public Academico(String academia,int ano){
            this.academia=academia;
            this.ano=ano;
        }

        @Override
        public String toString() {
            return "Academico: "+academia+ "fecha entrada: "+ano;
        }
    }
    public static void main(String[] args){
        Map<Character, Academico> mapa=new TreeMap<>();
        nuevoAcademico(mapa,new Academico( "albar",356),'p');

    }
}
