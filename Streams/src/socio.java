public class socio {
    String dni;
    String nombre;

    public socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    public String toString(){
        return "Socio" + nombre + " con dni " + dni;
    }
}
