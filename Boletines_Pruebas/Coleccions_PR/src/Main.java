public class Main {
    public static void main(String[] args) {
        Contedor<Integer> num = new Contedor<Integer>();
        num.guardar(5);
        Integer n=num.extraer();
        System.out.println(n);
        Contedor<String> cod=new Contedor<String>();
        cod.guardar("Hola");
        String c= cod.extraer();
        System.out.println(c);



        Double[] temp=new Double[5];
        temp[0]=2.3;
        temp[1]=15.53;
        temp[2]=28.43;
        temp[3]=-5.63;
        temp[4]=9.3;

        ContedorElementos<Double> t=new ContedorElementos<Double>(temp);
        t.apilar(2.45);
        t.apilar(33.56);
        t.encolar(4.67);
        t.encolar(45.6);
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desapilar());
        System.out.println(t.desencolar());
        System.out.println(t.desencolar());
    }
}