//Crear una tabla bidimensional de 5 asignaturas:Mates,Historia,Deporte,Compra,Piscina, mostrar horas de inicio y fin segun que asignatura me pida el usuario por consola y pedir el cambio o anulacion de una asignatura

import java.util.Scanner;

public class Boletin_7_2_1 {

    public static void main(String[] args) {
       String[][] tabla;
        Scanner sc = new Scanner(System.in);
        //Creamos la matriz
        tabla = new String[6][2];
        tabla[0][0] = "Mates";
        tabla[0][1] = "7:00-8:00";
        tabla[1][0] = "Historia";
        tabla[1][1] = "8:00-9:00";
        tabla[2][0] = "Deporte";
        tabla[2][1] = "9:00-10:00";
        tabla[3][0] = "Cocina";
        tabla[3][1] = "10:00-11:00";
        tabla[4][0] = "Piscina";
        tabla[4][1] = "11:00-12:00";
        tabla[5][0] = " ";
        tabla[5][1] = " ";

        System.out.println("\n"+"Horarios de cada Asignatura:");
        for(int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i][0] + " - " + tabla[i][1]);
        }
        opciones(tabla);

    }
    public static void opciones(String[][] tabla){
        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("\n" + "¿Que deseas hacer?");
        System.out.println("\n" + "1. Mostrar Horario\n" + "2. Cambiar Asignatura\n" + "3. Anular Asignatura\n"+"4.Añadir Asignatura \n" + "5. Salir");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                mostrarHorario(tabla);
                return;
            case 2, 4:
                cambiarAsignatura(tabla);
                return;
            case 3:
                anularAsignatura(tabla);
                return;
            case 5:
                System.out.println("Saliendo...");
                break;

            default:
                System.out.println("Opcion incorrecta");
                opciones(tabla);
                break;
        }
    }

    public static void cambiarAsignatura(String[][] tabla){
        Scanner sc = new Scanner(System.in);
            String n,p;

            for(int i = 0; i < tabla.length; i++) {
                    System.out.print("\n"+"Dime la asignatura que quieres cambiar:  ");
                    n=sc.next();
                    switch (n) {
                        case "Mates", "Historia", "Cocina", "Deporte", "Piscina":
                            System.out.println("Cual quieres aqui?:");
                            tabla[i][0] = sc.next();

                        System.out.println("Asignatura cambiada correctamente");
                        opciones(tabla);
                        break;
                    }

                if(tabla[i][0].equals(" ")){
                    System.out.print("\n"+"Dame una asignatura para añadir: ");
                    n=sc.next();
                    System.out.println("\n"+"Dame su duracion (hora:minutos-hora:minutos): ");
                    p=sc.next();
                    tabla[i][0]=n;
                    tabla[i][1]=p;
                    System.out.println("Asignatura añadida correctamente");
                    opciones(tabla);
                    return;
                }
            }
            sc.close();
    }
    public static void anularAsignatura(String[][] tabla){
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print("\n"+"Dame una asignatura para anular: ");
        n=sc.next();
        for(int i = 0; i <6; i++) {
            if(tabla[i][0].equals(n)){
                System.out.println("Asignatura anulada correctamente");
                tabla[i][0]=" ";
                tabla[i][1]=" ";
                opciones(tabla);
            }
        }
    }
    public static void mostrarHorario(String[][] tabla){
        System.out.println("\n"+"Asignaturas\t\tHorario");
        for (int i = 0; i < 6; i++) {
            System.out.println(tabla[i][0]+"\t\t"+tabla[i][1]);
        }
        System.out.println("\n");
        opciones(tabla);
    }
    }






