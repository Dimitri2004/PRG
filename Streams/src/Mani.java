public class Mani {
    public static void main(String[] args){
//        ReaderDeBufferNumerico r = new ReaderDeBufferNumerico("/home/dam/Documentos/PRG/Streams/src/textoPruebaNumerica");
//        String texto = r.leerTexto("/home/dam/Documentos/PRG/Streams/src/textoPruebaNumerica");
        int[] tabla = {1, 2, 3, 4, 5,5,6,7,8};

//        new EstructuraTablaNumerosBinarios(tabla);
//        new LecturaTablaNumerosBinarios("numeros.data");
        new LectorDeParesImpares("numerosImpares.data");
        new LectorDeParesImpares("numerosPares.data");

        new EstructuraNumericoParaDistribucion(tabla);


        //new LectorDeParesImpares();



    }
}
