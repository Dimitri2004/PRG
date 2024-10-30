/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;

import java.util.Scanner;

/**Pasa de grados centigrados a grados kelvin
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin_extra_2_2 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double grados;
    System.out.println("A cuantos grados estamos?: ");
    grados=sc.nextDouble();
    System.out.println("Cuanto es en Kelvin?");
    double kelvin=(grados+273.15);
        System.out.println("Son: "+kelvin+" K");
        System.out.println("Y en Fharenheit? ");
    double fharenheit=(grados*(9/5)+32);
        System.out.println("Son "+fharenheit+" F");



    

    
    
    
    
    
    
    }
    
}
