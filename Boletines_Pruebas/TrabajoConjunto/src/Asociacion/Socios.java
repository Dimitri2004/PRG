package Asociacion;

public class Socios extends asociacion implements GastosIngresos {
    private String Dirección;
    private String Provincia;
    private int DataAlta;
    private int cuota;

    public Socios(String Nombre, String Dni, String Dirección, String Provincia, int dataAlta, int cuota) {
        super(Nombre, Dni);
        this.Dirección = Dirección;
        this.Provincia = Provincia;
        setDataAlta(dataAlta);
        setCuota(cuota);
    }
    public String getDirección() {
        return Dirección;
    }
    public void setDirección(String Dirección) {
        this.Dirección = Dirección;
    }
    public String getProvincia() {
        return Provincia;
    }
    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    public int getDataAlta() {
        return DataAlta;
    }
    public void setDataAlta(int dataAlta) {
        this.DataAlta = Math.abs(dataAlta);
    }
    public int getCuota() {
        return cuota;
    }
    public void setCuota(int cuota) {
        if (cuota<0){
            System.out.println("Cuota incorrecta");
        }else {
            this.cuota = Math.abs(cuota);
        }
    }
    public String toString() {
        return "Asociacion.Socios{" + "Nombre=" + getNombre() + ", Dni=" + getDni() + ", Direccion=" + Dirección + ", Provincia=" + Provincia + ", DataAlta=" + DataAlta + ", cuota=" + cuota + '}';
    }
    public double calcularGastosIngresos(){
        return cuota;
    }
}
