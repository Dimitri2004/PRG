import java.io.Serializable;
import java.util.Scanner;

public class Cliente implements Serializable {
    private  String id;
    private  String nombre;
    private  int telefono;

    public Cliente() {
        setId();
        setNombre();
        setTelefono();
        }

    public String getId() {
        Scanner sc = new Scanner(System.in);
            System.out.println("El id debe ser de un solo caracter");
            id = sc.nextLine();

        return id;
    }

    public void setId() {
        getId();
    }

    public int getTelefono() {
        Scanner sc = new Scanner(System.in);
        while (telefono < 100000000 || telefono > 999999999) {
            System.out.println("El telefono debe ser de 9 digitos");
            telefono = sc.nextInt();
        }
        return telefono;
    }

    public void setTelefono() {
        getTelefono();
    }

    public String getNombre() {
        Scanner sc = new Scanner(System.in);
            System.out.println("El nombre debe tener al menos 3 caracteres");
            nombre = sc.nextLine();
        return nombre;
    }
    public void setNombre() {
        getNombre();
    }

    public String toString() {
        return "id=" + getId() + ", nombre=" + getNombre() + ", telefono=" + getTelefono() ;
    }

}
