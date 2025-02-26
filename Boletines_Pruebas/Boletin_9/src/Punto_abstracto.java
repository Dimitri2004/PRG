/*Tipo abstracto con 2 parametros
* variable x
* variable y
* getX(),getY(),setX(),setY()=>double,void
* aCadea()
*/
//Constructor de nuestro Punto_Base
public abstract class Punto_abstracto {
    private double x;
    private double y;

    public Punto_abstracto(){
        x=0;
        y=0;
    }
    public Punto_abstracto(double x, double y){
      setX(x);
      setY(y);
    }


    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public void setX(double x){
       if (x<0) this.x = 0;
       else this.x = x;
    }

    public void setY(double y){
        if (y<0) this.y = 0;
        else this.y = y;
    }

    public abstract String aCadea();
}
