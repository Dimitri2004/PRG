/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;

import java.util.Scanner;

/**Calcula la suma o resta de valores que son uno menor que otro
 *@version 1.0
 * @author Dima Aparicio
 */
public class Boletin3_2 {
      public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Dame un numero: ");
    short a;
    short b;
    a=sc.nextShort();
    System.out.println("Dame otro numero: ");
    b=sc.nextShort();
    
    if (a>=b){
        System.out.println("Su resta es: "+ (a-b));
    
    }else{
    System.out.println("La suma es:"+(a+b));
    }
    
    sc.close();
    
    }
}
