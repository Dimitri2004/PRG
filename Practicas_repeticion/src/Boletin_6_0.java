/*Creas una repeticion de datos a partir de funciones
*
* @version 1.0
* @autor Dima Aparicio
*/




import java.util.Scanner;

public class Boletin_6_0 {
   public static void main(String[] args){
       String nomeEstudante=obterNome();
       saudos(3,"es");
       System.out.println("Benvido "+nomeEstudante);
       saudos(5,"gl");
       System.out.println("Otras tareas son:");
       saudos(2,"en");
   }

   static void saudos(int veces, String idioma){
       for(int i=0; i<veces; i++){
           if(idioma.equals("gl")) System.out.println("Ola");
           else if(idioma.equals("es")) System.out.println(("Hola"));
           else if(idioma.equals("en")) System.out.println("Hello");

       }
   }
   static String obterNome(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Escribe o teu nome: ");
       String nome = sc.next();
       sc.close();
       return nome;
   }





}
