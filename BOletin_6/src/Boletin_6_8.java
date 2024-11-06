public class Boletin_6_8 {
    public  static void main(String[]args){
        int m = 0;
        int n = 5;
        System.out.println(elevar(n,m));

    }

    static long elevar(int m, int n){
        long res;
        if (n==0) res = 1;
        else res = n* elevar (m,1);
        return res;
    }

}
