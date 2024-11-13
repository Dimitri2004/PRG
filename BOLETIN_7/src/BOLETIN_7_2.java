public class BOLETIN_7_2 {
    public static void main(String[] args) {
        notas();
    }

    static void notas() {
        int[] nota = new int[30];
        int num = 0;
        int res = 0;

        for(int i = 1; i < nota.length; ++i) {
            nota[i] = (int)Math.floor(Math.random() * 10.0) + 1;
            if (nota[i] < 5) {
                System.out.println("Suspenso =" + nota[i]);
            } else if (nota[i] == 10) {
                System.out.println("La maxima nota = " + nota[i]);
            } else {
                System.out.println("Aprobado = " + nota[i]);
            }
            num = nota[i];
            res += num;
        }

        System.out.println(res);
    }
}