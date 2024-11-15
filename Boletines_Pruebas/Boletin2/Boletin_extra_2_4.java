/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;

import java.util.Scanner;

/**Da cambio desglosado desoues de escribirle por consola la cantidad que quieres separa
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin_extra_2_4 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        /*Variable int de la cantidad total*/
    int dinero;
    System.out.println("Cuanto es el dinero que necesitas: ");
    dinero=sc.nextInt();
        /*Operaciones necesarias para que nos quedemos con el numero de centimos final*/
    int n1=dinero/100;
    int dinero1=dinero-(n1*100);
    int n2=dinero1/20;
    int dinero2=dinero1-(n2*20);
    int n3=dinero2/5;
    int dinero3=dinero2-(n3*5);
    int m=dinero3/1;
        /*Salida del resultado por partes*/
    System.out.println("Necesitamos "+n1+" billetes de 100€ "+" , "+n2+" billetes de 20€"+" , "+n3+" billetes de 5€ "+" , "+m+" monedas de 1€");
    
    
    
    
    
    
    
    }
    
}
