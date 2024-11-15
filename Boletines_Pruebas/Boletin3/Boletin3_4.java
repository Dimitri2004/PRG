/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;


import java.util.Scanner;
/**Dice el nombre de la persona que tiene mas peso despues de escribirlo en máquina
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin3_4 {
      public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
            /*Variables string para los nombres de las personas*/
    String nom1="Sabela";
    String nom2="Marcos";
            /*pregunta de valor int para recoger datos respuesta */
    System.out.println("Dame el peso de "+ nom1+":");
    int peso1=sc.nextInt();
    System.out.println("Dame el peso de "+ nom2+" :");
    int peso2=sc.nextInt();
            /*Condiicion de si pesa mas el primero q el segundo*/

          if (peso1>peso2){
                /*Salida de respuesta en caso de ser cierto q el primero pesa mas q el segundo*/
              System.out.println("Tiene mas peso "+nom1);
                /*Diferencia de peso*/
              System.out.println(nom1+" tiene  "+ (peso1-peso2)+" Kg mas de peso que "+nom2);
          }else{
                /*En caso de q la primera condicion sea falsa se cumpla esta*/
              System.out.println("Tiene mas peso "+nom2);
                /*Salida de diferencia*/
              System.out.println(nom2+" tiene  "+ (peso2-peso1)+" Kg mas de peso que "+nom1);
          }
          sc.close();

    }
    
}
