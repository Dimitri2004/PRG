public class RunerDePrivates {
    public static void main(String[] args){
       /*Hora
        Hora h1 = new Hora(12,30,45, "24");
        h1.setHoras(2);
        h1.setMinutos(50);
        h1.setSegundos(10);
        System.out.println("Formato: " + h1.getFormato());
        System.out.println("Hora: " + h1.getHoras() + ":" + h1.getMinutos() + ":" + h1.getSegundos());


        PuntoCentro p1= new PuntoCentro();
        Cadrado cadrado1= new Cadrado(2,1,5);
        System.out.println("Superficie do Cadrado: "+ cadrado1.calcularArea());
        System.out.println("Perimetro do Cadrado: "+ cadrado1.calcularPerimetro());
        Cilindro cilindro1=new Cilindro(3,3,3,2);
        System.out.println("Area do Cilindro: "+cilindro1.calcularArea());
        System.out.println("Voumen do Cilindro: "+cilindro1.calcularVolumen());
    */


        //queremos un nuevo nodo que añada uno inicial y quite uno inicial
        Lista2 lista2 = new Lista2();
        //añadir primero
        lista2.engadirPrimeiro(0);
        lista2.engadirPrimeiro(1);
        lista2.engadirPrimeiro(2);

        //quitar anterior
        lista2.quitarAnterior();
        System.out.println("Tamaño: " + lista2.getTamaño());








    }
}
