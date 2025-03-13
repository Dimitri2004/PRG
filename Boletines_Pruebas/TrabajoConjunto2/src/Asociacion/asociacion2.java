package Asociacion;

public abstract class asociacion2 {
    private String Nombre;
    private String Dni;
    public asociacion2(String Nombre, String Dni) {
        this.Nombre = Nombre;
        setLetraDni(Dni);
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public void setLetraDni(String Dni) {
        int res;
        res = Dni.length()%23;
        //Creamos el array correspondiente a las letras que utilizan los DNIs
        String[] letra = {"T", "R", "W", "A", "G ", "M ", "Y", "F", "P", "D", "X",
                "B", "N", "J", "Z ", "S ", "Q", "V", " H ", "L ", "C ", "K", "E"};
        //Asignamos la letra correspondiente al DNI
        if (Dni.length() == 8) {
            this.Dni = Dni + letra[res];
        } else {
            this.Dni = " Dni incorrecto";
        }
    }
    public String getLetraDni() {
        return Dni;
    }
    public abstract String toString();

public abstract double calculargastosIngresos();
}
