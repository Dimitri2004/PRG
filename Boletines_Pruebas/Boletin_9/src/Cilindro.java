public class Cilindro extends Solido{
    private double radio;
    private double altura;
    public Cilindro(double r,double h){
        super();
        setRadio(r);
        setAltura(h);
    }
    //Damos parametros a nuestra figura implementada
    public Cilindro(double r, double h, double x, double y){
        super(x, y);
        setRadio(r);
        setAltura(h);
    }
    public double getRadio() {
        return radio;
    }
    public double getAltura() {
        return altura;
    }
//Setter y operacions obligatorias de los abstractos anteriores para poder implementar la figura
    public void setRadio(double radio) {
        this.radio = Math.abs(radio);
    }
    public void setAltura(double altura) {
        this.altura = Math.abs(altura);
    }
    public double calcularArea(){
        return 2*Math.PI*radio*altura;
    }
    public double calcularVolumen(){
        return Math.PI*Math.pow(radio,2)*altura;
    }
    //Cadena de ejecucion de la figura sacando radio altura y sus puntos heredados desde atrás

    public String aCadea(){
        return "El cilindro de radio " + radio + " y altura " + altura + "x= "+ getX() +" y= "+ getY() ;
    }


}
