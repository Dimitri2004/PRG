import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        int[][] habitacion = new int[4][6];
        opciones(habitacion);


    }
    static void nombrereserva(int[][] habitacion){
        int numeroHabitacion;
        String[][] reserva = new String[4][6];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el número de habitación que deseas reservar: ");
        numeroHabitacion = scanner.nextInt();
        System.out.println("Introduce el nombre de la reserva: ");
        String nombreReserva = scanner.next();
        if (habitacion[numeroHabitacion / 6][numeroHabitacion % 6] == 0) {
            System.out.println("La habitación no está reservada");
        } else {
            reserva[numeroHabitacion / 6][numeroHabitacion % 6] = nombreReserva;
            System.out.println("Nombre de la reserva modificado con éxito");
        }

    }
    static void opciones(int[][] habitacion) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Que deseas hacer?");
        System.out.println("1. Reservar Habitacion");
        System.out.println("2. Mostrar Habitaciones");
        System.out.println("3. Anula Habitacion");
        System.out.println("4. Cambiar Habitacion");
        System.out.println("5.Salir");
        opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                reservarHabitacion(habitacion);
                break;
            case 2:
                mostrarHabitacionesconNombre(habitacion);
                break;
            case 3:
                anularHabitaciones(habitacion);
                break;
            case 4:
                cambiarHabitacion(habitacion);
                break;

            case 5:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción incorrecta");
                opciones(habitacion);
                break;
        }

    }

    static void reservarHabitacion(int[][] habitacion) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿En que planta estas reservando?: ");
        int planta = sc.nextInt();
        System.out.println("¿En que habitación deseas reservar?: ");
        int habitacionNum = sc.nextInt();
        if (habitacion[planta - 1][habitacionNum - 1] == 0) {
            habitacion[planta - 1][habitacionNum - 1] = 1;
            nombrereserva(habitacion);
            System.out.println("Habitación reservada correctamente.");
            opciones(habitacion);
        }
        else
        {
        System.out.println("La habitación ya está reservada.");
        opciones(habitacion);
    }



    }
    static void mostrarHabitacionesconNombre(int[][] habitacion){
        Scanner sc=new Scanner(System.in);
        String[] reserva=new String[]{sc.next()};
        for(int i=0;i<4;i++){
            for(int j=0;j<6;j++){
                if(habitacion[i][j]==1){
                    System.out.println("Planta: " + (i+1) + ", Habitación: " + (j+1) + ", Estado: Reservada, Nombre de Reserva: " + reserva[i]);
                }
            }
        }
        opciones(habitacion);
    }
    static void anularHabitaciones(int[][] habitacion){
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿En que planta estas anulando?: ");
        int planta = scanner.nextInt();
        System.out.println("¿En que habitación deseas anular?: ");
        int habitacionNum = scanner.nextInt();
        if(habitacion[planta-1][habitacionNum-1]==1){
            habitacion[planta-1][habitacionNum-1]=0;
            System.out.println("Habitación anulada correctamente.");
            opciones(habitacion);
        }
        else{
            System.out.println("La habitación no está reservada.");
            opciones(habitacion);
        }
    }
    static void cambiarHabitacion(int[][] habitacion) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿En que planta estas cambiando?: ");
        int planta = scanner.nextInt();
        System.out.println("¿Que habitacion quieres cambiar?: ");
        int habitacionNum = scanner.nextInt();
        System.out.println("A q planta quieres cambiar:");
        int nuevaPlanta = scanner.nextInt();
        System.out.println("A q habitación quieres cambiar:");
        int nuevaHabitacionNum = scanner.nextInt();

        if (habitacion[planta - 1][habitacionNum - 1] == 1 && habitacion[nuevaPlanta - 1][nuevaHabitacionNum - 1] == 0) {
            habitacion[planta - 1][habitacionNum - 1] = 0;
            habitacion[nuevaPlanta - 1][nuevaHabitacionNum - 1] = 1;
            System.out.println("Habitación cambiada correctamente.");
        } else {
            System.out.println("No se puede realizar el cambio. Verifica que la habitación original esté ocupada y la nueva esté libre.");
        }

        opciones(habitacion);
    }


}
