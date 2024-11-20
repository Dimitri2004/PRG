import java.util.Arrays;
import java.util.Scanner;


public class BOLETIN_7_3 {
    public static void main(String[] args) {
        int[] nota = notas();
        String[] alum = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z", "Ad", "Bo", "Ca", "De", "Ga", "Lu"
        };

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del alumno: ");
        String nombreAlumno = scanner.nextLine();

        int resultado = obtenerNotaPorNombre(nombreAlumno, alum, nota);
        if (resultado != -1) {
            System.out.println("La nota del alumno " + nombreAlumno + " es: " + resultado);
        } else {
            System.out.println("No se encontró al alumno " + nombreAlumno);
        }

        scanner.close();
    }

    static int[] notas() {
        int[] nota = new int[30]; // crea un array de 30 numeros
        String[] alum = {
                "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "X", "Z", "Ad", "Bo", "Ca", "De", "Ga", "Lu"
        };

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

        // Imprimir los resultados
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
    static int obtenerNotaPorNombre(String nombre, String[] alum, int[] nota) {
        for (int i = 0; i < alum.length; i++) {
            if (alum[i].equals(nombre)) {
                return nota[i];
            }
        }
        return -1; // Si no se encuentra el alumno
    }
    }





















