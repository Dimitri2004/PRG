public class BOLETIN_7_2 {
    public static void main(String[] args) {
        notas();
    }

    static void notas() {
        int[] nota = new int[30];/**crea un array de 30 numeros**/
        int num = 0;/**variable num**/
        int res = 0;/**variable res**/

        for(int i = 1; i < nota.length; ++i) {
            nota[i] = (int)Math.floor(Math.random() * 10.0) + 1;/**crea numeros aleatorios entre 1 y 10**/
            if (nota[i] < 5) {/**hace que una condicion se cumpla para una nota menor que 5**/
                System.out.println("Suspenso =" + nota[i]);/**saca la nota menor a 5 por pantalla**/
            } else if (nota[i] == 10) {
                System.out.println("La maxima nota = " + nota[i]);
            } else {
                System.out.println("Aprobado = " + nota[i]); /**Salida de aprobados, superiores o iguales a 5**/
            }
            num = nota[i];/**operacion suma de arrays**/
            res += num;/**operacion suma de arrays**/
        }

        System.out.println(res);/**salida de operacion**/
    }
}
