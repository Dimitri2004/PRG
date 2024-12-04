import java.util.Scanner;

public class practica_array_2 {
    public static void main(String[] args) {
        System.out.print("Dime una asignatura:");
        Scanner sc=new Scanner(System.in);
        String n=sc.next();

        String[][] horario={
                {"BD","BD","BD","BD","PRG","PRG","PRG"}
                ,{"BD","BD","BD","SI","SI","SASP","IPE"}
                ,{"PRG","PRG","PRG","LMXI","LMXI","COD","COD"},
                {"ING","ING","SI","SI","PRG","PRG","PRG"},
                {"COD","LMXI","LMXI","SI","SI","IPE","IPE"}

        };

        for(int fila=0;fila< horario.length;fila++) {
            for(int columna=0;columna<horario[0].length;columna++){
                n=horario[fila][columna];
                if (horario.equals(n)){
                    System.out.print(horario[fila][columna]);
                }
            }

        }

    }

}
