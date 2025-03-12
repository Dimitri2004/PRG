package Asociacion;


public class Socios extends asociacion implements GastosIngresos {
    private String direccion;
    private String Provincia;
    private int dataAlta;
    private int cuota;


    public Socios(String Nombre, String Dni, String Direccion, String Provincia, int dataAlta, int cuota) {
        super(Nombre, Dni);
        this.direccion = Direccion;
        this.Provincia = Provincia;
        this.dataAlta = dataAlta;
        setCuota(cuota);
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }
    public String getProvincia() {
        return Provincia;
    }
    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    public int getdataAlta() {
        return dataAlta;
    }
    public void setdataAlta(int dataAlta) {
        this.dataAlta = dataAlta;

    }
    public int getCuota() {
        return cuota;
    }
    public void setCuota(int cuota) {
        if (cuota<0) {
            this.cuota = 0;
        }else {
            this.cuota = cuota;
        }

    }
    @Override
    public String toString() {
        return "Socios{" + "Nombre=" + getNombre() + ", Dni=" + getLetraDni()+ ", Direccion=" + direccion + ", Provincia=" + Provincia + ", DataAlta=" + dataAlta + ", Cuota=" + cuota + '}';
    }
    public double calcularGastosIngresos(){
        return cuota;

    }
}
