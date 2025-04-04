import java.io.FileReader;

public class Mani {
    public static void main(String[] args){
        ReaderDeBufferNumerico r = new ReaderDeBufferNumerico("/home/dam/Documentos/PRG/Streams/src/textoPruebaNumerica");
        String texto = r.leerTexto("/home/dam/Documentos/PRG/Streams/src/textoPruebaNumerica");

    }
}
