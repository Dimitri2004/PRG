public class Practica_array_boolean {
    public static void main(String[] args) {
        boolean[][] asentos = {{true, true, true, false},
                {false, true, true, false},
                {false, true, false, false},
                {false, false, false, false}};
        /*Tabla= new boolean[4][4];
        tabla[0][0] = true;
        tabla[0][1] = true;
        tabla[0][2] = true;
        tabla[0][3] = false;
        tabla[1][0] = false;
        tabla[1][1] = true;
        tabla[1][2] = true;
        tabla[1][3] = false;**/

        for (int fila = 0; fila < asentos.length; fila++) {
            for (int columna = 0; columna < asentos[0].length; columna++) {

                if(asentos[fila][columna]==true) {
                    System.out.print("o");
                }else{
                    System.out.print("x");
                }
            }
            System.out.print("\n");
        }
    }
}







