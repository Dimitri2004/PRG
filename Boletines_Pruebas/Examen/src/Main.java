public class Main {
    public static void main(String[] args) {
        TransporteContenedores B1=new TransporteContenedores("Ourense","jaimeSS",2009,"4006M",40,60,300,4,609,"02/34/2004",300,500,5);
        System.out.println(B1.aCadea());
        System.out.println(B1.calcularFactura());

        TransporteViaxeiros V1=new TransporteViaxeiros("Vigo","juan",2012,"86905M",78,50,200,4,568,"30/48/20012",500,true);
    System.out.println(V1.aCadea());
    System.out.println(V1.calcularFactura());
    }
}