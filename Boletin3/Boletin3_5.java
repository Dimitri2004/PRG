/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;
import java.util.Scanner;
/**Ordena de mayor a menor los numero colocados en consola
 *@version 1.1
 * @author Dima Aparicio 
 */
public class Boletin3_5 {
    public static void main(String[] args){
    double n1;
    double n2;
    double n3;

    Scanner sc=new Scanner(System.in);
    System.out.println("Dame el primer numero: ");
    n1=sc.nextDouble();
    System.out.println("Dame el segundo numero: ");
    n2=sc.nextDouble();
    System.out.println("Dame el tercer numero: ");
    n3=sc.nextDouble();
    if (n3<n2){/*n3*/
        if (n3<n1){
            System.out.println("n2>n1>n3");
        }else{}}
    if (n1>n2){
        if (n2>n3){
            System.out.println("n1>n2>n3");
        }else{
            System.out.println("n1>n3>n2");
        }
    }
    if (n1<n3){/*n1*/ 
       if(n2>n3){
                System.out.println("n2>n3>n1");
        }else{/*n2*/                     
         if(n2>n1){
            System.out.println("n3>n2>n1");
        }else{
             System.out.println("n3>n1>n2");
         }
    }
    
  }
}
}
    
    
