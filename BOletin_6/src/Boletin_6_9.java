public class Boletin_6_9 {
    public static void main(String[] args) {
       suma(0);

    }


    static long suma(int n) {
        int a1;
        int m;
        for (m = 1; m <=10; m++) {
            if (m<n) {

                a1= m + (-1*n);

                System.out.println(a1++);
                return n=-1;
            }
            else {
                a1= m + (-1*n);
                System.out.println(a1++);
                return n=1;
            }
        }

        return n;
    }
}