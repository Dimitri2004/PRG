public class Prg_practica_1 {
    public static void main(String[] args){
        String apelido=" Ramon";
        String nome="José";
        char[] nom={'a', 'b', 'c', 'd', 'e'};
        String nomeCompleto=nome.concat(apelido);
        System.out.println(apelido.length());//Funcion
        System.out.println(nom.length);//Metodo
        System.out.println(nomeCompleto); //Concatenar Strings
        String[] s=nome.split(" ");
    }
}
