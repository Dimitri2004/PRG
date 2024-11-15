/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielcastelao.newproyect.Proyectos.Prog;
import java.util.Scanner;
/**Paso de millas a metros
 *@version 1.1
 * @author Dima Aparicio
 */
public class Boletin2_5 {
    public static void main(String[] args){
    Scanner s= new Scanner(System.in);
        /*Preguntar variable int por consola*/
    System.out.println("Dime en que milla te encuentras?:");
    long milla;
    milla=s.nextLong();
        /*Operacion para el calculo de millas a metros*/
    double metro=(milla*1.852);
        /*salida del resultado de la operacion*/
    System.out.println("Entonces son "+ metro +" kilometros");
 s.close();
    }
}
