public class Cadrado extends FXeometrica{
    private double lado;
    public Cadrado(double l){
        super();
        setLado(l);
    }
    public Cadrado (double x, double y, double l){
        super(x,y);
        setLado(l);
    }
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = Math.abs(lado);
    }
    public double calcularPerimetro(){
        return lado*4;
    }
    public double calcularArea(){
        return lado*lado;
    }
    public String aCadea(){
        return "El cadrado de lado " + lado +"x= "+ getX() +" y= "+ getY() ;
    }



}
