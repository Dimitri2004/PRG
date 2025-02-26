/*tipo abstracta sin parametros
* operaciones calcularPerímetro() [double],calcularArea() [double],aCadea()
* deriba de punto_abstracto
*/
//Clase abstracta que esta extendida de nuestro punto
public abstract class FXeometrica extends Punto_abstracto{
    public FXeometrica(){
        super();
    }
    public FXeometrica(double x, double y){
        super(x,y);
    }
    public double calcularPerimetro(){
        return 0.0;
    }
    public abstract double calcularArea();

}
