public class Boletin_6_9 {
    public static void main(String[] args) {
       int num2;
       int num1;
       num1=0;
       num2=1;
        int ns = 0;
        int elementos = 10;
        for (int i = 0; i <= elementos; i++) {
            ns = sucesion(num1, num2);
            num1 = num2;
            num2 = ns;
        }
    }
    static int sucesion(int a, int b) {
        int suma =a+b;
        System.out.println(suma);
        return suma;
    }
}



