/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;

import java.util.Scanner;

/**Dice que dandole una cantidad de billetes de distinta cantidad te da la suma en conjunto
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin_extra_2_3 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b1;
    int b2;
    int b3;
    int m;
    System.out.println("Cuantos Billetes de 100€ quieres:");
    b1=sc.nextInt();
     System.out.println("Cuantos Billetes de 20€ quieres:");
    b2=sc.nextInt();
     System.out.println("Cuantos Billetes de 5€ quieres:");
    b3=sc.nextInt();
    System.out.println("Cuantos monedas de 1€ quieres:");
    m=sc.nextInt();
    int total=b1*100+b2*20+b3*5+m*1;
    System.out.println("Entonces tu cambio tatal es: "+total);
    
    
    
    
    
    }
    
}
