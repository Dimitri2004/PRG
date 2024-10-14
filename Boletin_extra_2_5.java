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
public class Boletin_extra_2_5 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    float fijo=1300;
    float ventas;
    float distancia;
    float hora;
    
    System.out.println("Cuanto ganaste con las ventas?");
    ventas=sc.nextFloat();
    System.out.println("A que distancia estas del trabajo?");
    distancia=sc.nextFloat();
    System.out.println("Cuanto tardas en venir al trabajo?");
    hora=sc.nextFloat();
    double soldo_bruto=fijo+ventas*0.05+2*distancia+(hora/24)*30;
    System.out.println("Tu sueldo bruto es "+ soldo_bruto);
    double irpf=0.18*soldo_bruto;
    float ssocial=36;
    System.out.println("Tu sueldo liquido es "+(soldo_bruto-(irpf+ssocial)));
    
    
    
    }
}
