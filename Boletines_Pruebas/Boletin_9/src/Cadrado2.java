public class Cadrado2 {
    private double lado;
    public Cadrado2(double l){
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



}
