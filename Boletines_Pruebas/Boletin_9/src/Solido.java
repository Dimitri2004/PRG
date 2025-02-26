/*Tipo abstracta sin parametros
*operacion calcularVolumen()
*deriba de FXeometrica
*/
public abstract class Solido extends FXeometrica{
    public Solido(){
        super();
    }
    public Solido(double x, double y){
    super(x,y);
    }
    public abstract double calcularVolumen();

}
