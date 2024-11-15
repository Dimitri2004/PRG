/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;
import java.util.Scanner;
/**Te dice si un numero es positivo
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin3_1 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
        /*Crea la variable numero*/
    System.out.println("Dame un numero: ");
    int a;
    a=sc.nextInt();
        /*Condicion para saber si un numero es positivo o no*/
    if (a>0){
        /*Salida de datos*/
        System.out.println("El numero "+a+" es positivo");
    
    }else{}
    
    sc.close();
    
    }
    
}
