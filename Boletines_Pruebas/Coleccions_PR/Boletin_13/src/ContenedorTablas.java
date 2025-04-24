import java.util.Arrays;

import static java.util.Arrays.stream;
import static java.util.List.copyOf;

public class ContenedorTablas<T> implements Lista<T>{
    private T[] t1;
    private  T[] t2;
    public ContenedorTablas(T[] t1,T[] t2){
        this.t1=t1;
        this.t2=t2;
    }
    public void lapilar(T novo){
        t1= Arrays.copyOf(t1,t1.length+1);
        t1 [t1.length-1]=novo;
        t2= Arrays.copyOf(t2,t2.length+1);
        t2 [t2.length-1]=novo;
        String p= Arrays.toString(stream(t1).toArray());
        String l= Arrays.toString(stream(t2).toArray());
        String g=p+"\n"+l;
        System.out.println(g);
    }
   public T ldesapilar(){
       T res=null;
       if (t1.length>0){
           res=t1[t1.length-1];
           t1=Arrays.copyOfRange(t1,1,t2.length-1);
       }
       if (t2.length>0) {
           res=t2[t2.length-1];
           t2=Arrays.copyOfRange(t2,1,t1.length+1);
       }
       return res;
    }
}
