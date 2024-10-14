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
public class Boletin2_5 {
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Dime en que milla te encuentras?:");
    long milla;
    milla=s.nextLong();
    double metro=(milla*1.852);
    System.out.println("Entonces son "+ metro +" kilometros");
 s.close();
    }
}