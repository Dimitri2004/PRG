public class Boletin_7_1 {
    public static void main(String[] args){
        int[] num=new int[6];//Delimita los numeros pedido empleando el array
        for(int i=0;i<num.length;i++) {//Da numeros aleatorios dentro del rango indicado en el Mat.random
            num[i] = (int) Math.floor(Math.random()*51);
        }
        for(int j=num.length-1;j>0;j--){//Lee los numeros del anterior for de forma inversa
            System.out.println(num[j]);//Salida de datos
        }
    }
}
