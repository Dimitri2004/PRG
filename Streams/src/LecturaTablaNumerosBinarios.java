import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LecturaTablaNumerosBinarios {
    public LecturaTablaNumerosBinarios (String rutafFichero){
        ObjectInputStream flujoentrada = null;
        try {
            flujoentrada = new ObjectInputStream(new FileInputStream("numeros.data"));
            //read int

        }
    }

}
