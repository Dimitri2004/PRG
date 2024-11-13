/**
*@author Dima Aparicio
*@version 1.0
**/
public class BOLETIN_7_1 {

        public static void main(String[] args) {
            int[] num = new int[6];/**crea un array de 6 numeros**/

            int j;
            for(j = 0; j < num.length; ++j) {
                num[j] = (int)Math.floor(Math.random() * 51.0);/**genera numeros aleatorios enterso entre 0 y 50**/
            }

            for(j = num.length - 1; j > 0; --j) {
                System.out.println(num[j]);/**lee los numeros generados del anterior del reves**/
            }

        }

}
