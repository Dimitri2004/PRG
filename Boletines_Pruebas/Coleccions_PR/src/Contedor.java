public class Contedor <T>  {
    private T objeto;
    public Contedor (){}

    void guardar(T novo){
        objeto = novo;
    }

    T extraer(){
        T res =objeto;
        objeto = null;
        return res;
    }
}


/*
interface nomeInterface <T> {
---
}

public interface Comparable<T>{
---
}


class nomeClase<T extends claseLimite>{
---
}

class nomeClase<T super claseLimite>{
---
}
*/
