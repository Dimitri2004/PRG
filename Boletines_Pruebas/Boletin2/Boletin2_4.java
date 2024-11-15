/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;
import java.util.Scanner;
/**Calculo de varias operaciones con dos variable escritas por consola
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin2_4 {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Dame tu primera variable: ");
    double a;
        /*Variable double del primer numero*/
    a=s.nextLong();
    System.out.println("Dame tu siguiente variable:");
    double b;
        /*variable double del segundo numero*/
    b=s.nextLong();
        /*salida de las operaciones entre las variables dadas*/
    System.out.println("La sume de estos es:"+(a+b));
    System.out.println("La resta de los dos es:"+(a-b));
    System.out.println("El producto entre ellos es: "+a*b);
    System.out.println("Su cociente es:"+a%b);
 s.close();
    }   
}
