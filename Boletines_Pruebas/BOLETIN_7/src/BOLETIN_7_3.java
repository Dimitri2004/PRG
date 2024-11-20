import java.util.Arrays;
import java.util.Scanner;
/**Crear comentrarios para cada linea**/

public class BOLETIN_7_3 {
    public static void main(String[] args) { //TODO
        int[] nota = notas();//notas
        String[] alum = {//alumnos
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z", "Ad", "Bo", "Ca", "De", "Ga", "Lu"
        };

        Scanner scanner = new Scanner(System.in);//Scanner para leer de la consola
        System.out.print("Ingrese el nombre del alumno: ");//salida por pantalla
        String nombreAlumno = scanner.nextLine();
        //Obtener la nota del alumno
        int resultado = obtenerNotaPorNombre(nombreAlumno, alum, nota);
        //Si se encontró al alumno
        if (resultado != -1) {
            System.out.println("La nota del alumno " + nombreAlumno + " es: " + resultado);
        } else {
            System.out.println("No se encontró al alumno " + nombreAlumno);
        }

        scanner.close();
    }
//Generar las notas y las ordenar de mayor a menor
    static int[] notas() {
        int[] nota = new int[30]; // crea un array de 30 numeros
        String[] alum = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z", "Ad", "Bo", "Ca", "De", "Ga", "Lu"
        };
        //Notas aleatorias y ordenarlas
        for (int i = 0; i < nota.length; i++) {
            nota[i] = (int) (Math.random() * 10) + 1; // crea numeros aleatorios entre 1 y 10
        }

        // Ordenar las notas de mayor a menor
        Arrays.sort(nota);
        for (int i = 0; i < nota.length / 2; i++) {
            int temp = nota[i];
            nota[i] = nota[nota.length - 1 - i];
            nota[nota.length - 1 - i] = temp;
        }

        // Condicionar los alumnos que aprobaron y obtuvieron la maxima nota
        for (int i = 0; i < nota.length; i++) {
            if (nota[i] >= 5) {
                System.out.println("Alumno " + alum[i] + " aprobo con " + nota[i]);
            }
            if (nota[i] == 10) {
                System.out.println("Alumno " + alum[i] + " obtuvo la maxima nota " + nota[i]);
            }
        }
        return nota;
    }
    // Buscar la nota del alumno por nombre
    static int obtenerNotaPorNombre(String nombre, String[] alum, int[] nota) {
        // Recorrer el array de alumnos y comparar con el nombre del alumno
        for (int i = 0; i < alum.length; i++) {
            if (alum[i].equals(nombre)) {
                return nota[i];
            }
        }
        return -1; // Si no se encuentra el alumno
    }
    }





















