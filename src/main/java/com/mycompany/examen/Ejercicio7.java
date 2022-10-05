/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.examen;
import java.util.*;
/**
 *
 * @author Usuario
 */
public class Ejercicio7 {
    public static void main(String args[]) {
        Scanner dato=new Scanner(System.in);
        float notas[]=new float[6];
        int con=1;
        float promedio,sum=0;
        while(con<6) { 
            System.out.println("Ingrese la " + con + "° nota : ");
            notas[con]=dato.nextFloat(); sum=sum+notas[con];
            con++; } 
        promedio=sum/5; 
        System.out.println("Su promedio es : " + promedio); 
    } 
}