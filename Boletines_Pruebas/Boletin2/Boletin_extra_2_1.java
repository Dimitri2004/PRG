/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;
import java.util.Scanner;
/**Calcula la oferta de un producto en el momento de comprarlo
 *@version 1.0
 * @author Dima Aparicio
 */
public class Boletin_extra_2_1 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double producto;
    double precio;
    double oferta;
    System.out.println("Cuanto cuesta el producto:");
    producto=sc.nextDouble();
    System.out.println("Cuanto es el precio del producto con descuento?: ");
    precio=sc.nextDouble();
    System.out.println("Cual es el porcentaje del descuento? ");
    oferta=(precio/producto)*100;
    System.out.println("La oferta es de "+ oferta + "  %");
    
    
    
    
    
    
    }
    
}
