/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;

import java.util.Scanner;

/**Da valores a positivos negativos y nulos con sus repectivos simbolos
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin3_3 {
      public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
            /*Pedimos variable por consola*/
    System.out.println("Dame un numero: ");
    int a;
    a=sc.nextInt();
            /*Creamos una funcion de condicion para los casos del numero que nos escriba en maquina*/
    if (a>0){
        System.out.println("+");
    
    }else{}
    if(a<0){
    System.out.println("-");
    }{}
    if (a==0){
        System.out.println("0");
    }else{}
    
    sc.close();
    
    }
    
    
}
