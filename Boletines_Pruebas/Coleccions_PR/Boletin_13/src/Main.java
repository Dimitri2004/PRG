import java.util.Arrays;
import java.util.List;

public class Main<T> {
    public static void main(String[] args) {
       String[] p=new String[4];
       p[0]="Javier";
        p[1]="Carlos";
        p[2]="Maria";
        p[3]="Ana";
        String[] l=new String[4];
        l[0]="Lucas";
        l[1]="Alba";
        l[2]="Uxia";
        l[3]="Manuel";
    List<List<String>> a=Arrays.asList(Arrays.stream(l).toList(), Arrays.stream(p).toList());
        ContenedorTablas<String> t=new ContenedorTablas<>(l,p);
        t.lapilar("Favian");
        t.lapilar("Ernesto");
        System.out.println(t.ldesapilar());
        System.out.println(t.ldesapilar());
        System.out.println(t.ldesapilar());
        System.out.println(a);

    }
}