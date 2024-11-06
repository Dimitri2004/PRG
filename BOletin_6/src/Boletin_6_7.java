public class Boletin_6_7 {
    public  static void main(String[]args){
        int n = 5;
        System.out.println(factorial(n));

    }
    static long factorial( int n){
        long res;
        if (n==0) res = 1;
        else res = n * factorial( n-1);
        return res;
    }
}
