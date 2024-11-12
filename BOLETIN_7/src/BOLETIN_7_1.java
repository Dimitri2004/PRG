//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class BOLETIN_7_1 {

        public static void main(String[] args) {
            int[] num = new int[6];

            int j;
            for(j = 0; j < num.length; ++j) {
                num[j] = (int)Math.floor(Math.random() * 51.0);
            }

            for(j = num.length - 1; j > 0; --j) {
                System.out.println(num[j]);
            }

        }

}