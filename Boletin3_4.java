/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;


import java.util.Scanner;
/**
 *
 * @author dam
 */
public class Boletin3_4 {
      public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String nom1="Sabela";
    String nom2="Marcos";
    System.out.println("Dame el peso de "+ nom1+":");
    int peso1=sc.nextInt();
    System.out.println("Dame el peso de "+ nom2+" :");
    int peso2=sc.nextInt();
    if (peso1>peso2){
        System.out.println("Tiene mas peso "+nom1);
        System.out.println(nom1+" tiene  "+ (peso1-peso2)+" Kg mas de peso que "+nom2);
    }else{
        System.out.println("Tiene mas peso "+nom2);
        System.out.println(nom2+" tiene  "+ (peso2-peso1)+" Kg mas de peso que "+nom1);
    } 
    sc.close();
    }
    
}
